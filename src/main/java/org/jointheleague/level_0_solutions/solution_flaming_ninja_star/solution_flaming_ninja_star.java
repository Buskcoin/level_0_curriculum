/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Flaming Ninja Star
Solution
*/

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class FlamingNinjaStar {
    public static void main(String[] args) {

        int baseSize = 300;     //the size of the black part of the star
        int flameSize = 200;    //the length of the flaming arms

        // *14. Use the methods setX and setY to move the ninja star into the center of the screen
        Tortoise.setX(450);
        Tortoise.setY(280);
        // *15. Make some adjustments to see what other kinds of shapes you can make.

        // 1. Show the Tortoise
        Tortoise.show();

        // 12. Set the tortoise speed to 10
        Tortoise.setSpeed(10);

        // 13. Make all the code below repeat 25 times
        for (int i = 0; i < 25; i++) {

            // 2. Turn the tortoise 1/8 of a circle
            Tortoise.turn(360 / 8);
            // 3. Move the tortoise 64 pixels
            Tortoise.move(64);
            // 4. Turn the tortoise 40 degrees to the LEFT. (Negative numbers will turn the tortoise counter-clockwise.)
            Tortoise.turn(-40);

            Tortoise.setPenColor(Colors.Oranges.Orange);
            // 5. Move the tortoise the distance in the variable flameSize
            Tortoise.move(flameSize);
            // 6. Turn the tortoise 170 degrees
            Tortoise.turn(170);
            // 7. Move the tortoise the distance in the variable flameSize (again)
            Tortoise.move(flameSize);

            Tortoise.setPenColor(Colors.Grays.Black);
            // 8. Turn the tortoise 64 degrees to the right
            Tortoise.turn(64);
            // 9. Move the tortoise the distance in the variable baseSize
            Tortoise.move(baseSize);
            // 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
            // 11. Color your ninja star like Figure 2.
        }
    }

}







