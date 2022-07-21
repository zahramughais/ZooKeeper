package com.zookeeper1;

public class Bat extends Mammal {
	
	public Bat() {
		super();
		this.setEnergyLevel(300);
	}
	
	public void fly() {
		int energy = super.getEnergyLevel();
		energy -= 50;
		super.setEnergyLevel(energy);
		System.out.println("The Bat is flying Flap Flap " +  displayEnergy());
	}
	
	public void eatHumans() {
		int energy = super.getEnergyLevel();
		energy += 25;
		super.setEnergyLevel(energy);
		System.out.println("The Bat Is Coming to Eat Some Humans " + displayEnergy());
	}
	
	public void attackTown() {
		int energy = super.getEnergyLevel();
		energy -= 100;
		super.setEnergyLevel(energy);
		System.out.println("The Bat is Attacking, FIRE! " + displayEnergy());
	}
}
