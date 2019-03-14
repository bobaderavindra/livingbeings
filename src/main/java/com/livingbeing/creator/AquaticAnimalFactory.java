package com.livingbeing.creator;

import com.livingbeing.AnimalType;

public class AquaticAnimalFactory extends AnimalTypeFactory {

@Override
public AnimalFactory createFactory() {
    return new OceanAnimalFactory(AnimalType.AQUATIC);
}
}
