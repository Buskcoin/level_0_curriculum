/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Dizzy Tortoise
Solution
*/

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

    public static void main(String[] args) {
        /*
         * 1. Use the dance method to make the Tortoise spin.
         * 
         * 2. Ask the user how dizzy you want the tortoise from 1-10, then spin
         * that number of times.
         */

        String howMany = JOptionPane.showInputDialog("How dizzy do you want to make the Tortoise, from 1 to 10?");
        int howManyInt = Integer.parseInt(howMany);
        dance(howManyInt);
    }

    static void dance(int numberOfSpins) {
        for (int i = 0; i < numberOfSpins; i++) {
            Tortoise.turn(360);
        }
    }
}


