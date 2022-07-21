package com.zookeeper1;

public class Mammal {
	private int energyLevel;
	
	public Mammal() {
		energyLevel = 100;
	}
	
	public int getEnergyLevel() {
		return this.energyLevel;
	}
	
	public void setEnergyLevel(int energy) {
		this.energyLevel = energy;
	}
	
	public int displayEnergy() {
		System.out.println("The Energy Level is: " + this.energyLevel);
		return this.energyLevel;
	}
	
}
