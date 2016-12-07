package org.jointheleague.level_0_solutions.solution_animal_farm;
/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Animal Farm	
Solution
*/

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

    AnimalFarm() {
        /*
         * Ask the user which animal they want, then play the sound of that
         * animal.
         */

        for (int i = 0; i < 5; i++) {

            String animal = JOptionPane.showInputDialog("which animal?");
            if (animal.equals("duck")) {
                playQuack();
            } else if (animal.equals("cow")) {
                playMoo();
            } else if (animal.equals("dog")) {
                playWoof();
            } else if (animal.equals("cat")) {
                playMeow();
            } else {
                JOptionPane
                        .showMessageDialog(null,
                                "I don't know that animal. Please try duck, cow, dog or cat.");
            }
        }

    }

void playMoo() {
        playNoise(mooFile);
    }

    void playQuack() {
        playNoise(quackFile);
    }

    void playWoof() {
        playNoise(woofFile);
    }
    
    void playMeow() {
        playNoise(meowFile);
    }

    String quackFile = "/Users/Guest/Google Drive/league-sounds/quack.wav";
    String mooFile = "/Users/Guest/Google Drive/league-sounds/moo.wav";
    String woofFile = "/Users/Guest/Google Drive/league-sounds/woof.wav";
    String meowFile = "/Users/Guest/Google Drive/league-sounds/meow.wav";
    String llamaFile = "/Users/Guest/Google Drive/league-sounds/llama.wav";

    /* Ignore this stuff */

    public void playNoise(String soundFile) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            Thread.sleep(3400);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new AnimalFarm();
    }

}

