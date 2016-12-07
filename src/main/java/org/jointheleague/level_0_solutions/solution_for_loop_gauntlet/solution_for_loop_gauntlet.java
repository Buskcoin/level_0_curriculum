/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    The For-Loop Gauntlet
 *    Solution
 *    
 ******************************************************************************/

/**
https://docs.google.com/document/d/1psZJ6GcKO9VyuGC2xV_0h8kK5Bd7syX6AU0e3dw9pX8/edit

The For-Loop Gauntlet


The goal of this assignment is to make you a master of utilizing for loops. Complete all the for loop challenges on the paper. Please read each challenge carefully and make sure that your for loops display exactly what is asked. Do not move on to the next challenge until an instructor has verified that your previous challenge is correct. If you finish them all, try the bonus challenges.


These are only one possible solutions as there are many.


Single For-Loops
Write one for loop to do the following:


1. Display all numbers from 0 to 100


    for(int i = 0; i <= 100; i++)
    {
        System.out.println(i);
    }


2. Display all numbers from 100 to 0


    for(int i = 100; i >= 100; i--)
    {
        System.out.println(i);
    }


3. Display all even numbers from 2 to 100


for(int i = 2; i <= 100; i += 2)
    {
        System.out.println(i);
    }



4. Display all odd numbers from 1 to 99



for(int i = 1; i <= 99; i += 2)
    {
        System.out.println(i);
    }



5. Display all numbers from 1 to 500. If the number is odd, print “odd” next to the number. If the number is even, print “even” next to the number.
    Ex:    1 odd
        2 even
        3 odd
        4 even
        5 odd...etc.


for(int i = 1; i <= 500; i ++)
    {
        System.out.print(i + “ “);
        if(i % 2 == 0)
        {
            System.out.println(“even”);
}
else
{
    System.out.println(“odd”);
}
}



6. Display all multiples of 7 from 0 to 777.


    for(int i = 0; i <= 777; i += 7)
    {
        System.out.println(i);
    }


Nested For-Loops (a for loop inside of a for loop)
Write a nested for loop to do the following:


1. Display this output: 
    0 0
    0 1
    0 2
    1 0
    1 1
    1 2
    2 0
    2 1
    2 2


    for(int i = 0; i <  3; i++)
    {
        for(int j = 0; j < 3; j++)
        {
            System.out.println(i + “ “ + j);
        }
    }


2. Display the numbers 1 through 9 in a 3x3 square grid like this:
    1 2 3
    4 5 6
    7 8 9


    int x = 1;
    for(int i = 0; i <  3; i++)
    {
        for(int j = 0; j < 3; j++)
        {
            System.out.print(x + “ “);
        }
        
        System.out.println();
    }


3. Display the numbers 1 through 100 in a 10x10 square grid



int x = 1;
    for(int i = 0; i <  10; i++)
    {
        for(int j = 0; j < 10; j++)
        {
            System.out.print(x + “\t“);
        }
        
        System.out.println();
    }


4. Display the following output:
    *
    **
    ***
    ****
    *****
    ******


for(int i = 0; i < 6; i++)
    {
        for(int j = 0; j < i; j++)
        {
            System.out.print(“*”);
        }
        
        System.out.println();
    }




*BONUS*
1. Write a for loop that counts down from 100 to 0. However, the for loop must start with for(int i = 0;  and you may not have any code above your for loop.


for(int i = 0; i < 100; i++)
    {
        System.out.println(100 - i);
    }


2.     Fizz Buzz        

*/