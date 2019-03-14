package com.livingbeing.creator;

import com.livingbeing.Animal;
import com.livingbeing.AnimalType;
import com.livingbeing.BirdAnimal;
import com.livingbeing.CategoryType;
import com.livingbeing.ChickenBird;
import com.livingbeing.DuckBird;
import com.livingbeing.Rooster;

public class LandAnimalFactory implements AnimalFactory {

	private AnimalType at;

	public LandAnimalFactory(AnimalType at) {
		this.at = at;
	}

	@Override
	public Animal createAnimal(CategoryType catType) throws Exception {
		Animal animal = null;

		switch (catType) {
		case BIRD:
			animal = new BirdAnimal(at, catType);
			break;
		case DUCK:
			animal = new DuckBird(at, catType);
			break;
		case CHICKEN:
			animal = new ChickenBird(at, catType);
			break;
		case ROOSTER:
			animal = new Rooster(at, catType);
			break;
		default:
			throw new Exception(" Not able to create Land Animal  ");
		}
		return animal;

	}

}
