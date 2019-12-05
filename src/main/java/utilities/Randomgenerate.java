package utilities;

import java.util.Random;

public class Randomgenerate {
	public static String randomAlphaNumeric() {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String s = "";
		Random random = new Random();
		int randomLen = 1 + random.nextInt(9);
		for (int i = 0; i < randomLen; i++) {
			char c = alphabet.charAt(random.nextInt(26));
			s += c;
		}
		return s;
	}
}
