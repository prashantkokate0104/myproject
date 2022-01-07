package com.company;
import java.util.Scanner;

public class Ch_14_StringMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String name =sc.nextLine();
        //String Ucase=name.toUpperCase();   to convert string into upper case--type-name.tuc
        //String Lcase=name.toLowerCase();    to convert string into lower case---type-name.tlc

        //System.out.println(name.toUpperCase());
        //String Lowercase=name.toLowerCase();
       // System.out.println(Lowercase);

       // String trString=name.trim();   .trim function eliminate/remove initial white spaces..
       // System.out.println(trString);

        //System.out.println(name.substring(a)); //.substring(a) fuction use to print string from 'a' index
       // System.out.println(name.replace('r','p'));   to replace first charactor with other..fN Syntax-.replace('','')

        //System.out.println(name.startsWith("p")); // to check string start with character you wrote in Parentheses
        //System.out.println(name.endsWith("nt"));   // to check string start with character you wrote in Parentheses

        //System.out.println(name.charAt(3));    //.charAt(a)  help to print index 'a' position character
        //System.out.println(name.indexOf('r'));   // .indexOf this function help us find index of character occure first
                                                   // like if i enter harry i will get ans 2, as r occure at index 2 first.

        //System.out.println(name.indexOf('r',3)); // this function help us find where character occure first but
                                                    //start for searching from index we mentioned..
        //System.out.println(name.lastIndexOf('r'));  // .lastIndexOf fN help us print where character occure at last to last  index
                                                       // e.g if enter prashrant string and search for character r it occure last at index 5

        //System.out.println(name.equals("harry"));    // compare string with you mentioned with case sensitivity if its equal it will return true

        //System.out.println(name.equalsIgnoreCase("HaRRY")); // .equalsIgnoreCase this Fn will return ture for comparing "harry" with "HaRRY"

        /* Escape sequence character
        System.out.println("hello my name is\tprashant");    \t help to add tab
        System.out.println("hello!\nwho the fuck you are");   \n add new line in string

         */



    }
}
