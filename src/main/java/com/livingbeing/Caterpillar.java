package com.livingbeing;

public class Caterpillar implements Animal {

	private AnimalType at;
	private CategoryType ct;

	public Caterpillar(AnimalType at, CategoryType ct) {
		this.at = at;
		this.ct = ct;
	}
	
	@Override
	public void fly() throws Exception {
		System.out.println(at);
		System.out.println(ct);
		throw new Exception(" Not able to fly  ");
	}

	@Override
	public void sing() {
		System.out.println("I am singing - Cock-a-doodle-doo");
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