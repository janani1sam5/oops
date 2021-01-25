
package com.exercise1.com;

import java.util.HashSet;
import java.util.Set;

public class Bouquet {

	Set<Flower> setflower = new HashSet<>();
	
	public void addFlower(Flower flower) {
		setflower.add(flower);
	}
	
	public Set<Flower> getFlower(){
		return setflower;
	}
}
