package com.livingbeing;

public enum DietType {

	CARNIVORE("\nFeed on flesh\n"), HERBIVORE("\nFeed on plants\n");

	private String demo;

	DietType(String demo) {
		this.demo = demo;
	}

	@Override
	public String toString() {
		return this.demo;
	}
}
