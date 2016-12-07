/** Copyright The League of Amazing Programmers 2013-2017
Level 0
Mustaches #1
Duration=.25
Platform=Paper
Type=Worksheet
Objectives=Using/pairing braces
*/

/** 
Print out copies for each student. Teacher-Led.
Put mustaches (braces) where they belong:
Clue: you should have a total of 6 mustaches.
*/
															
public class ElTortuga 

    static int tortoiseLocation;

public static void main(String[] args) 

        tortoiseLocation = Tortoise.getLocation();
        
        if (tortoiseLocation < 0) 

            System.out.println("El Tortuga se ha ido!");
        
    