package com.livingbeing.creator;

import com.livingbeing.AnimalType;

public class TerrestrialAnimalFactory extends AnimalTypeFactory{

@Override
public AnimalFactory createFactory() {
    return new LandAnimalFactory(AnimalType.TERRESTRIAL);
}

}
