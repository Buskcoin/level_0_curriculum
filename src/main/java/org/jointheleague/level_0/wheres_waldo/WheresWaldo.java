package org.jointheleague.level_0.wheres_waldo;

import processing.core.*;

/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Where's Waldo
Duration=.25
Platform=Processing
Type=Recipe
Objectives=Processing 
*/

public class WheresWaldo extends PApplet{

	public static void main(String[] args) {
		PApplet.main(new String[] {"org.jointheleague.level_0.tasty_tomato.TastyTomato"});
	}
	

// 1. Find a really hard Where’s Waldo puzzle, save it, and drop it onto this sketch.
    
public void setup() {
    PImage waldo = loadImage("waldo.jpg"); 
	
	// 2. Change this to match your file name.
    size(waldo.width, waldo.height);
    image(waldo, 0, 0);
}

public void draw() {
    // 3. Use this print statement to find out the coordinates of Waldo
    // println("X: " + mouseX + " Y: " + mouseY); 

    // 4. If the mouse is on Waldo, print “Waldo found!”

    // 5. If Waldo is found, also use the method below to play “Woohoo”

    // 6. If the mouse is pressed and they’re not on Waldo, play “Doh”

}

//void playWoohoo() {
//  woohoo.stop();
//  woohoo.trigger();
//}
//
//void playDoh() {
//  doh.stop();
//  doh.trigger();
//}

//import ddf.minim.*;
//import processing.core.PApplet;
//Minim minim = new Minim(this);   
//AudioSample doh = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-doh.wav");
//AudioSample woohoo = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-woohoo.wav");

}
																	