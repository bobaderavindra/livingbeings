package com.livingbeing.creator;

import com.livingbeing.Animal;
import com.livingbeing.AnimalType;
import com.livingbeing.Butterfly;
import com.livingbeing.CategoryType;
import com.livingbeing.Caterpillar;

public class TransformAnimalFactory implements AnimalFactory {
	private AnimalType at;

	public TransformAnimalFactory(AnimalType at) {
		this.at = at;
	}

	@Override
	public Animal createAnimal(CategoryType catType) throws Exception {
		Animal animal = null;

		switch (catType) {

		case BUTTERFLY:
			animal = new Butterfly(at, catType) {
			};
			break;
		case CATERPILLER:
			animal = new Caterpillar(at, catType);
			break;
		default:
			throw new Exception(" Not able to create Transformer Animal  ");
		}
		return animal;
	}

}
