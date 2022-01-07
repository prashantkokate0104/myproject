package com.company;
// Guess the number game by classes and method give score depending on chances required to guess

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

class Game{
    int N=10;
    public Game(int n) {         //constructor for accessing value of Random number generated
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your number to guess");
            int num = sc.nextInt();

            if (num == n && N > 0) {
                System.out.println("your guess is right ");
                break;
            } else if (num > n) {
                System.out.println("your Enter number is big ");
                N--;
            } else {
                System.out.println("your Enter number is small");
                N--;
            }
        }
             System.out.println("your score is "+N);
    }

    }
public class Ch_43_Exercise3 {
    public static void main(String[] args) {
        Random s=new Random();
        int Ran=s.nextInt(100);
        Ran+=1;
        System.out.println(Ran);
        Game obj=new Game(Ran);
    }
}
/// hurray I did it  ....