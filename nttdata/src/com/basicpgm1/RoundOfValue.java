package com.basicpgm1;

import java.util.Scanner;

public class RoundOfValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st value");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd value");
		int b = sc.nextInt();
		System.out.println("Enter the 3rd value");
		int c = sc.nextInt();
		System.out.println(roundof(a, b, c));
	}

	private static int roundof(int a, int b, int c) {

		return round10(a) + round10(b) + round10(c);
	}

	private static int round10(int num) {
		int rem = num % 10;
		if (rem >= 5)
			return num + 10 - rem;
		return num - rem;
	}

}
