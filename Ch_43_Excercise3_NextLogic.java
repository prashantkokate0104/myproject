package com.company;
import java.util.Random;
import java.util.Scanner;

/*Guess the number game by classes and method give score depending on chances required to guess
Problem:  Create a class Game should have the following methods
1.0 constructor to generate random number
2.0 takeUserInput(); to take input from user
3.0 isCorrectNumber(); to check  enter number by the  user is correct or not
4.0 getter and setter for noOfGuesses
    use properties such as noOfGuesses(int), etc. to get this task done !
 */
class game{
    Scanner sc=new Scanner(System.in);
     int input;
     int random;
     int count=10;
    public void gami(int n){         //constructor
        random=n;
    }
     void takeUserInput(){

        System.out.println("enter number to guess");
        input=sc.nextInt();   //taking user input
         noOfguess();
    }
     void noOfguess(){
             while(count>=0) {
                 if (input == random) {
                     System.out.println("hurray..... your guess is right ");
                 }
                 else if (input > random) {
                     System.out.println("your enter number is larger");
                     count--;
                     takeUserInput();
                 }
                 else {
                     System.out.println("your enter number is small");
                     count--;
                     takeUserInput();
                 }
             }
        System.out.println("your score is :"+ count);
    }
}
   public class Ch_43_Excercise3_NextLogic {
    public static void main(String[] args) {
        Random r=new Random();
        int R=(r.nextInt(100))+1;       // generated random number from 1-100
        game obj=new game();   // passing argument in method through java and created object obj as well by use of constructor
        obj.gami(R);
        obj.takeUserInput();   // calling method;
    }
}
