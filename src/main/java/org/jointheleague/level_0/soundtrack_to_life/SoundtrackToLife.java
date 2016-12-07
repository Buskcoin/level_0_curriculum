package org.jointheleague.level_0.soundtrack_to_life;
/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Soundtrack to Life
Duration=1.00
Platform=Eclipse
Type=Recipe
Objectives=JOptionPane.showOptionDialog, playing videos
*/

/**
* If you can’t think of any, here are some you can use...
*    bit.ly/video-for-happy
*    bit.ly/video-for-sad
*    bit.ly/video-for-angry
*/

import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

    public static void main(String[] args) {

        // 1. Adjust this pop-up to find out what mood the user is in.
        int userMood = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
                JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Mood1", "Mood2", "Mood3" }, null);
        
        // 2. Their answer is stored in the userMood variable. Print it out.

        // 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.

        // 4. Play different songs for other moods.

        // If you are seeing ads at the beginning of your videos, install Adblock.

    }

    static void playVideo(String youTubeLink) {
        try {
            URI uri = new URI(youTubeLink);
            java.awt.Desktop.getDesktop().browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
