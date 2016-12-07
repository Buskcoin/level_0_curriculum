/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Color Spiral
 *    Solution																
 *    
 *    
 ******************************************************************************/

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Colors;


public class Spiral{


    public static void main(String[] args) {
        // 1. Show the tortoise
        Tortoise.show();
        // 3. Set the tortoise to go as fast as possible
        Tortoise.setSpeed(10);
        // 4. Do the following (steps 5-8) 75 times
        for (int i = 0; i < 75; i++) {
            // 6. Change the color of the line to a random color
            // (Colors.getRandomColor())
            Tortoise.setPenColor(Colors.getRandomColor());
            // 5. Move the tortoise 5 times the current line number you are
            // drawing (5*i)
            Tortoise.move(5 * i);
            // 2. Turn the tortoise 1/3 of 360 degrees to the right
            Tortoise.turn(360 / 7);
            // 7. Change the number of sides to 7 (don’t add a new line of code
            // for this one!)
            Tortoise.setPenWidth(i);
            // 8. Set the pen width to i
        }


    }


}
