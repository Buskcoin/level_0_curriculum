package org.jointheleague.level_0.dizzy_tortoise;
/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Dizzy Tortoise
Duration=.00
Platform=Eclipse
Type=Recipe
Objectives=Using a method and passing an int
Optional=Yes
*/

/** 
Using a method
*/

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

    public static void main(String[] args) {
                 
         // 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.

         // 1. Use the dance method to make the Tortoise spin.
         
    }

    static void dance(int numberOfSpins) {
        for (int i = 0; i < numberOfSpins; i++) {
            Tortoise.turn(360);
        }
    }
}


/**
Dizzy Tortoise	
https://docs.google.com/document/d/1UBAyU1pFb0FGfaidI6x_u1qn_Bv8r9g79y6ZFXwRR3I/edit		
Eclipse	Recipe		
Using a method and passing an int	
https://docs.google.com/document/d/1hm4q8pdZ-8NZeBp9Pkm5yVdIsb_j7SUiAzjtxnGd6yg/edit	
Using a method	
Optional															
*/