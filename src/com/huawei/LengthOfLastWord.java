package com.huawei;

import java.util.Scanner;

public class LengthOfLastWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String str = scan.nextLine();
			System.out.println(lengthOfLast(str));
		}

	}

	private static int lengthOfLast(String str) {
		String[] strs = str.split(" ");

		return strs[strs.length - 1].length();
	}

}
