
package com.basicpgm1;

import java.util.Scanner;

public class MultipleOfHundred {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		System.out.println(getNextMultipleOf100(number));
	}

	private static int getNextMultipleOf100(int number) {
		int rem = number % 100;
		if (rem != 0) {
			number = (number / 100) + 1;
			number = 100 * number;
		}
		return number;

	}

}
