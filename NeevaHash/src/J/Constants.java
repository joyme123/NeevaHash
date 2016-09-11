package J;

import java.util.ArrayList;

import javax.crypto.spec.RC2ParameterSpec;

public class Constants {
	public static byte[] RC0 = {0x0c,0x07,0x0b,0x01,0x01,0x09,0x04,0x00,0x02,0x0b,
								 0x0e,0x07,0x05,0x0b,0x05,0x0f,0x0e,0x03,0x04,0x02,
								 0x03,0x00,0x0e,0x01,0x0c,0x06,0x0d,0x0e,0x07,0x05,
								 0x01,0x01,0x05,0x00,0x03,0x0b,0x08,0x00,0x02,0x0a,
								 0x09,0x06,0x0a,0x07,0x0f,0x05,0x04,0x06,0x0f,0x0d,
								 0x00,0x02,0x0a,0x08,0x00,0x0d,0x08,0x0c,0x0b,0x02,
								 0x07,0x08,0x06,0x03};
	public static byte[] RC1 = {0x06,0x09,0x09,0x00,0x0c,0x00,0x02,0x0e,0x02,0x04,
								0x0c,0x0f,0x09,0x0a,0x0b,0x09,0x04,0x0c,0x00,0x05,
								0x07,0x0e,0x04,0x0e,0x00,0x08,0x07,0x02,0x06,0x01,
								0x06,0x02,0x0d,0x0c,0x0c,0x0b,0x09,0x07,0x0c,0x0a,
								0x02,0x08,0x00,0x0e,0x01,0x0c,0x0c,0x0b,0x06,0x0d,
								0x0b,0x09,0x06,0x01,0x06,0x01,0x05,0x0a,0x01,0x02,
								0x06,0x0f,0x09,0x07};
	public static byte[] RC2 = {0x0f,0x0f,0x02,0x02,0x03,0x09,0x01,0x01,0x0f,0x07,
								0x0f,0x06,0x00,0x04,0x0c,0x02,0x07,0x02,0x0d,0x07,
								0x0e,0x0c,0x07,0x02,0x0d,0x0b,0x05,0x08,0x0b,0x07,
								0x06,0x00,0x06,0x06,0x09,0x0d,0x0e,0x03,0x03,0x0d,
								0x0e,0x0e,0x06,0x0b,0x0e,0x00,0x02,0x00,0x02,0x05,
								0x05,0x00,0x0c,0x04,0x03,0x09,0x0d,0x02,0x07,0x00,
								0x0f,0x00,0x05,0x0e};
	public static byte[] RC3 = {0x0f,0x05,0x0a,0x06,0x0c,0x02,0x08,0x02,0x00,0x0c,
								0x0a,0x0c,0x01,0x0a,0x0b,0x03,0x0b,0x02,0x06,0x03,
								0x0f,0x03,0x0f,0x06,0x08,0x0b,0x01,0x0d,0x03,0x0c,
								0x05,0x03,0x01,0x01,0x08,0x0b,0x0b,0x09,0x0d,0x05,
								0x02,0x05,0x02,0x01,0x0b,0x0d,0x05,0x02,0x00,0x0e,
								0x0b,0x07,0x0a,0x01,0x0e,0x05,0x0a,0x03,0x0c,0x0b,
								0x09,0x0e,0x05,0x0b};
	public static byte[] RC4 = {0x01,0x06,0x01,0x02,0x01,0x01,0x05,0x0e,0x08,0x02,
								0x00,0x01,0x0b,0x00,0x03,0x01,0x01,0x0e,0x0a,0x04,
								0x0d,0x02,0x03,0x0d,0x02,0x0b,0x0b,0x03,0x0f,0x09,
								0x00,0x06,0x08,0x03,0x02,0x0a,0x06,0x00,0x01,0x09,
								0x01,0x0b,0x04,0x01,0x08,0x01,0x0d,0x09,0x0f,0x03,
								0x0f,0x02,0x0a,0x02,0x02,0x0b,0x09,0x06,0x07,0x01,
								0x0f,0x03,0x0b,0x0a};
	public static byte[] RC5 = {0x0d,0x02,0x09,0x09,0x0a,0x0e,0x03,0x03,0x0d,0x0a,
								0x01,0x0d,0x04,0x0e,0x0d,0x05,0x0e,0x0d,0x09,0x0c,
								0x05,0x0c,0x07,0x07,0x00,0x04,0x07,0x0b,0x07,0x05,
								0x08,0x0f,0x0e,0x00,0x01,0x0b,0x0b,0x02,0x04,0x0d,
								0x04,0x08,0x00,0x01,0x0a,0x03,0x03,0x0b,0x08,0x00,
								0x05,0x00,0x00,0x01,0x03,0x0f,0x0b,0x0b,0x03,0x09,
								0x06,0x0b,0x01,0x04};
	public static byte[] RC6 = {0x01,0x0d,0x01,0x08,0x0f,0x0e,0x01,0x01,0x0c,0x0d,
								0x06,0x0a,0x0a,0x06,0x07,0x08,0x0c,0x0f,0x0e,0x00,
								0x05,0x03,0x04,0x05,0x01,0x04,0x01,0x08,0x0e,0x07,
								0x0d,0x0b,0x0b,0x08,0x0b,0x03,0x08,0x02,0x02,0x02,
								0x00,0x02,0x09,0x00,0x0e,0x0b,0x0d,0x04,0x02,0x02,
								0x09,0x01,0x0a,0x06,0x0f,0x0f,0x06,0x0c,0x04,0x0c,
								0x01,0x07,0x04,0x03};
	public static byte[] RC7 = {0x04,0x0a,0x0f,0x0c,0x05,0x0e,0x01,0x02,0x07,0x07,
								0x0a,0x07,0x03,0x05,0x05,0x0e,0x0c,0x00,0x0b,0x05,
								0x0a,0x02,0x02,0x03,0x01,0x0a,0x09,0x0e,0x02,0x0c,
								0x0c,0x0c,0x00,0x02,0x0f,0x05,0x05,0x05,0x0d,0x04,
								0x07,0x03,0x09,0x08,0x03,0x06,0x05,0x06,0x07,0x0b,
								0x0c,0x0d,0x0e,0x0f,0x09,0x01,0x0d,0x09,0x01,0x04,
								0x0c,0x0f,0x0e,0x02};
	public static byte[] RC8 = {0x0e,0x0c,0x0e,0x08,0x0b,0x00,0x0d,0x03,0x03,0x06,
								0x01,0x0a,0x08,0x0b,0x05,0x06,0x09,0x0f,0x0e,0x08,
								0x0c,0x0e,0x0c,0x0b,0x03,0x01,0x0b,0x09,0x0e,0x0c,
								0x0d,0x07,0x0e,0x07,0x03,0x00,0x0d,0x05,0x01,0x0a,
								0x0b,0x09,0x0f,0x09,0x04,0x0b,0x06,0x02,0x00,0x03,
								0x05,0x07,0x0d,0x07,0x02,0x08,0x0f,0x0d,0x0b,0x0e,
								0x0d,0x0a,0x07,0x02};
	public static byte[] RC9 = {0x01,0x0e,0x05,0x0d,0x02,0x0b,0x07,0x0b,0x0f,0x0c,
								0x0a,0x02,0x0f,0x00,0x0c,0x0c,0x0e,0x03,0x00,0x03,
								0x0b,0x02,0x0b,0x0f,0x03,0x03,0x0b,0x0e,0x03,0x0d,
								0x0c,0x04,0x0c,0x0e,0x06,0x00,0x08,0x08,0x02,0x03,
								0x09,0x08,0x0b,0x0b,0x06,0x04,0x0f,0x06,0x00,0x0b,
								0x07,0x0a,0x0d,0x0b,0x00,0x09,0x02,0x0b,0x0f,0x0a,
								0x0c,0x0e,0x02,0x09};
	public static byte[] RC10 = {0x08,0x09,0x0a,0x02,0x0a,0x06,0x0a,0x02,0x0b,0x0a,
								0x0f,0x08,0x07,0x0b,0x08,0x07,0x00,0x05,0x0e,0x0a,
								0x0d,0x07,0x05,0x04,0x04,0x07,0x0d,0x01,0x06,0x03,
								0x03,0x04,0x04,0x07,0x09,0x0a,0x0d,0x01,0x0f,0x08,
								0x07,0x0a,0x04,0x06,0x07,0x0e,0x01,0x02,0x04,0x05,
								0x0e,0x00,0x03,0x06,0x0f,0x02,0x01,0x01,0x09,0x0d,
								0x0f,0x00,0x0e,0x0b};
	public static byte[] RC11 = {0x09,0x06,0x0b,0x09,0x07,0x00,0x09,0x08,0x01,0x0e,
								0x0b,0x08,0x08,0x09,0x0e,0x0b,0x09,0x08,0x08,0x0a,
								0x09,0x06,0x0b,0x0f,0x00,0x01,0x0f,0x0c,0x01,0x0d,
								0x0d,0x01,0x03,0x0a,0x00,0x0c,0x01,0x01,0x09,0x05,
								0x01,0x09,0x0f,0x0f,0x0e,0x03,0x04,0x05,0x09,0x00,
								0x0a,0x00,0x0f,0x0e,0x03,0x06,0x0c,0x02,0x02,0x05,
								0x07,0x04,0x09,0x0e};
	public static byte[] RC12 = {0x01,0x00,0x0f,0x02,0x00,0x0d,0x06,0x04,0x0b,0x0e,
								0x03,0x0d,0x0a,0x02,0x07,0x08,0x03,0x01,0x01,0x04,
								0x0f,0x0e,0x04,0x0d,0x0f,0x0a,0x0e,0x0f,0x08,0x02,
								0x06,0x0d,0x0b,0x01,0x08,0x0e,0x06,0x0e,0x02,0x05,
								0x0c,0x0f,0x04,0x02,0x0f,0x0f,0x06,0x0f,0x02,0x02,
								0x0a,0x06,0x00,0x04,0x0a,0x03,0x04,0x09,0x06,0x08,
								0x07,0x08,0x0d,0x06};
	public static byte[] RC13 = {0x01,0x00,0x04,0x0d,0x01,0x0c,0x0d,0x0d,0x0e,0x06,
								0x06,0x0f,0x04,0x07,0x03,0x01,0x02,0x07,0x02,0x09,
								0x0c,0x03,0x02,0x01,0x0e,0x00,0x0c,0x0a,0x03,0x0b,
								0x09,0x09,0x0d,0x03,0x09,0x0b,0x07,0x05,0x04,0x06,
								0x07,0x02,0x0e,0x03,0x09,0x01,0x00,0x0d,0x06,0x0a,
								0x04,0x0d,0x0d,0x0c,0x02,0x00,0x04,0x0a,0x07,0x09,
								0x08,0x09,0x0f,0x06};
	public static byte[] RC14 = {0x03,0x0b,0x03,0x04,0x06,0x0c,0x0e,0x00,0x05,0x07,
								0x00,0x03,0x0d,0x0e,0x07,0x0e,0x0b,0x02,0x07,0x01,
								0x09,0x01,0x03,0x00,0x0a,0x0f,0x01,0x0b,0x04,0x02,
								0x06,0x06,0x06,0x00,0x0a,0x0a,0x0c,0x03,0x02,0x04,
								0x03,0x0e,0x04,0x03,0x0b,0x02,0x02,0x03,0x04,0x0b,
								0x09,0x05,0x0c,0x01,0x00,0x0d,0x02,0x08,0x0d,0x01,
								0x03,0x05,0x02,0x08};
	public static byte[] RC15 = {0x07,0x08,0x06,0x0d,0x07,0x08,0x00,0x09,0x02,0x01,
								0x0f,0x09,0x04,0x09,0x00,0x0b,0x09,0x04,0x04,0x07,
								0x06,0x01,0x06,0x02,0x06,0x00,0x09,0x0f,0x0d,0x09,
								0x0e,0x01,0x00,0x00,0x0c,0x02,0x0f,0x0d,0x0b,0x03,
								0x04,0x07,0x0f,0x0e,0x02,0x02,0x00,0x08,0x00,0x08,
								0x06,0x0b,0x01,0x0d,0x08,0x0f,0x0c,0x02,0x04,0x05,
								0x09,0x06,0x06,0x01,};
	public static byte[] RC16 = {0x08,0x08,0x08,0x04,0x06,0x00,0x0b,0x05,0x02,0x09,
								0x09,0x0c,0x0e,0x0e,0x01,0x04,0x0e,0x02,0x00,0x09,
								0x05,0x0e,0x00,0x06,0x07,0x06,0x0c,0x04,0x0e,0x0e,
								0x07,0x03,0x0a,0x0e,0x0f,0x01,0x07,0x08,0x01,0x09,
								0x07,0x06,0x07,0x0c,0x0d,0x08,0x0e,0x0e,0x09,0x02,
								0x02,0x03,0x01,0x06,0x02,0x09,0x02,0x08,0x0c,0x08,
								0x03,0x07,0x06,0x03};
	public static byte[] RC17 = {0x0e,0x08,0x00,0x0f,0x04,0x06,0x05,0x0c,0x09,0x0f,
								0x07,0x0c,0x0f,0x0c,0x07,0x08,0x0a,0x04,0x09,0x05,
								0x03,0x09,0x0b,0x07,0x03,0x07,0x08,0x01,0x02,0x0c,
								0x0b,0x0c,0x0d,0x0c,0x0d,0x03,0x07,0x03,0x04,0x07,
								0x0c,0x0f,0x04,0x0d,0x04,0x00,0x02,0x05,0x0a,0x0c,
								0x07,0x00,0x0a,0x02,0x04,0x03,0x05,0x06,0x0e,0x0f,
								0x00,0x05,0x0d,0x03};
	public static byte[] RC18 = {0x0c,0x0e,0x03,0x06,0x06,0x0b,0x0d,0x08,0x07,0x08,
								0x0a,0x09,0x02,0x01,0x08,0x07,0x08,0x06,0x0f,0x04,
								0x0f,0x0d,0x0d,0x0e,0x0f,0x03,0x03,0x0e,0x02,0x0a,
								0x0d,0x05,0x01,0x00,0x01,0x02,0x0e,0x0d,0x0b,0x0d,
								0x0e,0x01,0x09,0x00,0x08,0x05,0x0f,0x00,0x0e,0x0b,
								0x0c,0x0e,0x0e,0x08,0x04,0x06,0x03,0x08,0x0f,0x0a,
								0x07,0x01,0x02,0x06};
	public static byte[] RC19 = {0x07,0x06,0x0a,0x04,0x05,0x0e,0x09,0x0f,0x0e,0x0b,
								0x02,0x0c,0x04,0x01,0x02,0x03,0x03,0x07,0x00,0x04,
								0x04,0x08,0x02,0x07,0x08,0x00,0x05,0x04,0x0b,0x04,
								0x09,0x04,0x0b,0x06,0x02,0x0d,0x04,0x08,0x01,0x0b,
								0x05,0x0c,0x08,0x04,0x00,0x03,0x0a,0x01,0x0c,0x0a,
								0x0b,0x05,0x05,0x02,0x09,0x0b,0x0e,0x0a,0x06,0x02,
								0x0b,0x07,0x04,0x05};
	public static byte[] RC20 = {0x0a,0x0d,0x0f,0x06,0x0d,0x03,0x0e,0x09,0x03,0x01,
								0x06,0x06,0x0a,0x06,0x0f,0x08,0x09,0x02,0x0b,0x00,
								0x0a,0x09,0x0d,0x05,0x09,0x0d,0x05,0x05,0x0a,0x01,
								0x0a,0x05,0x01,0x0c,0x0a,0x01,0x01,0x0b,0x09,0x0c,
								0x0b,0x05,0x03,0x00,0x0d,0x07,0x0f,0x05,0x0d,0x05,
								0x00,0x09,0x04,0x06,0x0d,0x0d,0x09,0x0c,0x0e,0x0e,
								0x0d,0x0a,0x02,0x0c};
	public static byte[] RC21 = {0x03,0x02,0x04,0x06,0x0b,0x01,0x00,0x0c,0x09,0x08,
								0x07,0x0b,0x01,0x07,0x04,0x0f,0x0d,0x09,0x0f,0x05,
								0x09,0x08,0x04,0x04,0x04,0x0a,0x05,0x0c,0x04,0x02,
								0x0e,0x09,0x0e,0x0a,0x03,0x09,0x00,0x0c,0x0f,0x05,
								0x0c,0x04,0x0c,0x05,0x0a,0x05,0x0f,0x0d,0x0b,0x0a,
								0x07,0x0e,0x00,0x0a,0x00,0x08,0x0f,0x05,0x09,0x0d,
								0x02,0x0f,0x01,0x00};
	
	public static byte[] RC22 = {0x09,0x0f,0x03,0x09,0x00,0x03,0x0e,0x05,0x03,0x03,
								0x08,0x0b,0x06,0x04,0x01,0x05,0x0d,0x09,0x02,0x0b,
								0x04,0x07,0x00,0x07,0x04,0x06,0x02,0x0d,0x04,0x0e,
								0x0f,0x08,0x02,0x08,0x04,0x04,0x0f,0x07,0x08,0x09,
								0x07,0x0d,0x0c,0x0f,0x08,0x0f,0x07,0x00,0x02,0x0e,
								0x01,0x03,0x01,0x0c,0x00,0x06,0x02,0x06,0x08,0x02,
								0x0a,0x09,0x09,0x0a};
	public static byte[] RC23 = {0x07,0x00,0x0f,0x0f,0x02,0x09,0x0c,0x04,0x0c,0x01,
								0x01,0x0f,0x01,0x08,0x00,0x00,0x08,0x0d,0x0d,0x05,
								0x03,0x03,0x0a,0x0c,0x0d,0x07,0x02,0x04,0x08,0x0c,
								0x09,0x0b,0x00,0x0a,0x06,0x04,0x02,0x0e,0x0b,0x0a,
								0x0f,0x04,0x02,0x0b,0x04,0x0f,0x0b,0x02,0x00,0x08,
								0x09,0x08,0x02,0x08,0x08,0x0b,0x03,0x09,0x04,0x0e,
								0x05,0x0f,0x03,0x03};
	public static byte[] RC24 = {0x0c,0x0b,0x08,0x0b,0x0e,0x0f,0x0d,0x0f,0x0d,0x0f,
								0x05,0x0b,0x02,0x03,0x08,0x0b,0x01,0x0c,0x07,0x03,
								0x00,0x0c,0x00,0x0b,0x0f,0x03,0x00,0x08,0x05,0x05,
								0x0b,0x0b,0x0c,0x07,0x0a,0x00,0x0b,0x0f,0x0a,0x05,
								0x0a,0x0e,0x03,0x05,0x01,0x06,0x0a,0x0b,0x07,0x0e,
								0x0d,0x0d,0x03,0x02,0x06,0x0f,0x05,0x06,0x01,0x01,
								0x0a,0x0e,0x04,0x08};
	public static byte[] RC25 = {0x0d,0x0f,0x0e,0x0b,0x02,0x08,0x06,0x07,0x02,0x0f,
								0x06,0x0b,0x0c,0x0f,0x0c,0x01,0x0a,0x0f,0x0b,0x03,
								0x0d,0x01,0x01,0x0a,0x09,0x07,0x0b,0x0b,0x0e,0x06,
								0x05,0x0f,0x0c,0x00,0x0f,0x0f,0x0b,0x09,0x07,0x0d,
								0x05,0x02,0x06,0x09,0x01,0x03,0x0f,0x0c,0x0a,0x07,
								0x04,0x0d,0x07,0x0e,0x09,0x09,0x05,0x0b,0x0a,0x09,
								0x0a,0x03,0x0a,0x06};
	public static byte[] RC26 = {0x09,0x0f,0x07,0x0f,0x04,0x08,0x09,0x06,0x04,0x06,
								0x07,0x03,0x05,0x02,0x0c,0x08,0x02,0x04,0x0c,0x09,
								0x04,0x01,0x0a,0x0f,0x04,0x09,0x08,0x06,0x06,0x0c,
								0x01,0x01,0x02,0x04,0x06,0x0f,0x04,0x05,0x02,0x09,
								0x0d,0x05,0x05,0x0c,0x00,0x0b,0x01,0x01,0x01,0x00,
								0x0b,0x09,0x00,0x04,0x07,0x05,0x07,0x05,0x02,0x04,
								0x09,0x05,0x03,0x03};
	public static byte[] RC27 = {0x07,0x09,0x09,0x09,0x00,0x07,0x00,0x02,0x06,0x02,
								0x01,0x0c,0x05,0x03,0x01,0x01,0x04,0x05,0x03,0x07,
								0x08,0x09,0x09,0x06,0x04,0x04,0x04,0x0d,0x0c,0x02,
								0x06,0x07,0x06,0x02,0x09,0x0c,0x02,0x02,0x01,0x0a,
								0x09,0x0d,0x06,0x0f,0x0c,0x03,0x0d,0x07,0x05,0x0b,
								0x0e,0x07,0x01,0x0d,0x07,0x00,0x04,0x0a,0x0e,0x01,
								0x0b,0x0a,0x0c,0x02,};
	public static byte[] RC28 = {0x05,0x0f,0x06,0x07,0x03,0x01,0x0b,0x0f,0x06,0x09,
								0x02,0x09,0x02,0x03,0x0f,0x01,0x0b,0x06,0x0d,0x01,
								0x0d,0x0c,0x0e,0x07,0x04,0x09,0x00,0x05,0x0c,0x07,
								0x0c,0x0a,0x05,0x00,0x04,0x0a,0x0c,0x0b,0x0a,0x03,
								0x0d,0x00,0x0b,0x09,0x05,0x0b,0x0c,0x07,0x09,0x0d,
								0x07,0x07,0x08,0x07,0x00,0x02,0x05,0x07,0x08,0x03,
								0x0e,0x05,0x0c,0x0f};
	public static byte[] RC29 = {0x0e,0x0c,0x01,0x0d,0x00,0x0d,0x08,0x0d,0x0d,0x0d,
								0x06,0x0b,0x05,0x0d,0x08,0x0d,0x0c,0x0f,0x01,0x0c,
								0x05,0x0a,0x07,0x05,0x09,0x0f,0x0a,0x0e,0x07,0x0d,
								0x0c,0x00,0x0c,0x02,0x00,0x06,0x04,0x08,0x09,0x0b,
								0x0c,0x08,0x0f,0x01,0x04,0x0d,0x08,0x0d,0x09,0x0e,
								0x04,0x0a,0x06,0x0b,0x0c,0x0b,0x02,0x02,0x08,0x07,
								0x0c,0x07,0x0c,0x03};
	public static byte[] RC30 = {0x0f,0x0c,0x02,0x0d,0x08,0x0f,0x0d,0x00,0x04,0x0b,
								0x08,0x0f,0x05,0x08,0x02,0x0f,0x0a,0x0d,0x0d,0x06,
								0x02,0x00,0x05,0x0c,0x0a,0x09,0x07,0x09,0x0b,0x06,
								0x04,0x08,0x0a,0x02,0x0c,0x06,0x0f,0x0c,0x09,0x0b,
								0x00,0x00,0x0c,0x0a,0x08,0x0b,0x03,0x08,0x09,0x0c,
								0x0d,0x09,0x04,0x0a,0x03,0x0e,0x0f,0x09,0x00,0x0a,
								0x0d,0x04,0x03,0x05};
	public static byte[] RC31 = {0x04,0x00,0x0e,0x03,0x00,0x08,0x0b,0x03,0x08,0x05,
								0x00,0x01,0x0c,0x04,0x02,0x07,0x03,0x01,0x03,0x00,
								0x0a,0x05,0x08,0x07,0x09,0x00,0x06,0x0a,0x00,0x0c,
								0x0c,0x0c,0x05,0x04,0x06,0x01,0x0f,0x09,0x04,0x07,
								0x0f,0x02,0x00,0x01,0x07,0x05,0x09,0x0b,0x05,0x00,
								0x0b,0x06,0x01,0x0d,0x0d,0x03,0x02,0x0a,0x0d,0x0e,
								0x0d,0x0b,0x09,0x0a};
	public static byte[][] ROUNDCONTANTS = {Constants.RC0,Constants.RC1,Constants.RC2,Constants.RC3,
											Constants.RC4,Constants.RC5,Constants.RC6,Constants.RC7,
											Constants.RC8,Constants.RC9,Constants.RC10,Constants.RC11,
											Constants.RC12,Constants.RC13,Constants.RC14,Constants.RC15,
											Constants.RC16,Constants.RC17,Constants.RC18,Constants.RC19,
											Constants.RC20,Constants.RC21,Constants.RC22,Constants.RC23,
											Constants.RC24,Constants.RC25,Constants.RC26,Constants.RC27,
											Constants.RC28,Constants.RC29,Constants.RC30,Constants.RC31};
}
