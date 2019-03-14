package com.livingbeing.creator;

import com.livingbeing.AnimalType;

public class TransformerAnimalFactory extends AnimalTypeFactory {

@Override
public AnimalFactory createFactory() {
    return new TransformAnimalFactory(AnimalType.TRANSFORMER);
}
}