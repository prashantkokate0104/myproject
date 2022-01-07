package com.company;
import java.util.Scanner;
public class Ch_27_ArrayTutorial {
    public static void main(String[] args) {
        // we have select data for the data we want to store in array
        //e.g for int data type array.
        //int marks[]={5,5,3,7,9};
        //float marks[]={4.5,9.5,7.8,6.3};
        //char sub[]={a,b,c,d};
        /*char[] sub ={'a','b','c','d','e'};
        System.out.println(sub[1]);
        String[] str ={"soham","bhavesh","chutiya"};
        System.out.println(str[2]);
        System.out.println(sub.length); // gives length of array

         */
        // quick quiz display array in reverse order!!!
        int[] marks={5,3,7,9}; //array declaration

        //for (int i=marks.length-1;i>=0;i--){
            //System.out.println(marks[i]);

        // Another way to display element through for loop!!!
        for(int element:marks){
            System.out.println(element);
        }

    }
}
