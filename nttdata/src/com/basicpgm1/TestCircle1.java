package com.basicpgm1;

public class TestCircle1 {
 private static final double Area = 0;
static double radius;
	String color;
	
	TestCircle1(){
		double radius=1.0;
		String color="red";
	}
	
	TestCircle1(double cradius,String ccolor){
		radius=cradius;
		color=ccolor;
	}
	static double getRadius(){
		return radius;
	}
	
	static double getArea() {
		double radius=1.0;

for(int i=0;i<=2;i++) {
	double Area=Math.PI*radius*radius;
		
	 System.out.println("the circle radius"+radius+"area of");
	 radius++;
		

}
return Area;

	}
	public static void main(String[] args) {
		System.out.println(getArea());
	}

	
}

	
	
