package com.livingbeing;

public enum CategoryType {

	
	BIRD("\nBIRD\n"), DUCK("\nDUCK\n"), CHICKEN("\nCHICKEN\n"), ROOSTER("\nROOSTER\n"), PARROT("\nPARROT\n"),
	FISH("\nFISH\n"), SHARK("\nSHARK\n"), CLOWNFISH("\nCLOWNFISH\n"),
	BUTTERFLY("BUTTERFLY"), CATERPILLER("CATERPILLER");

	private String demo;

	CategoryType(String demo) {
		this.demo = demo;
	}

	@Override
	public String toString() {
		return this.demo;
	}
}
