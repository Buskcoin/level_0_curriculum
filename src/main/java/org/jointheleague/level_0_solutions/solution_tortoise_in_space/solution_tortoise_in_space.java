/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Tortoise in Space
Solution
*/

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import org.teachingextensions.logo.Tortoise;

public class TortoiseInSpace implements KeyEventDispatcher {

    private static final int UP_ARROW = KeyEvent.VK_UP;
    private static final int DOWN_ARROW = KeyEvent.VK_DOWN;
    private static final int LEFT_ARROW = KeyEvent.VK_LEFT;
    private static final int RIGHT_ARROW = KeyEvent.VK_RIGHT;

    /* 1. Make the Tortoise move around the screen when the arrow keys are pressed. */
    private void moveTortoise(int keyPressed) {
        // If the up arrow is pressed, move the Tortoise up the screen.
        if (keyPressed == UP_ARROW) {
            Tortoise.move(5);
        }

        // If the down arrow is pressed, move the Tortoise down.
        if (keyPressed == DOWN_ARROW) {
            Tortoise.move(-5);
        }

        // If the left arrow is pressed, make the tortoise move left. Hint: Make sure to end with the Tortoise facing UP.
        if (keyPressed == LEFT_ARROW) {
            Tortoise.turn(-90);
            Tortoise.move(5);
            Tortoise.turn(90);
        }
        // If right is pressed, move the Tortoise right.
        if (keyPressed == RIGHT_ARROW) {
            Tortoise.turn(90);
            Tortoise.move(5);
            Tortoise.turn(-90);
        }
        /* 2. Then move the Tortoise to RD-2D for a surprise! */
    }

    private void checkIfR2D2Found() throws Exception {
        int tortoiseLocationX = Tortoise.getX();
        int tortoiseLocationY = Tortoise.getY();

        if (tortoiseLocationX <= 510 && tortoiseLocationX >= 505 && tortoiseLocationY >= 110 && tortoiseLocationY <= 115)
            playEureka();
    }

    public static void main(String[] args) {
        new TortoiseInSpace().controlTheTortoise();
    }

    private void controlTheTortoise() {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
        Tortoise.getBackgroundWindow().setBackgroundImage(
                "http://cdn.playbuzz.com/cdn/ae928505-70fe-4538-8fc4-034d1acef441/b7a29f96-7410-440b-9d93-3cfc0abccce9.jpg");

        Tortoise.penUp();
        Tortoise.setSpeed(10);
    }

    public boolean dispatchKeyEvent(KeyEvent e) {
        if (e.getID() == KeyEvent.KEY_PRESSED) {
            moveTortoise(e.getKeyCode());
            try {
                checkIfR2D2Found();
            } catch (Exception exception) {
            }
        }
        return false;
    }

    public void playEureka() {
        System.out.println("EUREKA!");
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(
                    "/Users/leagueleadteacher/Google Drive/league-sounds/r2d2-eureka.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}


