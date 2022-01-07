package com.company;
import java.util.Scanner;
public class Ch_17_ConditionStatePS {
    public static void main(String[] args) {
        // question no 1--- will throw an error if  we wrote an asignment operator in conditional statement.
        /*int a=11;
        if(a=11){
            System.out.println("yes i am 11");

        }
        else
            System.out.println("no I am not 11");
           */
        /*Question 2--write a program if student pass or not if he/she required total
        40% and in every subject atleast 33%.

        Scanner sc=new Scanner(System.in);
        System.out.println("enter max mark in subject");
        int Max=sc.nextInt();
        System.out.println("enter sub 1 marks");
        int sub1=sc.nextInt();
        System.out.println("enter sub 2 marks");
        int sub2=sc.nextInt();
        System.out.println("enter sub 3 marks");
        int sub3=sc.nextInt();
        float TotalMark=Max*3.0f;
        int ScoreMark=sub1+sub2+sub3;
        float per=(ScoreMark/TotalMark)*100;
        if(sub1>=33&&sub2>=33&&sub3>=33&&per>=40)
            System.out.println("student is pass");
        else
            System.out.println("student is failed");

         */
         /*Question 3-- take income as a input from user and print tax user have to pay depend on slab he fits in..

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your income in lacs");
        float income=sc.nextFloat();
        if(income>10) {
            float tax1 = ((income-10) *30/100)*100000;
            float tax2=5.0f*20*1000;
            float tax3=2.5f*5*1000;
            float tax=tax1+tax2+tax3;
            System.out.println("you are eligible to pay 30 per of tax");
            System.out.printf("you have to pay tax of Ruppes: %f",tax);

        } else if (10.0>=income || income>=5.0) {
            float tax1 = ((income-5) *20/100)*100000;
            float tax2=2.5f*5*1000;
            float tax=tax1+tax2;
            System.out.println("you are eligible to pay 20 per of tax");
            System.out.printf("you have to pay tax of Ruppes : %f",tax);
        }
          else if(5.0>income || income>=2.5){
            float tax = ((income-2.5f) *5/100)*100000;
            System.out.println("you are eligible to pay 5 per of tax");
            System.out.printf("you have to pay tax of Ruppes : %f",tax);

        }
          else
            System.out.println("you dont need to pay taxes ");

          */
        /* Question 3--Write a program to print by entering no by user e.g for monday no is 1 and so on for sunday its 0
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a Number");
        byte num= sc.nextByte();
        switch (num) {
            case 0 -> System.out.println("today is sunday");
            case 1 -> System.out.println("today is monday");
            case 2 -> System.out.println("today is tuesday");
            case 3 -> System.out.println("today is wednesday");
            case 4 -> System.out.println("today is thursday");
            case 5 -> System.out.println("today is friday");
            case 6 -> System.out.println("today is saturday");
            default -> System.out.println("invalid entry");

        }
        */
        /*Question No 4
         Write a java program to check whether enter year by user is leap year or not

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year to check its leap year or not");
        int year= sc.nextInt();
        if(year%100==0) {
            if (year % 400 == 0)
                System.out.format("enter year %d is a leap year", year);
            else
                System.out.printf("enter year %d is not a leap year", year);
        }
        else if(year%4==0) {
                System.out.printf("enter year %d is  a leap year", year);
            }
        else
            System.out.printf("year %d is not a leap year",year);
        */
        /*Question 5
        Write a program wheather enter website is commercial, orgnization or Indian take input from user..

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your website name");
        String Web= sc.next();
        boolean a=Web.endsWith(".com");
        boolean b=Web.endsWith(".org");
        boolean c=Web.endsWith(".in");
        if(a)
            System.out.println("enter website is comercial");
        else if(b)
            System.out.println("Enter website is Orgnizational");
        else if(c)
            System.out.println("Enter website is indian");
        else
            System.out.println("invalid website");
        System.out.println("done with this ");

         */
        /* practice 2 times

        // question4:
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year to check it its leap year or not ");
        int year=sc.nextInt();
        if(year%100==0){
            if(year%400==0)
                System.out.printf("%d is leap year",year);
            else
                System.out.printf("%d is not a leap year",year);
        }
        else if(year%4==0)
            System.out.printf("%d is leap year",year);
        else
            System.out.printf("%d is not a leap year",year);

          Question5:
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a website name");
        String name=sc.next();
        if(name.endsWith(".org"))
            System.out.println("enter website is organizational");
        else if(name.endsWith(".edu"))
            System.out.println("enter website is educational");
        else if(name.endsWith(".com"))
            System.out.println("enter website is commercial");
        else
            System.out.println("webiste type can't recognise");

         */



    }

}
