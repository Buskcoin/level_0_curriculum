/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Soundtrack to Life
Solution
*/

import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

    public static void main(String[] args) {

        int userMood = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
                JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Stressed", "Sad", "Energized" }, null);


        if (userMood == 2) {
            playVideo("https://www.youtube.com/watch?v=8410qUT4QtA");
        }

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






