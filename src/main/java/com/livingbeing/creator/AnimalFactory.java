package com.livingbeing.creator;

import com.livingbeing.Animal;
import com.livingbeing.CategoryType;

public interface AnimalFactory {
	Animal createAnimal(CategoryType dietType) throws Exception;
}
