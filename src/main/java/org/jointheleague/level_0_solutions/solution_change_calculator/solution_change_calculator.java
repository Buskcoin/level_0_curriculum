/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Change Calculator
Solution
*/

import javax.swing.JOptionPane;

public class ChangeCalculator {

    public static void main(String[] args) {

        // Ask the user how many nickels they have
        String nickels = JOptionPane.showInputDialog("how many nickels do you have?");
        // Convert their answer to an int using Integer.parseInt()
        int nickelsAsInt = Integer.parseInt(nickels);
        // Ask the user how many dimes they have, and convert their answer
        String dimes = JOptionPane.showInputDialog("how many dimes do you have?");
        int dimesAsInt = Integer.parseInt(dimes);
        // Ask the user how many quarters they have, and convert their answer
        String quarters = JOptionPane.showInputDialog("how many quarters do you have?");
        int quartersAsInt = Integer.parseInt(quarters);
        // Calculate how much money the user has and save it in a variable called "totalMoney"
        double totalMoney = (.05 * nickelsAsInt + .10 * dimesAsInt + .25 * quartersAsInt);
        // Tell the user how much money they have
        JOptionPane.showMessageDialog(null, "You have $" + totalMoney);

    }
}


