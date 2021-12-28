package com.basicpgm1;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1st number ");
		int a = sc.nextInt();
		System.out.println("enter the 2nd number ");
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("sum of two number is " + c);
	}

}
