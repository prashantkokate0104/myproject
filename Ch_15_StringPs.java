package com.company;
import java.util.Locale;
import java.util.Scanner;
public class Ch_15_StringPs {
    public static void main(String[] args) {
        /* write a program to convert string into lowercase string;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String name=sc.nextLine();
        String LowercaseName=name.toLowerCase();
        System.out.println(LowercaseName);*/

        /* Write a code to replace white spaces with underscore
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String name=sc.nextLine();
        System.out.println(name.replace(' ','_'));*/

        /*write a code to write a name in at particular place in string
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String Name=sc.nextLine();
        String Format = "Dear <name> welcome to cognizant";
       // Format=Format.replace("<name>",Name);
        System.out.println(Format.replace("<name>",Name));*/

        /* write a code to convert string into letter format
        String Name="Dear prashant, your performance in our firm is excellent thanks";
        System.out.println("Dear prashant,\n\t\tyour performance in our firm is excellent\nThanks");

         */

        //finished!!!!!!!!!!!!!
        //practice 2nd times
        /* ist question
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String name=sc.nextLine();
        System.out.printf("lowercase string is %s:",name.toLowerCase(Locale.ROOT));
         */
        /*question2
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String name=sc.nextLine();
        System.out.println(name.replace(' ','_'));
         */
        /*question 3,4
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.printf("hello,\n %s\n \t congratulation you have passed the exam successfully",name);
         */

    }
}
