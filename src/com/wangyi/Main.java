package com.wangyi;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TEST1();
	}

	private static void TEST1() {
		Scanner in = new Scanner(System.in);
		HashSet set = new HashSet();
		
		int n = 0;
		
		while (in.hasNext()) {// 注意while处理多个case
			int count = in.nextInt();
			for (int j = 0; j < count; j++) {
				if (n > 50) {
					break;
				}
				String line = in.nextLine();
				System.out.println(line);
				if (line.equals("")) {
					break;
				}
				if (line.length() > 50) {
					break;
				}
				n++;
				String[] attrs = line.split(" ");
				if (attrs.length > 0) {
					for (int i = 0; i < attrs.length; i++) {
						set.add(attrs[i]);
					}

				}
			}
		}
		System.out.println(set.size());
	}


}
