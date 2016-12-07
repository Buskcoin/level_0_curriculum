/** Copyright The League of Amazing Programmers 2013-2017
Level 0
if/else worksheet
Solution
*/

/** 
Question 1
*/

String answer = "yes";
if (answer .equals("yes")){
    System.out.println("Happy");
}
else{
    System.out.println("Sad");
}
System.out.println("Wednesday");


/**Program prints:-
Happy Wednesday
If you change the String to “no”, it prints
Sad Wednesday
*/


/** 
Question 2
*/

int age = 14;
if (age < 20){
    System.out.println("It’s so great being young");
}
else{
    System.out.println("Don't you wish you were young");
}


/**
Program prints:-
It’s so great being young
If you change the age to 20 or more, program prints:-
Don't you wish you were young
*/


/** 
Question 3
*/

String answer = JOptionPane.showInputDialog("What animal do you like?");
if (answer .equals("Dog")){
    JOptionPane.showMessageDialog(null, "Dogs go woof");
}
else if(answer .equals("Cat")){
    JOptionPane.showMessageDialog(null, "Cat go meow");
}
else if(answer .equals("Cow")){
    JOptionPane.showMessageDialog(null, "Cows go moo");
}
else{
    JOptionPane.showMessageDialog(null, "Sorry, I don't know that animal");
}


