package com.demo;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		testScanner1();
	}

	private static void testScanner() {
		Scanner s = new Scanner(System.in);
		System.out.println("ÇëÊäÈë×Ö·û´®£º");
		while (true) {
			String line = s.nextLine();
			if (line.equals("exit"))
				break;
			System.out.println(">>>" + line);
		}
	}

	private static void testScanner1() {
		Scanner s = new Scanner(
				"123 asdf sd 45 789 sdf asdfl,sdf.sdfl,asdf    ......asdfkl    las");
		//System.out.println(s.delimiter());
		
		s.useDelimiter(" |,|\\.");
		while (s.hasNext()) {
			System.out.println(s.next());
		}
	}
}
