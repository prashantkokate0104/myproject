package com.company;

import java.util.Scanner;

public class Ch_34_Recursion {
    /*concept ---recursion--- method used in method itself where its define
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);      //we have used method factorial() inside method itself
        }
    }
     */
    /*
    static int factorial_iteration(int n){
        int sum=1;
        for (int i=1;i<=n;i++){
            sum*=i;
        }
        return sum;
    }
     */

    /* task --- fibonacci series
    static int fibonacci(int a){
   if(a==0)
       return 0;
   else if (a==1)
       return 1;
   else
       return fibonacci(a-1)+fibonacci(a-2);
    }
    */
    /* task of fibonacci by iteration

    static void fibonacci_iteration(int a){
        int num1=0;
        int num2=1;
        for(int i=0;i<a-2;i++){
            int num=num1+num2;
            int temp1= num2;
            num2=num;
            num1=temp1;
            System.out.print(num+" ");
        }
    }

     */



    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("enter no to calculate factorial");// enter no to calculate factorial of number for that take user input
        int fact=sc.nextInt();
        System.out.println("factorial of number is "+factorial(fact));
         */
        /* task to print fibonacci series
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no to print fibonacci series");//
        int fibo=sc.nextInt();
        System.out.printf("fibonacci series of for ist %d ",fibo);
        System.out.println("");
        for (int i=0;i<fibo;i++){
            System.out.println(fibonacci(i));
        }

         */
        /* iteration logic for fibonacci
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no to print fibonacci series");//
        int fibo=sc.nextInt();
        System.out.printf("fibonacci series of for ist %d number is  ",fibo);
        System.out.print(" "+0+" ");
        System.out.print(1+" ");
        fibonacci_iteration(fibo);

         */

    }
}
