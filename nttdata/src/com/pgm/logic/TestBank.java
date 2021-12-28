package com.pgm.logic;

//parent class Bank
class Bank {

	public float getRateOfInterest() {
		return 5.0f;
	}
}

class SBI extends Bank {

	public float getRateOfInterest() {
		return 9.0f;

	}
}

class ICICI extends Bank {

	public float getRateOfInterest() {
		return 10.0f;

	}
}

class Axis extends Bank {

	public float getRateOfInterest() {
		return 11.0f;

	}
}

public class TestBank {

	public static void main(String[] args) {

		Bank bank;
		/*=new Bank();
		bank.getRateOfInterest();
		System.out.println(bank.getRateOfInterest());*/
		// create object of SBI and hold it in the parent class
		bank = new SBI();
		// get ROT of SBI bank
		float sbiobj = bank.getRateOfInterest();
		System.out.println("SBI OBJECT:" + sbiobj);

		// create object of ICICI and hold it in the parent class
		bank = new ICICI();
		// get ROT of ICICI bank
		float iciciobj = bank.getRateOfInterest();
		System.out.println("ICICI OBJECT:" + iciciobj);

		// create object of AXIS and hold it in the parent class
		bank = new Axis();
		// get ROT of SBI bank
		float axisobj = bank.getRateOfInterest();
		System.out.println("AXIS OBJECT:" + axisobj);
	}

}
