package J;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args){
		byte[] a = {(byte)0x08,(byte)0x08,(byte)0x08,(byte)0x08};
		Neeva neeva = new Neeva();
		neeva.init(a);
		neeva.sBox();
		neeva.feistal();
		neeva.rotate();
		neeva.addAndMod(0);
		byte temp = (byte) 0xba;
		System.out.println(temp);
	}
}
