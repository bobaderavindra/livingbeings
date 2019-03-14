package com.livingbeing.creator;

import com.livingbeing.Animal;
import com.livingbeing.AnimalType;
import com.livingbeing.CategoryType;
import com.livingbeing.ClawnFish;
import com.livingbeing.FishAnimal;
import com.livingbeing.Shark;

public class OceanAnimalFactory implements AnimalFactory {

	private AnimalType at;

	public OceanAnimalFactory(AnimalType at) {
		this.at = at;
	}

	@Override
	public Animal createAnimal(CategoryType catType) throws Exception {
		Animal animal = null;

		switch (catType) {

		case FISH:
			animal = new FishAnimal(at, catType) {
			};
			break;
		case SHARK:
			animal = new Shark(at, catType);
			break;
		case CLOWNFISH:
			animal = new ClawnFish(at, catType);
			break;
		default:
			throw new Exception(" Not able to create Ocean Animal  ");
		}
		return animal;
	}

}
