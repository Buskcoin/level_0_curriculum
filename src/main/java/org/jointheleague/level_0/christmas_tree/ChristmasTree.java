package org.jointheleague.level_0.christmas_tree;
/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Christmas Tree
 *    Duration=.00
 *    Platform=Eclipse
 *    Type=Recipe
 *    Objectives=Seasonal
 *    Optional=Yes
 *    
 ******************************************************************************/


import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class ChristmasTree {


    public static void main(String[] args) {
        ChristmasTree ohChristmasTree = new ChristmasTree();
        ohChristmasTree.drawStar();
        ohChristmasTree.drawTreeBody();
        ohChristmasTree.drawTreeTrunk();
    }


    double treeWidth = 15;
    double scale = 1.1;    //This is how much the width of the tree increases with each layer down


    void drawTreeBody() {
        // 8. Change the color of the line the tortoise draws to forest green    


        // 1. Make a variable for turnAmount and set it to 175


        // 2. Start the Tortoise facing to the right


        // 5. Repeat steps 3 through 11, 11 times


            // 3. Move the tortoise the width of the tree
    
            // 4. Turn the tortoise the current turnAmount to the right
    
            // 6. Set the treeWidth to the current treeWidth times the scale
    
            // 7. Move the tortoise the width of a tree again
    
            // 9. Turn the tortoise the current turn amount to the LEFT
    
            // 10. Set the treeWidth to the current treeWidth times the scale again
    
            // 11. Decrease turnAmount by 1


}
    
    void drawTreeTrunk() {
        // 1. Move the tortoise half the width of the tree


        // 2. Change the tortoise so that it is pointing straight down


        // 4. Set the pen width to the tree width divided by 10


        // 5. Change the color of the line the tortoise draws to brown


        // 3. Move the tortoise a quarter the tree width


    }
    
    void drawStar() {
        // * Optional: Draw a red star on top of the tree. Hint: 144 degrees makes a star.
    
    }


}

