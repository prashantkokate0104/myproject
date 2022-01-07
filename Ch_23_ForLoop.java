package com.company;
import java.util.Scanner;
public class Ch_23_ForLoop {
    public static void main(String[] args) {
        /* for loop--when to use when we know number of iteration
        Syntax:   for(initialise; Condition; increment or decrement){
               //statement
        }
         */
        /*
          for(int i=1;i<=10;i++){
            System.out.println(i);
        }
         */
        /* write a program to print first 10 odd number using for loop...
        was a bullshit this one
        int i=0;
        int j=0;
        for(i=1;i<20;i+=2){
            System.out.println(i);
            j++;
        }
        System.out.printf("no of times loop run:%d",j);

         */
        /*lets try another-this one was good !!!
        int n=10;
        int i;
        for(i=0;i<n;i++){
            int num=2*i+1;
            System.out.println(num);
            }
         */
        // write a program to print n natural number in reverse order
        int n=10;
        for(int i=n;i>0;i--){
            System.out.println(i);

        }
         }

}
