package org.jointheleague.level_0_solutions.solution_banana_split;
import processing.core.PApplet;

/*******************************************************************************
 * Copyright (c) The League of Amazing Programmers 2013-2017 Level 0 Banana
 * Split Solution
 * 
 ******************************************************************************/
public class BananaSplit extends PApplet {

	public static void main(String[] args) {
		PApplet.main(new String[] { "org.jointheleague.level_0_solutions.solution_banana_split.BananaSplit" });
	}

	public void setup() {
		background(187, 017, 153);
		for (int i = 4; i < 7; i++) {
			text("ice cream", 20, i * 10);
		}
		text("banana", 20, 70);
	}
}