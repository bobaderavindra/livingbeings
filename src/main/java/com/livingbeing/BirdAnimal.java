package com.livingbeing;

public class BirdAnimal implements Bird {

	private AnimalType at;
	private CategoryType ct;

	public BirdAnimal(AnimalType at, CategoryType ct) {
		this.at = at;
		this.ct = ct;
	}
	
	@Override
	public void fly() {
		System.out.println("I am flying");
		System.out.println(at);
		System.out.println(ct);
	}

	@Override
	public void sing() {
		System.out.println("I am singing");
		System.out.println(at);
		System.out.println(ct);
	}

	@Override
	public void walk() {
		System.out.println("I am walking");
		System.out.println(at);
		System.out.println(ct);
	}

	@Override
	public void swim() {
		System.out.println("I am swiming");
		System.out.println(at);
		System.out.println(ct);
	}

}
