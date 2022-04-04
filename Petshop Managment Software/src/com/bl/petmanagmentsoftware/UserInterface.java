package com.bl.petmanagmentsoftware;
import java.util.Set;

public class UserInterface {
	public void print(Set<Pet> petList) {
		/*
		 * for(integer i = 0;i < petList.size(); i++) { System.out.println(petList.get(i));
		 * }
		 */
		for(Pet o: petList) {
			System.out.println(o);
		}
	}
	//object instance of Animal
	public void printAnimals(Set<Pet> PetList){
		for(Pet o: PetList) {
			if(o instanceof Animal) {
				System.out.println(o);
			}
		}
	}
	public void printBirds(Set<Pet> PetList){
		for(Pet o: PetList) {
			if(o instanceof Bird) {
				System.out.println(o);
			}
		}
	}

	public void printSwimables(Set<Pet> petList) {
		for(Pet pet: petList) {
			if(pet instanceof Swimmable) {
				Swimmable swimmablePet = (Swimmable)pet;
				swimmablePet.swim();
				System.out.println(pet);	
			}
		}
	}
}