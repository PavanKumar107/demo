package com.bl.petmanagmentsoftware;

public abstract class Bird extends Pet {
	String species;

	@Override
	public String toString() {
		return "Bird [species=" + species + " "+ "id=" + id + ", colour=" + colour + ", name=" + name + ", age=" + age + ", price=" + price + "]";
	}	
}
	
