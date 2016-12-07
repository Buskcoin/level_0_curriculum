package org.jointheleague.level_0.unicorns_on_a_rainbow;
import processing.core.*;

/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Unicorns on a Rainbow
Duration=.75
Platform=Processing
Type=Recipe
Objectives=images & sounds, if (mousePressed)
*/

/**
Used in workshop	
Similar to Tash Me!	
*/											
public class UnicornsOnARainbow extends PApplet{

	public static void main(String[] args) {
		PApplet.main(new String[] {"org.jointheleague.level_0.unicorns_on_a_rainbow.UnicornsOnARainbow"});
	}
	
PImage rainbow;
PImage unicorn;

public void setup() {
  // 1. Find an image of a rainbow, save it, and drop it onto this sketch.
  rainbow = loadImage("rainbow.png");  // 2. Change this to match your file name. 
  size(rainbow.width, rainbow.height);
  // 3. Set the rainbow as the background. Behold the rainbow!

  // 4. Find an image of a unicorn, save it, and drop it onto this sketch.  
  unicorn = loadImage("unicorn.jpg"); // 5. Change this to match your file name.
}

public void draw() {
  // 6. Draw the unicorn using: image(PImage image, int xPosition, int yPosition)
 
  // 7. Change the line above so that the unicorn moves with the mouse.
  // 8. You may want to make your unicorn transparent. See these instructions: bit.ly/pretty-unicorn
  // 9. When the mouse is pressed, reload the rainbow background
  
}

}