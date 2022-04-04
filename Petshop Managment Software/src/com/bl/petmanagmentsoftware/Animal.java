package com.bl.petmanagmentsoftware;

public abstract class Animal extends Pet {
	String breed;

	@Override
	public String toString() {
		return "Animal [breed=" + breed +  " "+ "id=" + id + ", colour=" + colour + ", name=" + name + ", age=" + age + ", price=" + price + "]";
	}
}
