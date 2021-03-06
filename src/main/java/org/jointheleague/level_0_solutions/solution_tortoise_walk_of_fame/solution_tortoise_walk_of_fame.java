/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Tortoise Walk of Fame
 *    Solution
 *    
 ******************************************************************************/

import org.teachingextensions.logo.Tortoise;


public class Starz {


    public static void main(String[] args) {
        Tortoise.setSpeed(10);


        // 1. Set the X position so that it starts on the far left of
        // the screen.
        Tortoise.setX(0);


        for (int j = 0; j < 700; j += 50) {


            Tortoise.setX(j);


            // 2. Make the Tortoise draw a star shape. Hint: 144.
            for (int i = 0; i < 5; i++) {
                Tortoise.move(30);
                Tortoise.turn(144);
            }


        }


    }


}


