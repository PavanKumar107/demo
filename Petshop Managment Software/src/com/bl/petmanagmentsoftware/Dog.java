package com.bl.petmanagmentsoftware;

public class Dog extends Animal implements Swimmable {
	
	public Dog(String id) {
		this.id = id;
		name = "dog";
		colour = Colour.BLACK_WHITE;
	}
	
	@Override
	public void eats() {
		System.out.println("Dog eats flesh");
	}

	@Override
	public void swim() {
		System.out.println("Dog can Swim");
		// TODO Auto-generated method stub
		
	}
}
