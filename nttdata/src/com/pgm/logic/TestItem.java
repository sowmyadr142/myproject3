package com.pgm.logic;

interface Item {
	String itemName();

	float itemPrice();
}

class Burger implements Item {

	@Override
	public String itemName() {

		return "vegburger";
	}

	@Override
	public float itemPrice() {

		return 500.00f;
	}

}

class CoolDrinks implements Item {

	@Override
	public String itemName() {
		
		return "sprite";
	}

	@Override
	public float itemPrice() {

		return 100.00f;
	}

}

public class TestItem {

	public static void main(String[] args) {
		Item it1 = new Burger();
		System.out.println("burger name and price");
		System.out.println(it1.itemName());
		System.out.println(it1.itemPrice());

		Item it2 = new CoolDrinks();
		System.out.println(it2.itemName());
		System.out.println(it2.itemPrice());
		
		System.out.println("total price:"+(it1.itemPrice()+it2.itemPrice()));
	}

}
