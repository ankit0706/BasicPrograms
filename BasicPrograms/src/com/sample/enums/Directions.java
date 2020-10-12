package com.sample.enums;

/**
 * An enum constructor can not be made public
 * @param i
 */
public enum Directions {
	NORTH(1), WEST(2), SOUTH(3), EAST(4);
	
	private final int number;
	
	Directions(int i) {
		this.number = i;
	}
	
	public int getDirectionNumberD() {
		return this.number;
	}
	
}
