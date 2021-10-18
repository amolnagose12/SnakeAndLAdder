package com.bridgelabz;

public class SnakeAndLadder {
	public static void main(String[] args) {
		
		// generating random number from 1 to 6 
		int diceNumber = (int) Math.floor(Math.random() * 10) % 6 + 1;
		System.out.println("diceNumber is : " + diceNumber);
	}
}