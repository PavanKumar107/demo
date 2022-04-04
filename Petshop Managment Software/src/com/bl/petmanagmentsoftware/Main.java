package com.bl.petmanagmentsoftware;

import java.util.Set;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Pet Managment System");

		Animal dog = new Dog("d001");
		dog.age = 2;
		dog.price = 4000;
		dog.breed = "lab";

		Bird parrot = new Parrot("p001");
		parrot.age = 1;
		parrot.price = 300;
		parrot.species = "greenparrot";

		Bird parrot1 = new Parrot("p001");
		parrot.age = 1;
		parrot.price = 300;
		parrot.species = "greenparrot";

		Animal rabbit = new Rabbit("r001");
		rabbit.age = 4;
		rabbit.price = 200;
		rabbit.breed = "tworabbits";

		Bird duck = new Duck("d001");
		duck.age = 3;
		duck.price = 250;
		duck.species = "whiteduck";

		Animal cat = new Cat("c001");
		cat.age = 1;
		cat.price = 600;
		cat.breed = "smallcat";

		Petstorage petStorage = new Petstorage();
		petStorage.add(dog);
		petStorage.add(parrot);
		petStorage.add(rabbit);
		petStorage.add(duck);
		petStorage.add(cat);
		petStorage.add(parrot1);

		UserInterface userInterface = new UserInterface();
		//userInterface.print(petStorage.getPetList());
		Set petList = petStorage.getPetList();
		userInterface.print(petList);

		/*
		 * petStorage.remove(cat); System.out.println("After Removing");
		 * userInterface.print(petList)
		 */;
		 System.out.println("Print Animals");
		 userInterface.printAnimals(petList);
		 System.out.println("Print Birds");
		 userInterface.printBirds(petList);
	}
}
