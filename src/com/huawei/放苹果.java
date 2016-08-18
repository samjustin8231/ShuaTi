package com.huawei;

import java.util.Scanner;

public class ·ÅÆ»¹û {

	public static int fways(int m, int n) {
		if (m == 0 || n == 1)
			return 1;
		if (m < n)
			return fways(m, m);
		else
			return fways(m, n - 1) + fways(m - n, n);
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String line = input.nextLine();
			String[] arrays = line.split(" ");
			System.out.println(fways(Integer.parseInt(arrays[0]),
					Integer.parseInt(arrays[1])));
		}

	}

}
