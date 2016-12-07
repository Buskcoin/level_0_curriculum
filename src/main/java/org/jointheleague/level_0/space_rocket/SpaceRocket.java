package org.jointheleague.level_0.space_rocket;
import processing.core.PApplet;

/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Space Rocket
Duration=.25
Platform=Processing
Type=Recipe
Objectives=Incrementing a variable
Optional=Yes
*/

/* 1. Change the code below to make the rocket ship take off. */
/* 2. Add a moon and stars to the sky. */
public class SpaceRocket extends PApplet{

public static void main(String[] args) {
		PApplet.main(new String[] {"org.jointheleague.level_0.space_rocket.SpaceRocket"});
	}
int x = 400;
int y = 600;

public void settings() {
    size(800, 800);
}
public void setup(){
	background(0, 0, 40);
}

public void draw() {
  fill(random(255), 0, 0);
  ellipse(x, y + 130, 90, 90);
  fill(248, 128, 0);
  ellipse(x, y + 115, 70, 70);
  fill(255, 153, 0);
  ellipse(x, y + 95, 35, 35);
  fill(100, 100, 100);
  triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
}

}
															