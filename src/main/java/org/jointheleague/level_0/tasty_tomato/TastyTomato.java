package org.jointheleague.level_0.tasty_tomato;
import processing.core.*;

/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Tasty Tomato
Duration=.5
Platform=Processing
Type=Instructions
Objectives=Processing practice
*/

//Here is some code that draws a tomato…
public class TastyTomato extends PApplet{

	public static void main(String[] args) {
		PApplet.main(new String[] {"org.jointheleague.level_0.tasty_tomato.TastyTomato"});
	}
	
	
	public void settings() {
		size(500, 500);
	}
	public void draw() {
	  background(200, 200, 200);
	  noStroke();
	  ellipse(150, 200, 150, 150);
	  ellipse(212, 200, 150, 150);
	  rect(176, 103, 12, 32);
	}

/*
Make the tomato red.
Make the stem green.
Take a bite out of the tomato.
Only bite the tomato when the mouse is pressed

[optional] programming soundtrack
*/
}