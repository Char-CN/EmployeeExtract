package org.blazer.util;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public final class DesUtil {

	private static final String DEFAULT_PASSWORD_CRYPT_KEY = "HelLohYy";
	private static final String DES = "DES";
	private static Cipher cipher = null;

	static {
		try {
			cipher = Cipher.getInstance(DES);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private DesUtil() {
	}

	private static byte[] encrypt(byte[] src, byte[] key) throws Exception {
		SecureRandom sr = new SecureRandom();
		DESKeySpec dks = new DESKeySpec(key);
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
		SecretKey securekey = keyFactory.generateSecret(dks);
		cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);
		return cipher.doFinal(src);
	}

	private static byte[] decrypt(byte[] src, byte[] key) throws Exception {
		SecureRandom sr = new SecureRandom();
		DESKeySpec dks = new DESKeySpec(key);
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
		SecretKey securekey = keyFactory.generateSecret(dks);
		cipher.init(Cipher.DECRYPT_MODE, securekey, sr);
		return cipher.doFinal(src);
	}

	public static String decrypt(String data) {
		return decrypt(data, DEFAULT_PASSWORD_CRYPT_KEY);
	}

	public static String decrypt(final String data, final String key) {
		if (data == null || key == null) {
			return null;
		}
		String rst = data;
		try {
			for (int i = key.length() / 8 - 1; i >= 0; i--) {
				String tmpKey = key.substring(i * 8, i * 8 + 8);
				rst = new String(decrypt(hex2byte(rst.getBytes()), tmpKey.getBytes()));
			}
			return rst;
		} catch (Exception e) {
//			e.printStackTrace();
		}
		return null;
	}

	public static String encrypt(String data) {
		return encrypt(data, DEFAULT_PASSWORD_CRYPT_KEY);
	}

	public static String encrypt(final String data, final String key) {
		if (data == null || key == null) {
			return null;
		}
		String rst = data;
		try {
			for (int i = 0; i < key.length() / 8; i++) {
				String tmpKey = key.substring(i * 8, i * 8 + 8);
				rst = byte2hex(encrypt(rst.getBytes(), tmpKey.getBytes()));
			}
			return rst;
		} catch (Exception e) {
//			e.printStackTrace();
		}
		return null;
	}

	private static String byte2hex(byte[] b) {
		StringBuilder hs = new StringBuilder();
		for (int n = 0; n < b.length; n++) {
			String stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1) {
				hs.append("0");
			}
			hs.append(stmp);
		}
		return hs.toString();
	}

	private static byte[] hex2byte(byte[] b) {
		if ((b.length % 2) != 0) {
			throw new IllegalArgumentException("长度不是偶数");
		}
		byte[] b2 = new byte[b.length / 2];
		for (int n = 0; n < b.length; n += 2) {
			String item = new String(b, n, 2);
			b2[n / 2] = (byte) Integer.parseInt(item, 16);
		}
		return b2;
	}

	public static void main(String[] args) {
		System.out.println("encrypt:" + DesUtil.encrypt("20万以上", "" + "00100012"));
		System.out.println("encrypt:" + DesUtil.encrypt("20万以上", "" + "00100013"));
		System.out.println("encrypt:" + DesUtil.decrypt("1018103075fc5e402e365606c70eeb9e0c61b2dd18bf2eaf5619395d78049fe0fb0e30863ca561e9", "hellohyy" + "00100012"));
		System.out.println("encrypt:" + DesUtil.decrypt("1018103075fc5e402e365606c70eeb9e0c61b2dd18bf2eaf5619395d78049fe0fb0e30863ca561e9", "hellohyy" + "00100013"));
//		System.out.println("decrypt:" + DesUtil.decrypt("9e020b9c4e8f4da2150124985b6e52dcd7580a0638f7652c", "hellohyy00483433"));
		System.out.println("decrypt:" + DesUtil.decrypt("cab451553ba001d6b06c29e7c69cd088e1722492fa551f67", "hellohyy" + "00528600"));
	}

}
