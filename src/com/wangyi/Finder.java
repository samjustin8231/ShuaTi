package com.wangyi;

import java.util.Arrays;

public class Finder {

	public static void main(String[] args) {
		System.out.println("test");
	}

	public int findKth(int[] a, int n, int K) {

		Arrays.sort(a);

		return a[n - K];
	}
}
