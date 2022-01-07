package com.company;
import java.util.Scanner;
import java.util.Random;   // to generate random number library we import
public class Ch_20_Exercise2 {
    public static void main(String[] args) {
        /*Scanner Sc=new Scanner(System.in);
        System.out.println("Enter \n1:for Rock\n2:for scissors\n3:for paper");
        int user=Sc.nextInt();
    Random sc=new Random();
    int num=1+sc.nextInt(3);

    if(num==1 && user!=0) {
        switch (user) {
            case 1 -> System.out.println("com had rock match tie no winner play again");
            case 2 -> System.out.println("com had rock sorry!! you are lost the match");
            case 3 -> System.out.println("com had rock congratulations !! you won the match,, wanna play again");

        }
    }
    else if(num==2 && user!=0){
        switch (user) {
            case 1 -> System.out.println("com had Scissors congratulations !! you won the match,, wanna play again");
            case 2 -> System.out.println("com had Scissors match tie no winner, wanna play again??");
            case 3 -> System.out.println("com had Scissors sorry!! you lost the match");

        }
        }
    else{
            switch (user) {
                case 1 -> System.out.println("com had paper sorry!! you lost the match");
                case 2 -> System.out.println("com had paper congratulations !! you won the match,, wanna play again");
                case 3 -> System.out.println("com had paper match tie no winner, wanna play again??");
                default-> System.out.println("invalid input");
            }
    }

         */
        /*
        System.out.println("lets play game");
        Scanner sc = new Scanner(System.in);
        System.out.println("choose your option \n1:for rock \n2:for scissors \n3:for paper");
        int user = sc.nextInt();
        Random R = new Random();
        int com = R.nextInt(3) + 1;
        // to cross check what move computer played
        switch (com) {
            case 1 -> System.out.println("com had Rock");
            case 2 -> System.out.println("com had Scissors");
            default -> System.out.println("com had Paper");
        }
        // check condition to declare result
        if (user == 1 || user == 2 || user == 3) {
            if (com == user) {
                System.out.println("match tie wanna play again");
            } else if (com == 1 && user == 3 || com == 2 && user == 1 || com == 3 && user == 2)
                System.out.println("you win the match");
            else
                System.out.println("you lost the match");
        }

        else
            System.out.println("invalid input");
        */
        // practice 2;;
        // rock scissor paper game note play with computer
        // enter 1:rock, 2:Scissor, 3:paper
         Random sc=new Random();
         int com=sc.nextInt(2)+1; // generate random number from 0 to index we mentioned
        switch (com) {
            case 1 -> System.out.println("com had rock");
            case 2 -> System.out.println("com had scissor");
            case 3 -> System.out.println("com had Paper");
        }
         Scanner cs=new Scanner(System.in);
         System.out.println("enter No for\n rock:1, \nScissor:2,\nPaper:3");
         int User=cs.nextInt();
    if(User==1||User==2||User==3){
         if(com==User)
             System.out.println("sorry match tie \nplay again??");
         else if(com==1&&User==3||com==2&&User==1||com==3&&User==2)
             System.out.println("Congratulations you won ");
         else
             System.out.println("sorry you lost the match\n play again");
         }
    else
        System.out.println("invalid input please enter valid input"+"enter No for\n rock:1, \nScissor:2,\nPaper:3");








        }


    }



