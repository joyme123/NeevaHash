package J;

public class Neeva {
	
	private static byte[] S_BOX = {12,5,6,11,9,0,10,13,3,14,15,8,4,7,1,2};
	private byte[] register = {0,0,0,0,0,0,0,0,
							   0,0,0,0,0,0,0,0,
							   0,0,0,0,0,0,0,0,
							   0,0,0,0,0,0,0,0}; 
	
	//输入一个32位的message
	public void init(byte[] message){
		for(int i = 0; i < message.length; i++){
			register[i] = (byte) (register[i] ^ message[i]);
			//System.out.println(register[i]);
		}
		
	}
	
	private void sBox(){
		for(int i = 0; i < register.length; i++){
			byte h4 = Neeva.S_BOX[(byte)((register[i] & 0xf0) >> 4)];
			byte l4 = Neeva.S_BOX[(byte)(register[i] & 0x0f)];
			register[i] = (byte) ((h4 << 4) | l4);
			//System.out.println(register[i]);
		}
	}
	
	private void feistal(){
		for(int i = 0; i < register.length; i+=8){
//			byte base = (byte)( (register[i+1] & 0x0f) | ((register[i+1] & 0x0f) << 4) );
//			//System.out.println((base));
//			register[i+1] = (byte) (register[i+1] ^ (base&0xf0));
//			register[i+1] = (byte) (register[i+1] ^ (base));
			register[i+0] = (byte) (register[i+0] ^ register[i+6]);
			register[i+1] = (byte) (register[i+1] ^ register[i+7]);
			
			register[i+2] = (byte) (register[i+2] ^ register[i+6]);
			register[i+3] = (byte) (register[i+3] ^ register[i+7]);
			
			register[i+4] = (byte) (register[i+4] ^ register[i+6]);
			register[i+5] = (byte) (register[i+5] ^ register[i+7]);
			
//			System.out.println(Util.byteToHexString(register[i+0]));
//			System.out.println(Util.byteToHexString(register[i+1]));
//			System.out.println(Util.byteToHexString(register[i+2]));
//			System.out.println(Util.byteToHexString(register[i+3]));
//			System.out.println(Util.byteToHexString(register[i+4]));
//			System.out.println(Util.byteToHexString(register[i+5]));
//			System.out.println(Util.byteToHexString(register[i+6]));
//			System.out.println(Util.byteToHexString(register[i+7]));
		}
	}
	
	//循环左移8位
	private void rotate(){
		byte temp = register[0];
		for(int i = 0; i < register.length-1; i++){
			register[i] = register[i+1];
		}
		register[register.length-1] = temp;
		
//		for(int i = 0; i < register.length; i++){
//			System.out.println(register[i]);
//		}
	}
	
	private void addAndMod(int round){
		byte[] rc = Constants.ROUNDCONTANTS[round];
		byte n = 0;						//代表要进位得值
		for(int i = 0; i < register.length; i+=2){
			byte lh4 = (byte) (rc[i*2 + 2]<< 4);
			byte ll4 = rc[i*2 + 3];
			byte addition = (byte) (lh4 | ll4);				//11000111   -57
			byte sum = (byte) (addition + register[i+1]);		//10111010   -70  register[i]  -13  11110011
			/****写到这里，判断有没有进位*****/
			if(Util.isCarryBit(addition, register[i+1])){
				n = 0x01;
			}else{
				n = 0x00;
			}
			register[i+1] = sum;

			
			/*******高8位操作*********/
			byte hh4 = (byte) (rc[i*2] << 4);
			byte hl4 = rc[i*2 + 1];
			byte haddition = (byte) (hh4 | hl4);					//10110001 -79
			byte hsum = (byte) (haddition + register[i] + n);	//10100101 -90 register[i] -13 11110011 n 00000001		
			register[i] = hsum ;								//只保留8位，相当于mod2^16
//			System.out.println(register[i]);
//			System.out.println(register[i+1]);
			
		}
	}
	
	private  void gFunction(int round){
		sBox();
		feistal();
		rotate();
		addAndMod(round);
	}
	
	public  void fFunction(){
		
		for(int i = 0; i < 32 ; i++){
			gFunction(i);
			//System.out.println("********************************************");
		}
	}
	
	public byte[] squeezing(){
		byte[] reslut = new byte[28];		//28*8 = 224
		//byte[] temp = new byte[32];
		
//		for(int i = 0; i < register.length; i++){
//			temp[i] = register[i];
//		}
		
		for(int i = 0; i < 7;i++){
			for(int j = 0; j < 4; j++){
				reslut[i*4 + j] = register[j];
				//System.out.println(register[j]);
			}
			if(i != 6)
				fFunction();
		}
		return reslut;
	}
}
