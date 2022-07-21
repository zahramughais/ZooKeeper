package com.zookeeper1;

public class Gorilla extends Mammal{
	
	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		int energy = super.getEnergyLevel();
		energy -= 5;
		super.setEnergyLevel(energy);
		System.out.println("The Gorilla has throwing something " + displayEnergy());
	}
	
	public void eatBananas() {
		int energy = super.getEnergyLevel();
		energy += 10;
		super.setEnergyLevel(energy);
		System.out.println("The Gorilla had Eating Banana " + displayEnergy());
	}
	
	public void climb() {
		int energy = super.getEnergyLevel();
		energy -= 10;
		super.setEnergyLevel(energy);
		System.out.println("The Gorilla Has Climbed a Tree " + displayEnergy());
	}
}
