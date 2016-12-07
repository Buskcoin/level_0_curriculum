/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Don't Forget the Lyrics
Solution
*/

import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
    public static void main(String[] args) {
        int points = 0;
        JOptionPane.showMessageDialog(null, "Finish the lyrics to each song clip");
        playSound("hit me baby.wav");
        String answer = JOptionPane.showInputDialog("");
        if (answer.equals("one more time")) {
            JOptionPane.showMessageDialog(null, "correct");
            points++;
        } else
            JOptionPane.showMessageDialog(null, "no! the correct answer is \"one more time\"");

        JOptionPane.showMessageDialog(null, "you got " + points + " points.");
    }

    public static void playSound(String fileName) {
        AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
        audioClip.play();
    }
}




