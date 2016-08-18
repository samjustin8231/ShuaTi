package com.wangyi;

import java.util.HashSet;

public class Cmp {

	public static void main(String[] args) {

	}

	/**
	 * 另一种思路是：根据g1编号，去找相关的二元组，找直接比它关系大的放集合（max）里，和找比它关系小的放集合（min）里，
	 * 然后找二元组中间接比它关系大的元素放集合max里，间接比它关系小的元素放集合min里，最后看g2是在集合max里，还是集合min里。
	 * 
	 * @param g1
	 * @param g2
	 * @param records
	 * @param n
	 * @return
	 */
	public int cmp(int g1, int g2, int[][] records, int n) {
		HashSet<Integer> max = new HashSet<>();
		HashSet<Integer> min = new HashSet<>();

		for (int i = 0; i < n; i++) {
			if (records[i][0] == g1) {
				min.add(records[i][1]);
			}
			if (records[i][1] == g1) {
				max.add(records[i][0]);
			}
		}

		for (int i = 0; i < n; i++) {
			if (records[i][0] != g1 && records[i][1] != g1) {
				if (max.contains(records[i][1])) {
					max.add(records[i][0]);
				}
				if (min.contains(records[i][0])) {
					max.add(records[i][1]);
				}
			}
		}

		if (max.contains(g2) && !min.contains(g2)) {
			return -1;
		} else if (!max.contains(g2) && min.contains(g2)) {
			return 1;
		} else
			return 0;
	}
}
