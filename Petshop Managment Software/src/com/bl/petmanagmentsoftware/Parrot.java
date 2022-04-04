package com.bl.petmanagmentsoftware;

public class Parrot extends Bird implements Flyable {
	
	public Parrot(String id) {
		this.id = id;
		name = "parrot";
		colour = Colour.GREEN;
	}
	
	@Override
	public void eats() {
		System.out.println("Parrot eats fruits");
	}

	@Override
	public void fly() {
		System.out.println("Parrot can Fly");
		// TODO Auto-generated method stub
		
	}
}
