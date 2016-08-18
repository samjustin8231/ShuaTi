package com.huawei;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Split {
	static String newStr2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			List<String> list = new ArrayList<String>();
			String str = sc.nextLine();

			for (int i = 0; i < str.length(); i = i + 8) {
				int n = str.length() % 8;
				if (i + 8 <= str.length()) {

					String newStr = str.substring(i, i + 8);
					list.add(newStr);

				}

				else {
					int number = 8 - n;
					String newStr = str.substring(i);
					for (int i1 = 0; i1 < number; i1++) {

						if (i1 == 0)
							newStr2 = newStr + "0";
						else
							newStr2 += "0";
					}
					list.add(newStr2);
				}

			}
			for (int i1 = 0; i1 < list.size(); i1++)
				System.out.println(list.get(i1));
		}

	}

}
