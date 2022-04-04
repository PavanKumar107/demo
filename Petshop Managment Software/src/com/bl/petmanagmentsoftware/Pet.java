package com.bl.petmanagmentsoftware;

import java.util.Objects;

public abstract class Pet {
	enum Colour{RED, GREEN, BLACK, BLUE, WHITE, GRAY, BLACK_WHITE, BROWN}
	String id;
	Colour colour;
	String name;
	int age;
	int price;
	
	public abstract void eats();

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", colour=" + colour + ", name=" + name + ", age=" + age + ", price=" + price + "]";
	}
}
