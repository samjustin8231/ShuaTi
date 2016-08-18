package com.huawei;

import java.util.Scanner;

public class NiXuOfInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			System.err.println(testname(sc.nextInt()));
			;
		}

		// System.out.println(testname(1));
	}

	public static String testname(int n) {

		String strN = n + "";
		String[] arr = new String[strN.length()];

		for (int i = 0; i < strN.length(); i++) {
			arr[strN.length() - i - 1] = strN.charAt(i) + "";
		}

		String result = "";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}

		return result;
	}
}
