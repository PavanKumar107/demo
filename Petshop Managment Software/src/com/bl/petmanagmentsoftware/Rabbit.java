package com.bl.petmanagmentsoftware;

public class Rabbit extends Animal {
	
	public Rabbit(String id) {
		this.id = id;
		name = "rabbit";
		colour = Colour.BROWN;	
	}
	
	@Override
	public void eats() {
		System.out.println("Rabbit eats grass");
	}

}
