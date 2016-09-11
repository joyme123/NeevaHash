package J;

import java.util.ArrayList;

import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

public class Neeva {
	
	private static byte[] S_BOX = {12,5,6,11,9,0,10,13,3,14,15,8,4,7,1,2};
	private byte[] register = {0,0,0,0,0,0,0,0,
							   0,0,0,0,0,0,0,0,
							   0,0,0,0,0,0,0,0,
							   0,0,0,0,0,0,0,0}; 
	
	//输入一个32位的message
	public void init(byte[] message){
		for(int i = 0; i < message.length; i++){
			register[i] = (byte) (register[i] | message[i]);
			//System.out.println(register[i]);
		}
		
		
	}
	
	public void sBox(){
		for(int i = 0; i < register.length; i++){
			byte h4 = Neeva.S_BOX[(byte)((register[i] & 0xf0) >> 4)];
			byte l4 = Neeva.S_BOX[(byte)(register[i] & 0x0f)];
			register[i] = (byte) ((h4 << 4) | l4);
			//System.out.println(register[i]);
		}
	}
	
	public void feistal(){
		for(int i = 0; i < register.length; i+=2){
			byte base = (byte)( (register[i+1] & 0x0f) | ((register[i+1] & 0x0f) << 4) );
			//System.out.println((base));
			register[i] = (byte) (register[i] | base);
			register[i+1] = (byte) (register[i+1] | base);
			//System.out.println(register[i]);
			//System.out.println(register[i+1]);
		}
	}
	
	//循环左移8位
	public void rotate(){
		byte temp = register[0];
		for(int i = 0; i < register.length-1; i++){
			register[i] = register[i+1];
		}
		register[register.length-1] = temp;
		
		for(int i = 0; i < register.length; i++){
			System.out.println(register[i]);
		}
	}
	
	public void addAndMod(int round){
		byte[] rc = Constants.ROUNDCONTANTS[round];
		byte n = 0;						//代表要进位得值
		for(int i = 0; i < register.length; i+=2){
			byte lh4 = (byte) (rc[i*2]<< 4);
			byte ll4 = rc[i*2 + 1];
			byte addition = (byte) (lh4 | ll4);				//11000111   -57
			byte sum = (byte) (addition + register[i]);		//10111010   -70  register[i]  -13  11110011
			/****写到这里，判断有没有进位,可以从相加后保留的8位和两个加数相比较来判断*****/
			
			register[i] = (byte) (sum | 0xff);
			System.out.println(register[i]);
			
			/*******高8位操作*********/
			byte hh4 = (byte) (rc[i*2+2] << 4);
			byte hl4 = rc[i*2 + 3];
			byte haddition = (byte) (hh4 | hl4);
			int hsum = (byte) (haddition + register[i] + n);			
			register[i] = (byte) (sum | 0xff);			//只保留8位，相当于mod2^16
			System.out.println(register[i]);
			
		}
	}
	
	private ArrayList<Byte> gFunction(byte b){
		
		return null;
	}
	
	private byte[] fFunction(){
		
		return null;
	}
}
