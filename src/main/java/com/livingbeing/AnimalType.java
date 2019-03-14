package com.livingbeing;

public enum AnimalType {

	TERRESTRIAL("\nLeave on land\n"), AQUATIC("\nLeave in water\n"), TRANSFORMER("\nAnimal change their behaviour over time\n");

	private String demo;

	AnimalType(String demo) {
		this.demo = demo;
	}

	@Override
	public String toString() {
		return this.demo;
	}
}
