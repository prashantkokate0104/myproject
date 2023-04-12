package com.company;
import java.util.Scanner;
public class Ch_06_Exercise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr Subject1 Max Mark:");
        int T1=sc.nextInt();
        System.out.println("Enetr Subject1 Mark you got:");
        float S1=sc.nextFloat();
        System.out.println("Enetr Subject2 Max Mark:");
        int T2= sc.nextInt();
        System.out.println("Enetr Subject2 Max you got:");
        float S2=sc.nextFloat();
        System.out.println("Enetr Subject3 Total Mark:");
        int T3= sc.nextInt();
        System.out.println("Enetr Subject3 Mark you got:");
        float S3=sc.nextFloat();
        System.out.println("Enetr Subject4 Total Mark:");
        int T4= sc.nextInt();
        System.out.println("Enetr Subject4 Mark you got:");
        float S4=sc.nextFloat();
        System.out.println("Enetr Subject5 Total Mark:");
        int T5= sc.nextInt();
        System.out.println("Enetr Subject5 Mark you got:");
        float S5=sc.nextFloat();
        float Total=T1+T2+T3+T4+T5;
        float TotalMark=S1+S2+S3+S4+S5;
        float percentage=(TotalMark/Total)*100;
        System.out.println("Final percentage of student");
         System.out.println("hello world");
        System.out.println(percentage);

    }
}


