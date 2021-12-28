package com.basicpgm1;

class Author {

	String name;
	String email;
	char gender;

	public Author(String name, String email, char gender) {

		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}

class Book {

	String bookName;
	double price;
	int qty;
	String author;

	public Book(String bookName, double price, int qty, String author) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.qty = qty;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}

public class Test {
	public static void main(String[] args) {
		
		Author a=new Author("raju", "raju@gmail.com", 'M');
	System.out.println(a.getName()+" ," +a.getEmail()+"," +a.getGender());
	a.setName("raju");
	a.setEmail( "raju@gmail.com");
	System.out.println(a.getName()+" ," +a.getEmail()+"," +a.getGender());
	
	Book b=new Book("computer network",200.00d , 3,"raju" );
	System.out.println(b.bookName+","+b.author+"," +b.qty+","+b.price);
	}
}