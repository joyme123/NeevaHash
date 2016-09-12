package J;

public class Util {
	/**
	 * 计算一个byte的值（无符号位)
	 * @return
	 */
	public static int byteValue(byte a){
		return a&0x0FF;
	}
	/**
	 * 比较两个无符号8位数大小，如果 a>=b 返回true 否则false
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean compare8Bit(byte a,byte b){
		return byteValue(a) > byteValue(b);
	}
	
	/**
	 * 判断两个八位数相加是否进位，有进位 true 无进位 false
	 * @return
	 */
	public static boolean isCarryBit(byte a,byte b){
		return byteValue(a)+byteValue(b) > 255;
	}
	
	public static String byteToHexString(byte a){
		return Integer.toHexString((a & 0x000000FF) | 0xFFFFFF00).substring(6);
	}
}
