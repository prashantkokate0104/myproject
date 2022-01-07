package com.company;

public class Ch_26_Array {
    public static void main(String[] args) {
        /*array function:
        suppose we want to store the mark of 500 student what we will
        do we can make 500 variable, store or can store it in one variable that's what
        array does, definition---Array is data structure which store group of
        variable of same type ....Note- array is Object in java
         */
        int [] marks;  // Declaration of Array
        marks=new int[5]; // memory allocation
        marks[0]=1;       // at index 0 we fill value 1
        int[] AR={5,3,9,};           //(declaration+memory allocation+initialization) combined
        System.out.println(marks[3]);
                                       // no element means zero element in array by default



    }

}
