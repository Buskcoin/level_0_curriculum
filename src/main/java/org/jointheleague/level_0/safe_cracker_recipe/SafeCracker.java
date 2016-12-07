package org.jointheleague.level_0.safe_cracker_recipe;
/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Safe Cracker Recipe
 *    Duration=.00
 *    Platform=Eclipse
 *    Type=Recipe
 *    Objectives=for loop, reading the existing code in a recipe
 *    
 *    
 ******************************************************************************/


import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Random;


import javax.swing.JApplet;
import javax.swing.JOptionPane;


public class SafeCracker {


    public static void main(String[] args) {
        /* Your mission: use the tryCode method to crack the safe by trying all possible combinations */

        
    }


    static void tryCode(int guess) {
        System.out.println("trying " + guess);


        int secretCode = 9999999 - wekncrzpasfdkjhcfjse;


        if (guess == secretCode) {
            JOptionPane.showMessageDialog(null, "Congratulations! You cracked the safe with " + guess);
            playTheSoundOfSuccess();
            System.exit(0);
        }
    }


    private static void playTheSoundOfSuccess() {
        AudioClip sound;
        try {
            sound = JApplet.newAudioClip(new File("/Users/League/Google Drive/league-sounds/me-gusta.wav").toURI().toURL());
            sound.play();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }


    final static int wekncrzpasfdkjhcfjse = new Random().nextInt(100);
}
 