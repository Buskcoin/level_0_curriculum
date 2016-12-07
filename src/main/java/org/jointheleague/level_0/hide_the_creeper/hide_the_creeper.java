/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Hide the Creeper
 *    Duration=1.5
 *    Platform=Processing
 *    Type=Recipe
 *    Objectives=making a game, storing and using x & y co-ordinates
 *    
 *    
 ******************************************************************************/

/**
Start a new sketch with setup() and draw() methods.


1. Set the size you want your game to be.
    size(width, height);     //in setup method


2. Download a background image. Something with green where creeper can hide.
    i) Save the image.
    ii) Drop the file onto your sketch.
    iii) Load it as the background
    PImage minecraft = loadImage("minecraft.jpg");//in setup method
    minecraft.resize(width, height);            //in setup method
    background(minecraft);                 //in setup method    


3. Load the creeper image into your sketch 
    i) Download the image http://bit.ly/ZpitSv
    ii) Drop it onto your sketch
    iii) Draw the image
    PImage creeper;                        //at the top 
    creeper=loadImage("creeper.png");        //in setup method
    image(creeper, mouseX, mouseY);            //in draw method


4. Resize the creeper image so that it is small and can hide, right after it’s loaded.    
    creeper.resize(width, height);                //in setup method


5. Pick a place to hide your creeper. 
    i) Use two variables to store the location (x and y) of the creeper, and initialize them (at the top of your sketch).
    ii) Change your code so that the creeper image is drawn at this location.


6. In the draw method, draw a small red ellipse where the mouse clicks.


7. When mouseX and mouseY are the top left corner, draw a green ellipse instead of a red one.


8. If mouseX and mouseY are near the location of your creeper, make the circle green.
    boolean isNear(int a, int b) {
          if (abs(a - b) < 10)
                return true;
        else
             return false;
    }
	
	
9. Let the user know that they found the creeper.


10.Add lots more creepers… or move the creeper when they find it

*/																	