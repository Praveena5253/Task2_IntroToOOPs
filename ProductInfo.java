package com.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
	private String id;  
	private int qty;  
	private double price;  
	private double totalPrice;

	public Product() {
	}

	public Product(String id, int qty, double price, double totalPrice) {
		this.id = id;
		this.qty = qty;
		this.price = price;
		this.totalPrice = totalPrice;
	} 

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}



	public void findHighestPriceProductId(List<Product> products) {
		// Assuming product has the getPrice method
		double highestPrice = products.get(0).getPrice();
		String higPriceProductId = products.get(0).getId();;
		Product expensiveProduct;
		// Iterate through the list of products
		for(int i = 1; i < products.size(); i++){

			// if the next item is more expensive, assign that value as the most expensive
			if (highestPrice < products.get(i).getPrice()){
				highestPrice = products.get(i).getPrice();
				higPriceProductId = products.get(i).getId();
				expensiveProduct = products.get(i);
			}
		}
		System.out.println("\nThe highest price product Id: " + higPriceProductId);
	}

	public static void displayHeader() {
		System.out.print("\n--------------------------------------------------------------------\n");
		System.out.print("\nProduct ID \t Quantity \t Price \t\t Total Price\n");
		System.out.print("\n--------------------------------------------------------------------\n");
	}

	public void display()   
	{  
		System.out.format("   %-5s        %5d        %9.2f        %12.2f\n" ,id, qty, price, totalPrice);  
	}  
}

public class ProductInfo {

	public static void main(String[] args) {
		String id = null;  
		int quantity = 0;  
		double price = 0.0;  
		double totalPrice = 0.0;  
		double overAllPrice = 0.0;
		char choice;

		Scanner s = new Scanner(System.in);
		Product p = new Product();

		//creating an ArrayList to store the product  
		List<Product> productlist = new ArrayList<Product>();  
		do {
			// read input values  
			System.out.println("Enter the product details: ");  
			System.out.print("Product ID: ");  
			id = s.next();  
			System.out.print("Quantity: ");  
			quantity = s.nextInt();  
			System.out.print("Price (per unit): ");  
			price = s.nextDouble();  
			//calculate total price for a particular product  
			totalPrice = price * quantity;  
			//calculates overall price  
			overAllPrice = overAllPrice + totalPrice;  
			//creates Product class object and add it to the List  
			productlist.add( new Product(id, quantity, price, totalPrice) );  
			// ask for continue shopping?  
			System.out.println("\nWant to add more items? (y or n): ");  
			choice = s.next().charAt(0);  
		}   while (choice == 'y' || choice == 'Y');  

		p.findHighestPriceProductId(productlist);

		Product.displayHeader();  
		for (Product pdis : productlist)   
		{  
			pdis.display();  
		} 
		System.out.format("\n\n\t\t\t\t\t         Total Amount %.2f", overAllPrice);  
	}
}


