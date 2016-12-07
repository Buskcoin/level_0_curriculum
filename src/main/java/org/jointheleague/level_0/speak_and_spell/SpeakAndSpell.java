package org.jointheleague.level_0.speak_and_spell;
/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Speak & Spell
Duration=1.00
Platform=Eclipse
Type=Recipe
Objectives=if/else, speak method & for loop
*/

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 * Might be used in workshop
*/

import javax.swing.JOptionPane;

public class SpeakAndSpell {

    public static void main(String[] args) {
        // 1. Use the speak method to say the word. "e.g. spell mandlebrot"

        // 2. Catch the user's answer in a String

        // 3. If the user spelled the word correctly, speak "correct"

        // 4. Otherwise say "wrong"

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


													