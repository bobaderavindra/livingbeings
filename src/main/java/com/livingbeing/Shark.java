package com.livingbeing;

public class Shark implements Fish {

	private AnimalType at;
	private CategoryType ct;

	public Shark(AnimalType at, CategoryType ct) {
		this.at = at;
		this.ct = ct;
		System.out.print("Sharks are large and grey");
		System.out.print("Sharks eat other fish"); 
	}
	
	
	@Override
	public void walk() throws Exception {
		System.out.print(at);
		System.out.print(ct);
		throw new Exception(" Not able to fly  ");
		
	}

	@Override
	public void swim() {
		System.out.println("I am swimming");
		System.out.print(at);
		System.out.print(ct);
	}

	@Override
	public void sing() throws Exception {
		System.out.print(at);
		System.out.print(ct);
		throw new Exception(" Not able to fly  ");
		
	}

	@Override
	public void fly() throws Exception {
		System.out.print(at);
		System.out.print(ct);
		throw new Exception(" Not able to fly  ");
		
	}

}
