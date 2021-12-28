package com.pgm.logic;

public class Test1 {

	int calculate(int a, int b) {

		return a+b;
	}
	
	String getMessage(String name) {
		return "Hello :"+ name;
	}
	
	String[] getNames() {
		return new String[] {"John","Smith"};
	}

	public static void main(String[] args) {

			Test1 t=new Test1();
			 String names[] = t.getNames();
			 
			 //         
			 for(int i=0;i<names.length;i++) {
				  String name=names[i];
				  System.out.println(name);
			 }
			 
			 //since from jdk 1.5 they have for-each loop
			 //for-each loop is  specially design to handle a group of elements/object
			 
			 for(String name:names) {
				 System.out.println(name);
			 }
			 
	}
}

