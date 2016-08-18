package com.huawei;

import java.util.HashSet;
import java.util.Scanner;

public class NumsOfDifferChar {

	public static void main(String[] args) {
		// abc
		// CC

		// Scanner sc = new Scanner(System.in);
		//
		// while (sc.hasNext()) {
		// String line = sc.nextLine();
		// System.out.println(differNums(line));
		// ;
		// }

		// int a = 5, b = 6, c = 12;
		// int z = (a * b - c) / a;
		// System.out.println(z);

		double x = 3.0;
		int y = 5;
		x /= --y;
		System.out.println(x);
	}

	private static int differNums(String str) {
		// ABC

		if (str == null || str == "") {
			return 0;
		}
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < str.length(); i++) {
			if (!set.contains(str.charAt(i))) {
				set.add(str.charAt(i) + "");
			}
		}

		return set.size();
	}
}
