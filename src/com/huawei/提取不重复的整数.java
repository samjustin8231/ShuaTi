package com.huawei;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ��ȡ���ظ������� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		while (n != 0) {
			set.add(n % 10);
			n /= 10;
		}
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Integer value = (Integer) iterator.next();
			System.out.print(value);
		}
	}
}
