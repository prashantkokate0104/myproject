package com.company;

public class Ch_09_AssocivityOfOperator {
    public static void main(String[] args) {
        // precedance means kon kisase bada jiska precedance bada vo evaluate hoga
        // Example below
        System.out.println(64/2-7+3*2);
        /*
        =32-7+3*2
        =32-7+6
        =31
        so this how precedance will work as * and / both operator have
         more precedance than - and + operator
         but when operator tie thats both have same precendance we go for associavity
         */
        System.out.println(6/3+7-14*5+68);
        /*
        in above case / and * both operator have same precedance so we will look associativity
        and associativity for / * % + - is left to right
        how will above ans will execute
        =2+7-14*5+68
        =2+7-70+68
        =9-70+68
        =-61+68
        =7
         */

    }
}
