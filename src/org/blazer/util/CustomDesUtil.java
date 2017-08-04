package org.blazer.util;

public class CustomDesUtil {

	public static String encrypt(String content, String idNumber, String employeeId) {
		// 确保16位,加密2次
		String key = "acfg1469" + employeeId;
		if (idNumber != null && !idNumber.equals("") && idNumber.length() >= 16) {
			key = idNumber.substring(0, 16);
		}
		return DesUtil.encrypt(content, key);
	}

	public static String decrypt(String content, String idNumber, String employeeId) {
		// 确保16位,解密2次
		String key = "acfg1469" + employeeId;
		if (idNumber != null && !idNumber.equals("") && idNumber.length() >= 16) {
			key = idNumber.substring(0, 16);
		}
		return DesUtil.decrypt(content, key);
	}

	public static void main(String[] args) {
		System.out.println(encrypt("20万以上", "152201197404142018", "00100008"));
		System.out.println(encrypt("20万以上", "C479196(5)", "00100010"));
		System.out.println(decrypt("f496844425f559189bb9ca411ba6a5ed30674c0deb192fe6b40b8d3f7c625f2cf52838dbfe4f81f0", "152201197404142018", "00100008"));
		System.out.println(decrypt("f32e7eaeffa851abd569b84781ed0eccbb2fd1aad21261a07cbb502387413f08ad6a88b4fa37833d", "C479196(5)", "00100010"));
	}

}
