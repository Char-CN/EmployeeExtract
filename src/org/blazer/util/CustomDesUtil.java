package org.blazer.util;

public class CustomDesUtil {

	/**
	 * 使用employeeId进行加密
	 * 
	 * @param content
	 * @param employeeId
	 * @return
	 */
	public static String encrypt(String content, String employeeId) {
		// 确保16位,加密2次
		String key = "xyzopqrs" + num2en(employeeId);
		return DesUtil.encrypt(content, key);
	}

	public static String decrypt(String content, String employeeId) {
		// 确保16位,解密2次
		String key = "xyzopqrs" + num2en(employeeId);
		return DesUtil.decrypt(content, key);
	}

	public static String num2en(String content) {
		if (content == null) {
			return null;
		}
		content = content.replaceAll("0", "a");
		content = content.replaceAll("1", "b");
		content = content.replaceAll("2", "c");
		content = content.replaceAll("3", "d");
		content = content.replaceAll("4", "e");
		content = content.replaceAll("5", "f");
		content = content.replaceAll("6", "g");
		content = content.replaceAll("7", "h");
		content = content.replaceAll("8", "i");
		content = content.replaceAll("9", "j");
		return content;
	}

	public static void main(String[] args) {
		System.out.println(
				"firm,like,diet,pressure,activity,accept,defeat,relay,evidence,imagine,relation,freedom,breakthrough,left,confirm,ability,member,climate,stupid,organise,decorate,wage,target,conservative,lonely,slip,away,congratulation,valuable,grey,protect,literature,senior,busy,different,citizen,seize,occur,waste"
						.split(",").length);
		System.out.println(encrypt("1万以下", "00100008"));
		System.out.println(encrypt("L-2万", "00100108"));
		System.out.println(encrypt("3-4万", "00100010"));
		System.out.println(encrypt("1万以下", "00100000"));
		System.out.println(encrypt("1万以下", "00100001"));
		System.out.println(encrypt("20万以上", "00100001"));
		System.out.println(decrypt("c99fb02ec004301d4ac850c8b76235e1c7615deab4dcb29ba0fd78807ffdb7e8aefae63567d86dda", "00100008"));
		System.out.println(decrypt("b9da7dace4fad5eedda569b86574539fb676f8c9b2751493", "00100108"));
		System.out.println(decrypt("729529771a2a0c30de066c57d23ac0b9fd94a2e0b4bbe6a1", "00100010"));
		System.out.println(decrypt("1c71079c2c014f93b4a768c0761e008ed49d2e86654b4c1ac72cf71f31784124a321a853cc04160f", "00100001"));
		System.out.println(decrypt("e2dfa81bba2a4e1e8c0a7ecf4f5bd013cd94649f63902a8ceee1c2c24a822fd7a321a853cc04160f", "00100001"));
	}

}
