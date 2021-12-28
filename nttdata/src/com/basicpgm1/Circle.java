package com.basicpgm1;

import java.util.Scanner;

public class Circle {
	static double radius = 1.0;

	static double getArea(double radius) {
		double area = (22 * radius * radius) / 7;
		System.out.print("the circle has radius of" + radius + "and area of ");
		return area;
	}

	public static void main(String[] args) {

		for (int i = 1; i <= 2; i++) {
			System.out.println(getArea(radius));
			double d = radius++;
		}
	}
}