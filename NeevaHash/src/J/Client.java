package J;

public class Client {
	public static void main(String[] args){
		byte[] a = {(byte)0xa8,(byte)0x00,(byte)0x00,(byte)0x01};
		Neeva neeva = new Neeva();
		neeva.init(a);
		neeva.fFunction();
		byte[] result = neeva.squeezing();
		for(int i = 0;i < result.length;i++){
			System.out.print(Util.byteToHexString(result[i]));
			if((i + 1) % 4 ==0){
				System.out.println();
			}
		}
		
		for(int i = 0; i < a.length; i++){
			System.out.print(Util.byteToHexString(a[i]));
		}
	}
}
