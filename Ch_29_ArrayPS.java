package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Ch_29_ArrayPS {
    public static void main(String[] args) {
        /*question 1 calculate sum of array element...
        float array[]={10.5f,12.5f,4.5f,9,0.5f};
        float sum=0.0f;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        System.out.printf("sum of array element is %f",sum);


        //question 2 write a program wheather given integer is present in or not
        // by myy logic but seems messsy--equal logic
        int[] array={5,9,8,6,9,7,6};
        int k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter element");
        int var=sc.nextInt();
        for (int j : array) {
            if (j == var) {
                k++;
                break;
            }
        }
        if(k!=0)
        System.out.println("Enter element found in array");
        else
        System.out.println("Enter element not found in array");

        // Question 3rd calculate avg of element of array by each loop
        // by for loop
        int[] array={5,9,8,6,9,7,3};
        float sum=0.0f;
       // for (int j : array) {
       //     sum+=j+0.0f;
       // }
        int i=0;
        //while(i<array.length) {
         //   sum=sum+array[i];
         //   i++;
        //}

        sum=sum/7;
        System.out.print(sum);


        //Question 4: write a program  to add two matrices of size 2*3
        int[][] arr1={{1,2,3},{4,5,6}};
        int [][] arr2={{7,8,9},{9,6,3}};
        int [][] result={{0,0,0},{0,0,0}};

        for (int i=0;i<arr1.length;i++) {         //row no of times
            for (int j = 0; j < arr1[0].length; j++) {  //column no of times
                result[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(result[i][j]+" ");   //printing the element of 2d array
            }
            System.out.println("");
        }


        //Question 5:Write a reverse array
        // my logic
        int[] arr={5,9,40,52,63,21,47};
        int[] rever={0,0,0,0,0,0,0};
        for (int i=arr.length-1;i>=0;i--){
            rever[i]=arr[i];
            System.out.print(rever[i]+" ");
        }


        another logic which is good
        int[] arr={5,9,40,52,63,21,47};
        int l=arr.length;
        int n=Math.floorDiv(l,2);  //ist integer willbe divided by second integer
                                    //       by questiont will be floor down
        int temp;
        for (int i=0;i<n;i++){
            temp=arr[i];       // swaping technique........
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }
        for (int element:arr)      //modified for loop to access element of array..
        System.out.print(element+" ");

        float a=Math.floorDiv(5,4);
        System.out.println(a);


        //QUESTION 6: find maximum element in array--two logic we can use
        1--direct function to check max element in array
        2---we can access each element of array in keep on adding to one varible logic is below..
        int[] arr={45,89,74,163,23,12};
        //System.out.println(Arrays.stream(arr).max());
        int max=Integer.MIN_VALUE;  //least inger value now even negative no can be check
        for (int element:arr){
            if(max<element)
                max=element;
        }
        System.out.println(max);


         Question find max value in array;;
        int max=Integer.MAX_VALUE;
        int[] arr={5,9,40,52,-63,21,-147};
        for (int e:arr){
            if(max>e)
                max=e;
        }
        System.out.println("min value in array is : " +max);


        Write a java program to check whether a array is sorted or not....
         int[] arr={21,25,38,63,-450};
         boolean sorted=true;
        for (int i=0;i<( arr.length-1);i++){
            if (arr[i]>arr[i+1]){
                 sorted=false;
                 break;
            }
        }
         if (sorted)
             System.out.println("array is sorted");
         else
             System.out.println("array is not sorted");

         */


        



    }
}
