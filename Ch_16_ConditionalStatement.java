package com.company;
import java.util.Scanner;

public class Ch_16_ConditionalStatement {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=Sc.nextInt();
        if(age>=18){
        System.out.println("you can drive!!");
        }
        else {
        System.out.println("you cant drive basterd!!");
        }
    }
}

