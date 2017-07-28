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
		System.out.println("encrypt:" + DesUtil.encrypt("20万以上", "hellohyy00100015"));
		System.out.println("encrypt:" + DesUtil.encrypt("20万以上", "hellohyy00100015"));
		System.out.println("encrypt:" + DesUtil.encrypt("15-20万", "hellohyy00100017"));
	}

}
