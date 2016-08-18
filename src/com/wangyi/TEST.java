package com.wangyi;
import java.util.ArrayList;
import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		String[] arrays = line.split(" ");
		
		Integer n = Integer.parseInt(arrays[0]);
		Integer m = Integer.parseInt(arrays[1]);
		
		Integer[][] matrix = new Integer[n][m];
		
		for (int i = 0; i < Integer.parseInt(arrays[0]); i++) {
			
			String tempLine = sc.nextLine();
			String[] as = tempLine.split(" ");
			for (int j = 0; j < as.length; j++) {
				matrix[i][j] = Integer.parseInt(as[j]);
			}
		}
		
		
		
		for (int i = 1; i < n-1; i++) {
			for (int j = 1; j < matrix.length; j++) {
				
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
