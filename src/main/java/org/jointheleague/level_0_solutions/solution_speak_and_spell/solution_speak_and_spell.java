/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Speak & Spell
Solution
*/

import javax.swing.JOptionPane;

public class SpeakAndSpell {
    
    public static void main(String[] args) {
        // 1. Use the speak method to say the word. "e.g. spell mandlebrot"
        speak("spell mandlebrot");
        // 2. Catch the user's answer in a String
        String userAnswer = JOptionPane.showInputDialog("");
        // 3. If the user spelled the word correctly, say "correct"
        if (userAnswer.equals("mandlebrot"))
            speak("correct");
        // 4. Otherwise say "wrong"
        else
            speak("wrong, try again");
        // 5. repeat the process for other words
    }

    static void speak(String words) {
        try {
            Runtime.getRuntime().exec("say " + words).waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


