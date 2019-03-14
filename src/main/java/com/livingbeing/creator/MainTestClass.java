package com.livingbeing.creator;

import java.util.ArrayList;
import java.util.List;

import com.livingbeing.Animal;
import com.livingbeing.AnimalType;
import com.livingbeing.BirdAnimal;
import com.livingbeing.CategoryType;
import com.livingbeing.FishAnimal;
import com.livingbeing.ParrotFriends;


public class MainTestClass {
	
	public static List<Animal> process(){
		
		//A	: Starts here
		List<Animal> animalList = new ArrayList<>();
		BirdAnimal birdAnimal = new BirdAnimal(AnimalType.TERRESTRIAL, CategoryType.BIRD);
		birdAnimal.walk();
		birdAnimal.fly();
		birdAnimal.sing();
        	
		AnimalTypeFactory animalTypeFactory = null;
		AnimalFactory animalFactory = null;
		try {
			animalTypeFactory = new TerrestrialAnimalFactory();
			animalFactory = animalTypeFactory.createFactory();
			Animal  bird = animalFactory.createAnimal(CategoryType.BIRD);
			bird.swim();
			bird.walk();
			
			Animal  duck = animalFactory.createAnimal(CategoryType.DUCK);
			duck.swim();
			duck.sing();
			
			Animal chicken = animalFactory.createAnimal(CategoryType.CHICKEN);
			chicken.sing();
			try {
				chicken.fly();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			Animal rooster = animalFactory.createAnimal(CategoryType.ROOSTER);
			rooster.sing();
			
			animalList.add(birdAnimal);
			animalList.add(bird);
			animalList.add(duck);
			animalList.add(chicken);
			animalList.add(rooster);
			
			Animal doggyparrot = new ParrotFriends(AnimalType.TERRESTRIAL, CategoryType.PARROT) {
				@Override
				public void sing() {
					System.out.println("Woof, woof");
				}
			};
			doggyparrot.sing();
			
			Animal catparrot = new ParrotFriends(AnimalType.TERRESTRIAL, CategoryType.PARROT) {
				@Override
				public void sing() {
					System.out.println("Meow");
				}
			};
			catparrot.sing();
			
			Animal roosterparrot = new ParrotFriends(AnimalType.TERRESTRIAL, CategoryType.PARROT) {
				@Override
				public void sing() {
					System.out.println("Cock-a-doodle-doo");
				}
			};
			roosterparrot.sing();
			
			animalList.add(doggyparrot);
			animalList.add(catparrot);
			animalList.add(roosterparrot);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//B	: Starts here
		FishAnimal fish = new FishAnimal(AnimalType.AQUATIC, CategoryType.FISH) {};
		try {
			fish.sing();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			fish.walk();
		} catch (Exception e) {
			e.printStackTrace();
		}
		fish.swim();
		animalList.add(fish);
		
		Animal  fishAnimal = null;
		AnimalTypeFactory fishAnimalTypeFactory = null;
		AnimalFactory fishAnimalFactory = null;
		
		try {
			fishAnimalTypeFactory = new AquaticAnimalFactory();
			fishAnimalFactory = fishAnimalTypeFactory.createFactory();
			
			fishAnimal = fishAnimalFactory.createAnimal(CategoryType.FISH);
			fishAnimal.swim();
			try {
				fishAnimal.sing();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				fishAnimal.walk();
			} catch (Exception e) {
				e.printStackTrace();
			}
			animalList.add(fishAnimal);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//D	: Starts here
		AnimalTypeFactory birdAnimalTypeFactory = null;
		AnimalFactory birdAnimalFactory = null;
		
		try {
			birdAnimalTypeFactory = new AquaticAnimalFactory();
			birdAnimalFactory = birdAnimalTypeFactory.createFactory();
			
			Animal butterfly = birdAnimalFactory.createAnimal(CategoryType.BUTTERFLY);
			butterfly.fly();
			try {
				butterfly.sing();
			} catch (Exception e) {
				e.printStackTrace();
			}
			animalList.add(butterfly);
			Animal caterpiller = fishAnimalFactory.createAnimal(CategoryType.CATERPILLER);
			caterpiller.walk();
			try {
				caterpiller.fly();
			} catch (Exception e) {
				e.printStackTrace();
			}
			animalList.add(caterpiller);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return animalList;
	}
	
	public static void main(String[] args) throws Exception {
		
		process();
	}
}
