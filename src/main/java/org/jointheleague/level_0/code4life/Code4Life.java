package org.jointheleague.level_0.code4life;
/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Code4Life
 *    Duration=.00
 *    Platform=Eclipse
 *    Type=Recipe
 *    Objectives=Exam Readiness
 *    
 *    
 ******************************************************************************/

/** 
This recipe is similar to the coding exam.		
*/


import java.io.File;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Code4Life {
	/*
     * Ask the user how many hours they spent coding this week.
     * 
     * 1. If it's 3 or more, tell them they're a Code Ninja.
     * 
     * 2. If it's less than 2, tell them to stop watching YouTube and write code instead.
     * 
     * 3. If it's more than 5, play the Batman theme song.
     */


    private static void playBatmanTheme() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            Thread.sleep(60002);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}

