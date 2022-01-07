package com.company;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Ch_35_methodPS {
    /* Problem 1: by concept 1 <--iterative approach--> of method
    write a program to print multiplication table of number 'n'..
     */
/*
    static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d=%d \n", n, i, i * n);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int num=sc.nextInt();
        table(num);
  }
 */
    /* problem 2:Write a program using function to print foloowing patter
    pattern= *
             * *
             * * *
             * * * *

      static void pattern (int n){
          for(int i=0;i<n;i++){
              for (int j=0;j<=i;j++){
                  System.out.print("* ");
              }
              System.out.println("");
          }
      }

    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many patter you want");
          int num=sc.nextInt();
          pattern(num);
    }
     */
    /*Problem 3: Write a recursive function to print sum of first n natural number

    static int sum(int n) {
        int result = 0;
        if (n == 0)
            return 0;
        else {
            result = n + sum(n - 1);
            return result;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for which you want to calculate sum of first 'num' natural number ");
        int num=sc.nextInt();
        System.out.printf("sum of first %d natural number is =%d",num,sum(num));
    }

     */
    /* problem:4
    print following patter using method
       * * * *
       * * *
       * *
       *

    static void pattern1(int a){
        for(int i=a;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n to print patter n times ");
        int n= sc.nextInt();
        pattern1(n);
    }
     */
    /*Problem 5: write nth term of  fibonacci series
   logic building--
   what is fibonacci series it is
   0 1 1 2 3 5 9 14....
   num, num1, num+num1=num2, num1+num2=num3, ....


    most time confusing need a lot of practice
    static int fibonacci_recursion(int n) {
        int a;
      if(n==1)
          return 0;
      else if(n==2)
          return 1;
      else
          a= fibonacci_recursion(n-1) +fibonacci_recursion(n-2);
      /* suppose i pass 4 that is above statement should return 2 but how lets see
         {fibo(3)} + (fibo(2))
        { fibo(2)+fibo(1) } + 1
         {1+0}+1=2
         hence it will return 2
         so what we understood is fibo(n-1) will return one term before the term we want and fibo(n-2) will
         return last 2nd term before the term we want at the end we only add it to get nth term we want
          that's how logic build

          return a;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value of N to print Nth term of fibonacci series ");
        int N=sc.nextInt();
        System.out.printf("%dth term of fibonacci series is %d ",N,fibonacci_recursion(N));
    }

 */
    /* Problem 6:
    find the avg of set of number using varargs concept..


    static float avg(int ...arr){      // why we write static void because we have to return float value and not int..
        float sum=0.0f;
        int c=0;
        for(int a: arr){
             sum+=a;
             c++;
        }

        return sum/c;

    }
    public static void main(String[] args) {
        System.out.println(avg(50,43,50,78,63));
    }

     */
    /*
    problem:7
    print following patter using method recursion concept
               * * * *
               * * *
               * *
               *
I got the logic of this one

    static void pattern(int n) {
        if (n > 0) {          // called as base condition recursive should not be -ve end being infinite loop ..
            for (int i = n; i > 0; i--) {
                System.out.print("* ");
            }
            System.out.println("");
            pattern(n-1);
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
     */
    /*problem 8
    :Write a program using recursive function  to print following pattern
    pattern= *
             * *
             * * *
             * * * *

       here logic is we wrote pattern(n-1) and pass value of n=4 with base condition n>0
       what will happen see
  how program will execute
  first call pattern(4-1)+ 4 * print karna hai
             again pattern(3-1)+3* print karna hai+4 * print karna hai
             again pattern(2-1)+2 *print karna hai+3* print karna hai+4 * print karna hai
             again pattern(1-1) condition false+1 * print karna hai + 2 *print karna hai+3* print karna hai+4 * print karna hai
       see now first 1 * print hoga then 2 * and so on...
    static void pattern(int n){
        if(n>0){      // base condition
            pattern(n-1);
            for(int i=0;i<n;i++){
                System.out.print("* ");
            }
            System.out.println("");

        }
    }

    public static void main(String[] args) {
        pattern(4);
    }

     */
    /* Problem 9: write a program to convert celcius temp into fahernhite
    formula `c=(F-32)/1.8

    static void convert(float n){
        float c;
        c=(n-32)/1.8f;
        System.out.printf("temp in celcious is %f",c);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temp in fahernhite to convert into celcius ");
        float temp=sc.nextFloat();
        convert(temp);
    }
     */
    /*Problem 10: repeat problem 3 by iterative approach..
    write a sum of n natural  number..

    static int sum(int n){
        int result=0;
        if(n>0) {
            result= n + sum(n - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter nth term of natural to calculate sum");
        int num=sc.nextInt();
        System.out.printf("sum of %d natural number is: %d ",num,sum(num));
    }
     */

    // lot of practice need in fibonacci and recursion method concept ....

}
