package com.exercise2.com;

import com.exercise1.com.Bouquet;
import com.exercise1.com.Flower;

public class Power {

	public static void main(String[] args) {

		Home h = new Home();
		
		Appliances appliances1 = new Appliances();
		appliances1.setName("Fan");
		appliances1.setPrice(1);
		h.addAppliances(appliances1);
		
		Appliances appliances2 = new Appliances();
		appliances2.setName("Light");
		appliances2.setPrice(2);
		h.addAppliances(appliances2);
		
		Appliances appliances3 = new Appliances();
		appliances3.setName("TV");
		appliances3.setPrice(3);
		h.addAppliances(appliances3);
		
		Appliances appliances4 = new Appliances();
		appliances4.setName("Laptop");
		appliances4.setPrice(4);
		h.addAppliances(appliances4);
		double calculatePrice = calculatePrice(h);
		System.out.println("Cost of the Bouquet is ="+calculatePrice);

		}
	public static double calculatePrice(Home h) {
		double totalPrice = 0;
		for(Appliances totalAppliances: h.getAppliances()) {
			totalPrice=totalPrice+totalAppliances.getPrice();
		}
		return totalPrice;
	 }
}
