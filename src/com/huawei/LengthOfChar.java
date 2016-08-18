package com.huawei;

import java.util.Scanner;

public class LengthOfChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.nextLine();
			String c = scan.next();
			System.out.println(lengthOfChar(str, c));
		}

	}

	private static int lengthOfChar(String str, String c) {
		int count = 0;
		if (str.length() <= 0) {
			return 0;
		}
		for (int i = 0; i < str.length(); i++) {
			if (c.contains(str.charAt(i) + "")) {
				count++;
			}
		}
		return count;
	}

}
