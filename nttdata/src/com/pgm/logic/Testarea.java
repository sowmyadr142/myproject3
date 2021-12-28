package com.pgm.logic;

abstract class Shape {
	abstract void area();
}

class Rectangle extends Shape {
	@Override
	void area() {
		int l = 3, b = 4;
		int area = l * b;

		System.out.println("area of Rectangle:" + area);
	}
}

class Circle extends Shape {

	@Override
	void area() {
		float r = 3.5f;
		float area = (float) (Math.PI * r * r);
		System.out.println("area of Circle:" + area);

	}

}

public class Testarea {
	public static void main(String[] args) {
		Shape s;
		s = new Rectangle();
		s.area();

		Shape s1 = new Circle();
		s1.area();
	}

}
