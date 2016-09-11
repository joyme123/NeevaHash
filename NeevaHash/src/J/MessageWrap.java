package J;

import java.util.ArrayList;

public class MessageWrap {
	private static byte MIDBYTE = 0x00;			    //00000000
	private static byte STARTBYTE = (byte)128;		//10000000
	private static byte ENDBYTE = 0x01;			    //00000001
	private static byte SEBYTE = (byte)129;			//10000001
	
	public int get1Position(byte b){
		int i = 0;
		while(true){
			if(Math.pow(2, i) > b){
				return i;
			}
			i++;
		}
	}
	
	
	public static ArrayList<ArrayList<Byte>> getMessageBlock(String message){
		ArrayList<Byte> tempbytes = new ArrayList<>();
		ArrayList<ArrayList<Byte>> result = new ArrayList<>();
		byte[] bytes = message.getBytes();		//将消息体转换为byte数组
		for(int i = 0; i < bytes.length; i++){
			tempbytes.add(bytes[i]);
		}
		int k = 0;								//需要填补的byte的个数
		if(bytes.length % 4 != 0){
			k = 4 - bytes.length % 4;
		}
		
		if(k == 1){
			tempbytes.add(MessageWrap.SEBYTE);
		}else{
			tempbytes.add(MessageWrap.STARTBYTE);
			for(int i = 1; i < k - 1; i++){
				tempbytes.add(MessageWrap.MIDBYTE);
			}
			tempbytes.add(MessageWrap.ENDBYTE);
		}
		
		
		//将填充好的信息体包装成block
		for(int i = 0; i < Math.ceil(((double)tempbytes.size()) / 4); i++){
			ArrayList<Byte> temp = new ArrayList<>();
			for(int j = 0; j <= 3; j++){
				temp.add(tempbytes.get(i*4 + j));
			}
			result.add(temp);
		}
		
		return result;
	}
	
	
}
