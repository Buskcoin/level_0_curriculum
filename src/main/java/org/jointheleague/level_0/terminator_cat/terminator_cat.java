/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Terminator Cat
 *    Duration=1.5
 *    Platform=Processing
 *    Type=Instructions in Recipe
 *    Objectives=Using Processing, problem solving
 *    
 *    
 ******************************************************************************/

/**
 We’re going to make a cat that shoots lazers out of it’s eyes when you press the space bar. 
 
0. Start a new sketch with setup() and draw() methods.


1. Set the size of your sketch in the setup method. 
        size(width, height);


2. Drop the image of your cat onto your sketch. Load it like this in the setup method:
        PImage catPic = loadImage("tabby.jpeg");
        catPic.resize(width, height);  // to match your size
        background(catPic);


3. Place an ellipse over one of the cat’s eyes in the draw method.
        ellipse(x, y, width, height)
        

4. Create variables for the x and y location of the ellipse. Put these variables at the top of your sketch, and use them in your ellipse command. Initialize them to the location of the cat’s eye. Completing this step should not change the look of your sketch.


5. Give the ellipse a color with the fill command (this will be the color of the lazer).
        fill(red, green, blue)


6. Add a keyPressed() method and increase the x and/or y variables inside it.
    void keyPressed() {
         x++;
         y++;
    }
   This code will move the ellipse diagonally to the right. Choose the direction of the lazer beam depending on the direction your cat is facing. Remember you can also decrement x and y.


7. Adding noStroke() will make it look more like a lazer beam.


8. Accelerate the movement of the ellipse. 
   8.1 Create a variable for acceleration next to your x and y variables. 

   8.2 Instead of simply incrementing or decrementing x and y, use acceleration to increase their speed each time a key is pressed. 
       e.g.    y-=2*acceleration;

   8.3 Increment acceleration every time a key is pressed.


9. Make the cat shoot lazers from both eyes.  Use an offset so that you don’t need to make a second set of coordinates. e.g. ellipse(x+220, y, 60, 50);


10. Play a pew-pew sound when the lazer shoots. 
    10.1 First download a sound from freesound.org and drop it onto your sketch.

    10.2 Put this at the top of your sketch.
           import ddf.minim.*;                
           AudioSample sound;

    10.2 Load the sound in the setup method.
          Minim minim = new Minim(this);                
          sound = minim.loadSample("pew-pew.wav");

    10.3 Play the sound when acceleration == 1.
          sound.trigger();


11. Set the lazer back to the beginning when it goes off the screen.
    11.1 Write an if statement for when the lazer if off the screen. This might help:
          println(x + “, “ + y);

    11.2 When the lazer is off the screen, reset the cat image as the background.

    11.3 And set x and y back to their original values.

    11.4 And set acceleration back to 1.


12. Celebrate your amazing coding skills with some Cat Techno. Check out the Terminator Cat at 0:40!

*/													