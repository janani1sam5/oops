package com.exercise2.com;

import java.util.HashSet;
import java.util.Set;

public class Home {
	
  Set<Appliances> setappliances = new HashSet<>();
	
	public void addAppliances(Appliances appliances) {
		setappliances.add(appliances);
	}
	
	public Set<Appliances> getAppliances(){
		return setappliances;
	}

}
