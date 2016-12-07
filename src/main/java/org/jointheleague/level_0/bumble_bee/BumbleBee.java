package org.jointheleague.level_0.bumble_bee;
import processing.core.PApplet;

/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Bumble Bee
 *    Duration=.00
 *    Platform=Processing
 *    Type=Recipe
 *    Objectives=Calling a method, for loop
 *    
 *    
 ******************************************************************************/

/** 
In Processing make a Yellow and black line of circles.
https://docs.google.com/document/d/1DH4WJDOIHpGVJLujmYgMWl-mllDV-bN9OuCaoFZmsXU/edit																
*/
public class BumbleBee extends PApplet{

	public static void main(String[] args) {
		PApplet.main(new String[] {"org.jointheleague.level_0.bumble_bee.BumbleBee"});
	}
	

public void draw() {
  /*Use A loop to make a body for the Bee!
   Then put his head on using drawBeeFace(x,y)
   Use Modulo to make the colors alternate 
   */

}


void drawFlower(int x, int y) {
  noStroke();
  translate(x, y);
  // draw 5 petals, rotating after each one
  fill(0, 200, 20); // green
  for (int i = 0; i < 5; i++) {
    ellipse(0, -40, 50, 50);
    rotate(radians(72));
  }
  fill(200,200,0); // light yellow
  ellipse(0, 0, 50, 50);
}


void drawBeeFace(int BeeFaceX, int BeeFaceY) {
  noStroke();
  fill(0, 0, 0);
  stroke(1);
  strokeWeight(5);
  line(BeeFaceX-10, BeeFaceY-27, BeeFaceX-17, BeeFaceY-50);
  line(BeeFaceX+10, BeeFaceY-27, BeeFaceX+17, BeeFaceY-50);
  ellipse(BeeFaceX-17, BeeFaceY-50, 10, 10);
  ellipse(BeeFaceX+17, BeeFaceY-50, 10, 10);
  noStroke();
  fill(255, 251, 28);
  ellipse(BeeFaceX, BeeFaceY, 60, 60); // face
  fill(255, 237, 209);
  fill(0, 0, 0);
  ellipse(BeeFaceX-10, BeeFaceY-15, 10, 10); // eyes
  ellipse(BeeFaceX+10, BeeFaceY-15, 10, 10);
  ellipse(BeeFaceX, BeeFaceY-5, 10, 10); // nose
  ellipse(BeeFaceX, BeeFaceY+10, 20, 10);// mouth
  fill(255, 251, 28);
  ellipse(BeeFaceX, BeeFaceY+5, 20, 6);
}

public void settings(){
	size(500, 500);
}
public void setup() {  
  ellipseMode(CENTER);
  background(160, 160, 160); 
  drawFlower(350, 100);
}
}





																