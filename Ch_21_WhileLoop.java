package com.company;

public class Ch_21_WhileLoop {
    public static void main(String[] args) {
        int a=100;
        while(200>=a) {
            System.out.println(a);
            a++;
        }
        while(true)            //infinite loop as condition always true
            System.out.println("hello");
    }
}
