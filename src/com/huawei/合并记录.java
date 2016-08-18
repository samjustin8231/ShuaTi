package com.huawei;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Author: sam
 */
public class �ϲ���¼ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int pares = Integer.parseInt(scanner.nextLine());
			SortedMap<Integer, Integer> map = new TreeMap<>();
			for (int i = 0; i < pares; i++) {
				String[] nums = scanner.nextLine().split("\\s+");
				addPare(map, nums);
			}

			System.out.print(mapToString(map));
		}

		scanner.close();
	}

	private static void addPare(SortedMap<Integer, Integer> map, String[] nums) {

		int key = Integer.parseInt(nums[0]);
		int val = Integer.parseInt(nums[1]);

		if (map.containsKey(key)) {
			map.put(key, map.get(key) + val);
		} else {
			map.put(key, val);
		}
	}

	private static String mapToString(SortedMap<?, ?> map) {

		StringBuilder builder = new StringBuilder();

		for (SortedMap.Entry<?, ?> e : map.entrySet()) {
			builder.append(e.getKey()).append(" ").append(e.getValue())
					.append("\n");
		}

		return builder.toString();
	}
}
