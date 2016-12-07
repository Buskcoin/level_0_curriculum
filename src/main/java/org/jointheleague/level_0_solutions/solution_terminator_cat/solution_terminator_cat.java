/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Terminator Cat
 *    Solution
 *    
 *    
 ******************************************************************************/

import ddf.minim.*;      
AudioSample sound;       


int x = 375;
int y = 320;
int acceleration;   


void setup() {
  size(1024, 768); 


  PImage catPic=loadImage("cat.jpg");    
  background(catPic);      


  Minim minim = new Minim(this);         
  sound = minim.loadSample("cat-lazer.wav");
}


void draw() {
  noStroke();
  fill(240, 0, 0);
  ellipse(x, y, 60, 50);
  ellipse(x+220, y, 60, 50);


  if (x<0 && y<0) {
    x = 375;
    y = 320;
    PImage catPic = loadImage("cat.jpg");    
    background(catPic);     
    acceleration = 1;
  }
}


void keyPressed() {
  if (acceleration == 1)  //if the lazer is at the eye position
    sound.trigger();        


  acceleration++;


  y-=2*acceleration;
  x-=2*acceleration;
}

