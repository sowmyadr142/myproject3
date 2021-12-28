package com.basicpgm1;

class Shape {
	double a;
	Shape(double a){
		this.a=a;
	}

}

class Square extends Shape {
	Square(double a){
		super(2);
	}
	
	void area() {
		double res = a * a;
		System.out.println(res);
	}

}

class Rectangle extends Shape {
	private double y;
	public Rectangle(double a, double x, double y) {
		super(a);
		this.y = y;
		
	}
	
	void area() {
		double res = a * y;
		System.out.println(res);
	}
}


public class Main {
    public static void main(String[] args){
	    Square s = new Square(2);
	    Rectangle r = new Rectangle(2.2, 3.2, 4.2);
	
	    s.area();
    	r.area();
    }
}


