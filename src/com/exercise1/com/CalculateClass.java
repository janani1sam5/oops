/**
 * 
 */
package com.exercise1.com;

/**
 * @author VedhuSudhu
 *
 */
public class CalculateClass {
	
	public static void main(String[] args) {

	Bouquet bouq = new Bouquet();
	
	Flower flower1 = new Flower();
	flower1.setName("Rose");
	flower1.setPrice(1);
	bouq.addFlower(flower1);
	
	Flower flower2 = new Flower();
	flower2.setName("Jasmine");
	flower2.setPrice(2);
	bouq.addFlower(flower2);
	
	Flower flower3 = new Flower();
	flower3.setName("Lilly");
	flower3.setPrice(3);
	bouq.addFlower(flower3);
	double calculatePrice = calculatePrice(bouq);
	System.out.println("Cost of the Bouquet is ="+calculatePrice);

	}
public static double calculatePrice(Bouquet bouq) {
	double totalPrice = 0;
	for(Flower totalFlower: bouq.getFlower()) {
		totalPrice=totalPrice+totalFlower.getPrice();
	}
	return totalPrice;
 }
}
