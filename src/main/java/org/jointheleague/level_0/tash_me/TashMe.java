package org.jointheleague.level_0.tash_me;


import processing.core.*;


/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Tash Me!
Duration=.75
Platform=Processing
Type=Recipe
Objectives=images & sounds, if (mousePressed)
*/

/** 
Used in workshop	
Similar to Unicorns on a Rainbow
*/
public class TashMe extends PApplet{

public static void main(String[] args) {
		PApplet.main(new String[] {"org.jointheleague.level_0.tash_me.TashMe"});
	}
PImage mustache;

public void setup() {
  // 1. Get a photo of your friends, and drop it onto this sketch.
  PImage friends = loadImage("friends.jpg");  
  
  // 2. Change this to match the name of your photo. 
  size(friends.width, friends.height);
  
  // 3. Set your friends as the background. 

  // 4. Find an image of a mustache, and drop it onto this sketch. 
  mustache = loadImage("tash.png"); // 5. Change this to match your file name.
}

public void draw() {
  // 8. Only draw the mustache when the mouse is pressed.

  // 6. Add the mustache using: image(mustache, xPosition, yPosition)

  // 7. Change the line above so that the mustache moves with the mouse.

  // 9. [optional] You might want to adjust mouseX and mouseY so that your tash is drawn exactly where the mouse is clicked.

  // 10. [optional] Draw a hat on your friends when the right mouse button is clicked: if (mouseButton == RIGHT)
  
}


}

																