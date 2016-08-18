package com.youdao;

import java.util.*;

public class Main1 {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int n;
		while (cin.hasNextInt()) {
			n = cin.nextInt();
			while (n-- > 0) {
				int m = 0;

				m = cin.nextInt();

				Deque<Integer> deque = new ArrayDeque<Integer>();
				Map<Integer, Integer> map = new HashMap<Integer, Integer>();
				for (int i = 0; i < m; i++) {
					deque.add(i);
				}
				int i = 1;
				while (deque.isEmpty() == false) {
					int x = deque.pollFirst();
					deque.add(x);
					x = deque.pollFirst();
					map.put(x, i++);
				}
				for (i = 0; i < m; i++) {
					if (i > 0) {
						System.out.print(" ");
					}
					System.out.print(map.get(i));
				}
				System.out.println("");

			}

		}
	}

}