/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Pin the tail on the Donkey
Duration=1.00
Platform=Processing
Type=Instructions in Recipe
Objectives=making a game, following instructions, more complex 
*/

1. Start a new sketch with setup() and draw() methods.

2. Download a picture of a donkey (or other animal).. 
    i) Save the image.
    ii) Drop the file onto your sketch.
    iii) Load it as the background.         

    PImage donkey;    //at top of sketch    
    //Copy this stuff into the setup()method.    
    donkey = loadImage("donkey.jpg");        
    background(donkey);        

3. Set the size of your canvas to match the size of your image. This must be the first line in your  setup()method. To get the size of your image, right click on the file and click “Get Info”.
    size(width, height);        

4. Load a picture of a tail
    PImage tail    //as the very top of your sketch
    tail = loadImage("tail.jpg");    //in the setup method
    image(tail, mouseX, mouseY);  //in your draw method

5. Draw the tail only when the mouse is clicked using mousePressed.

6. Resize the tail to fit onto the donkey.
    tail.resize(height, width);        //in setup method
    Note: if you leave height or width as zero, the image will scale proportionally.

7. Adjust the position of the tail so that it is drawn at exactly the same spot as the mouse click.
    image(tail, mouseX-10, mouseY-20);    //in draw method

8. Make a small rectangle in the top left of the canvas. If the mouse is within the rectangle show the donkey, otherwise cover the donkey up with a different background. This way you can’t see the donkey when you try and pin the tail on.

9. Adjust your code so the tail sticks when you click the mouse . Save the coordinates of the mouse when it is clicked. Declare (make) the variables at the top of your sketch.

10. Decide where the tail can be pinned to win - you could use a small rectangle to help you work out the co-ordinates..

11. If the user pins the tail in the correct place, play a happy sound and let the tail pin on. If not, play a sad sound and don’t pin the tail.


First download a sound from freesound.org and drop it onto your sketch. If it is not a .wav file, convert it to one using media.io


import ddf.minim.*;                    //at the very top of your sketch
AudioSample sound1;                    //at the top of your sketch
Minim minim = new Minim(this);            //in the setup method            
sound1 = minim.loadSample("heehaw.wav");    //in setup
sound1.trigger();                    //where you want the sound to play


12. Add some text to give the user instructions on how to play the game.
    textSize(24);
    text("Message",100,20);
																	