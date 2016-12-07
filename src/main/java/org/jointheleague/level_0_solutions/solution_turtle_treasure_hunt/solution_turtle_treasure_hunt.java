/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Turtle Treasure Hunt
 *    Solution
 *    
 ******************************************************************************/

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;


import javax.swing.JOptionPane;


import org.teachingextensions.logo.ImageBackground;
import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.Tortoise;


/** Note: You will need the latest version of the TKP jar: http://school.wintrisstech.org/jars/TeachingKidsProgramming.jar **/


public class TurtleTreasureHunt implements KeyEventDispatcher {


    int tortoiseSpeed = 5;


    private void goUp() {
        // 1. Make the tortoise move up the screen
        Tortoise.move(tortoiseSpeed);
    }


    private void goDown() {
        // 2. make the tortoise move down the screen
        Tortoise.move(-tortoiseSpeed);
    }


    private void goLeft() {
        // 3. make the tortoise move left (3 lines of code)
        // Hint: the turn() method lags more than setAngle()
        Tortoise.setAngle(270);
        Tortoise.move(tortoiseSpeed);
        Tortoise.setAngle(0);
    }


    private void goRight() {
        // 4. make the tortoise move right
        Tortoise.setAngle(90);
        Tortoise.move(tortoiseSpeed);
        Tortoise.setAngle(0);
    }


    private void spaceBarWasPressed() {
        int tortoiseLocationX = Tortoise.getX();
        int tortoiseLocationY = Tortoise.getY();


        // 5. Print out the variables for tortoiseLocationX and
        // tortoiseLocationY
        System.out.println("(" + tortoiseLocationX + ", " + tortoiseLocationY + ")");


        // 6. If tortoise is at same location as the little girl,
        // make a pop-up tell the Tortoise where to go next
        if (new Point(tortoiseLocationX, tortoiseLocationY).distance(500, 300) < 20)
            JOptionPane.showMessageDialog(null, "Find the dragon in the swamp who's favorite color is magenta.");


        // 7. Give the user subsequent clues at different locations on the image
        // (pirate robot, swamp, parrots, etc.)
        if (new Point(tortoiseLocationX, tortoiseLocationY).distance(320, 400) < 20) {
            String answer = JOptionPane.showInputDialog(null, "What's my favorite color?");
            if (answer.equalsIgnoreCase("magenta"))
                JOptionPane.showMessageDialog(null, "Correct! Now seek the decelerating iron.");
        }


    }


    private void go() {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
        /*
         * If you want to use your own background, download the image you want, and change the following line to point to it like: new
         * ImageBackground("file:/Users/joonspoon/Desktop/dinosaurLand.jpg");
         */
        Paintable backgroundImage = new ImageBackground("http://s30.postimg.org/oi69jth7l/fetch1.jpg");
        Tortoise.getBackgroundWindow().addPaintable(backgroundImage);
        Tortoise.penUp();
        JOptionPane.showMessageDialog(null, "Ask the little girl for help with your quest. Press the space bar to ask.");
    }


    public boolean dispatchKeyEvent(KeyEvent e) {
        if (e.getID() == KeyEvent.KEY_PRESSED) {
            if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                goRight();
            else if (e.getKeyCode() == KeyEvent.VK_LEFT)
                goLeft();
            else if (e.getKeyCode() == KeyEvent.VK_UP)
                goUp();
            else if (e.getKeyCode() == KeyEvent.VK_DOWN)
                goDown();
            else if (e.getKeyCode() == KeyEvent.VK_SPACE)
                spaceBarWasPressed();
        }
        return false;
    }


    public static void main(String[] args) throws MalformedURLException {
        new TurtleTreasureHunt().go();
    }
}




