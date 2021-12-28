package com.basicpgm1;

/*Q1.
Calculate the ElectricBill,WaterBill by maintianing constant value for  per unit charges.
The following are the classes and interface has to create.

Bill,DisplayBill,ElectricBill and WaterBill.
Bill interface contain following information:
Variable : one of type public static final PER_UNIT=4.5;

Methods : 2 method of following specification.
1.
Method Name : calculateBill
Argument       : one of type integer
Return Type   : double
2.
Method Name : displayBillAmount
Argument       : two, one of type double and second of type String.
Return Type   : void

DisplayBill class contain the following information:

These class is a implementation class of Bill interface in that  override only one method
 i.e. is displayBillAmount and make these class as abstract class.

ElectricBill class contain the following information:
override the calculateBill method and write the logic to calculate amount.
Take per_unit charage 4.0 rupees.
Finally test the application.

Example:
Sample Input:
300
Electric 
Sample Output:
Electric bill amount is:1200.0*/

 interface Bill{
	public static final float PER_UNIT=4.5f;
	double calculateBill(int a);
	void displayBillAmount(double c,String d) ;
 }
 
   abstract class DisplayBill implements Bill{
@Override
	public void displayBillAmount(double c, String d) {
		System.out.println();
		
	}

@Override
public abstract double calculateBill(int a);
	
}
  
class ElectricBill implements Bill{

	@Override
	public double calculateBill(int a) {
		double bill=(4.0*a);
		return bill;
	}

	@Override
	public void displayBillAmount(double c, String d) {
		// TODO Auto-generated method stub
		return ;
	}
	
}
	 
 

public class TestBill {

	public static void main(String[] args) {

		Bill b=new ElectricBill();
		
		System.out.println("Electricity bill amount ;"+b.calculateBill(300));
		b.displayBillAmount(300,"Electric");
	}

}
