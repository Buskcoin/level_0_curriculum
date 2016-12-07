/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Choose Your Own Adventure
 *    Solution
 *    
 *    
 ******************************************************************************/

import javax.swing.JOptionPane;


public class ChooseYourOwnAdventureByEshaan {
    public static void main(String[] args) {
        String door = JOptionPane
                .showInputDialog(
                        null,
                        "There is a power outage and you're in a house. There is 2 doors. A door that takes you to a room with spiders and a door that leads to a room with crickets. Which room do you choose? Spiders or Crickets?");
        if (door.equals("Spiders")) {
            String hi = JOptionPane
                    .showInputDialog(
                            null,
                            "After you walk through that door there is 2 more doors. The first door takes you to a room full of chocolate. The second one takes you to a room full of candy. Which one, Chocolate or Candy.");
            if (hi.equals("Chocolate")) {
                String lel = JOptionPane
                        .showInputDialog(
                                null,
                                "You go through that door and there is 1 door. When you go through there is 2 options. The first option is you jump into a pit with man - esting sharks in it :(. The other option is that you electrocute yourself to death. Which one? Electrocution or Sharks? (pick wisley.......)");
                if (lel.equals("Sharks")) {
                    JOptionPane
                            .showMessageDialog(
                                    null,
                                    "Remember how there was a power outage???? Well.... that would've helped you survive and not DIE!! :)");
                }
                if (lel.equals("Electrocute")) {
                    JOptionPane
                            .showMessageDialog(
                                    null,
                                    "Good choice. You live because of the power outage. Next time you won't be as lucky.");
                }


            }


            if (hi.equals("Candy")) {
                String egg = JOptionPane
                        .showInputDialog(null,
                                "Dead end. Turn around and go a different way. Or else........");


                if (egg.equals("Or else what?")) {
                    JOptionPane.showMessageDialog(null,
                            "Nothing! :) TROLLOLOLOLOLOLOLOLOL hehe....");
                }
            }
        } else if (door.equals("Crickets")) {
            String door3 = JOptionPane
                    .showInputDialog(
                            null,
                            "There is 2 more doors. The first one is when you walk through it there is a TV show playing called Little Einsteins playing. The second room has a TV show playing called Barney and Friends!!!! :). Which one, Einsteins or Barney?");
        
        if (door3.equals("Barney")) {
            JOptionPane.showMessageDialog(null, "Dang! You truely love Barney! HE IS AFTER YOU!!!! RUN!!! (if you can :)....... )");
        }
        if(door3.equals("Einsteins")){
            JOptionPane.showMessageDialog(null, "Welp!.... looks like you're going on a trip in your favorite rocketship! See you later! If you survive....... hehehehehe");
        }
        }


    }
}



 