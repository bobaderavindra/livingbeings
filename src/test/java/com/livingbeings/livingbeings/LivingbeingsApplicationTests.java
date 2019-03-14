package com.livingbeings.livingbeings;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.livingbeing.Animal;
import com.livingbeing.CategoryType;
import com.livingbeing.creator.AnimalFactory;
import com.livingbeing.creator.AnimalTypeFactory;
import com.livingbeing.creator.TerrestrialAnimalFactory;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LivingbeingsApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void LivingBeingTest() {

		Animal animal = null;
		AnimalTypeFactory animalTypeFactory = null;
		AnimalFactory animalFactory = null;
		animalTypeFactory = new TerrestrialAnimalFactory();
		animalFactory = animalTypeFactory.createFactory();
		try {
			animal = animalFactory.createAnimal(CategoryType.BIRD);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		animal.swim();
	    try {
			animal.walk();
		} catch (Exception e) {
			  assertThat(e.getMessage(), is("Index: 0, Size: 0"));
		}
	}

}
