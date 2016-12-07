package org.jointheleague.level_0_solutions.solution_amazing_rings;
import processing.core.PApplet;

/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Amazing Rings
 *    Solution
 *    
 ******************************************************************************/

public class AmazingRings extends PApplet{

	public static void main(String[] args) {
		PApplet.main(new String[] {"org.jointheleague.level_0_solutions.solution_amazing_rings.AmazingRings"});
	}
	

int x1 = 250;
int x2 = 750;
int speed = 2;


public void settings(){
size(1000,500);
}


public void draw(){
  background(255,0,0);
  for(int i = 400; i>0;i-=10){
  noFill();
    ellipse(x1,250,i,i);
    ellipse(x2,250,i,i);
  }
  x1+=speed;
  x2-=speed;
  if (x1>750 || x1 <250){
    speed = -speed;
  }
}

}

 
 