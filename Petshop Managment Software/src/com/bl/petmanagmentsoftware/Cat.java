package com.bl.petmanagmentsoftware;

public class Cat extends Animal {

	public Cat(String id) {
		this.id = id;
		name = "cat";
		colour = Colour.BLACK;	
	}

	@Override
	public void eats() {
		System.out.println("Cat eats mouse");
	}
}
