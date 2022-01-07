package com.company;
import java.util.Scanner;
public class Ch_13_String {
    public static void main(String[] args) {
      /* import of string and printing it and defining it


        String name=new String("hellow harry");    ist way of defining
        String name2="hello harry";              2nd way of defining

       */
       Scanner sc=new Scanner(System.in);
       System.out.println("next() will print still didnt acces to white space");
       String STR=sc.next();
       System.out.println(" while nextLine() will print whole string " );
       String str=sc.nextLine();
       System.out.format("hello my name is: %2s",str);
    }
}
