package com.wangyi;

import java.util.HashSet;

public class Cmp {

	public static void main(String[] args) {

	}

	/**
	 * ��һ��˼·�ǣ�����g1��ţ�ȥ����صĶ�Ԫ�飬��ֱ�ӱ�����ϵ��ķż��ϣ�max������ұ�����ϵС�ķż��ϣ�min���
	 * Ȼ���Ҷ�Ԫ���м�ӱ�����ϵ���Ԫ�طż���max���ӱ�����ϵС��Ԫ�طż���min����g2���ڼ���max����Ǽ���min�
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
