package com.bl.petmanagmentsoftware;

public class Duck extends Bird implements Flyable, Swimmable{
	
	public Duck(String id) {
		this.id = id;
		name = "duck";
		colour = Colour.WHITE;
	}
	
	@Override
	public void eats() {
		System.out.println("Duct eats fish");
	}

	@Override
	public void swim() {
		System.out.println("Duct can Swim");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		System.out.println("Duct can Fly");
		// TODO Auto-generated method stub
		
	}
}
