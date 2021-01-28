package com.exercise2.com;

public class Power {

	public static void main(String[] args) {

		Home h = new Home();
		
		Appliances appliances1 = new Appliances();
		appliances1.setName("Fan");
		appliances1.setUnit(1.0f);
		appliances1.setPrice(100);
		h.addAppliances(appliances1);
		
		Appliances appliances2 = new Appliances();
		appliances2.setName("Light");
		appliances2.setUnit(2.0f);
		appliances2.setPrice(200);
		h.addAppliances(appliances2);
		
		Appliances appliances3 = new Appliances();
		appliances3.setName("TV");
		appliances3.setUnit(3.0f);
		appliances3.setPrice(300);
		h.addAppliances(appliances3);
		
		Appliances appliances4 = new Appliances();
		appliances4.setName("Laptop");
		appliances4.setUnit(4.0f);
		appliances4.setPrice(400);
		h.addAppliances(appliances4);
		double calculatePrice = calculatePrice(h);
		System.out.println("Cost for Power consumed ="+calculatePrice);

		}
	public static double calculatePrice(Home h) {
		double totalPrice = 0;
		for(Appliances totalAppliances: h.getAppliances()) {
			totalPrice=totalPrice+totalAppliances.getPrice();
		}
		return totalPrice;
	 }
}
