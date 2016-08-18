package com.youdao;

import java.util.Scanner;

public class Main {
	private static String[] arrays;
	private static String[] arraysnew;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String line1 = sc.nextLine();
			int k = Integer.parseInt(line1.split(" ")[1]);
			String line2 = sc.nextLine();
			arrays = line2.split(" ");
			arraysnew = line2.split(" ");
			for (int j = 0; j < k; j++) {
				xipai();
			}
			for (int w = 0; w < arraysnew.length; w++) {
				System.out.print(arraysnew[w]);
			}
		}
	}

	public static void xipai() {
		int start1 = 0;
		int last1 = (arrays.length - 1) / 2;
		int start2 = last1 + 1;
		int last2 = arrays.length - 1;
		int indexnew = arrays.length - 1;
		while (start1 <= last1 && start2 <= last2) {
			arraysnew[indexnew--] = arrays[last2--];
			arraysnew[indexnew--] = arrays[last1--];
		}

		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = arraysnew[i];
		}
	}

}
