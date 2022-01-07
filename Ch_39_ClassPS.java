package com.company;
import java.util.Scanner;
/* problem 1: create one custom class which have some properties and some method


class  Employee2{    /* we wanted to wrote Class name Employee but we could not because we cant write
    dublicate class name inside same package in java so we wrote Employee1

    int salary;
    String name;
    public int getSalary(){   // method returning int value
        return salary;
    }
    public String getName(){    // method returning string
        return name;
    }
    public void setName(String n){
         name=n;
    }
}
public class Ch_39_ClassPS {
    public static void main(String[] args) {
        Employee2 harry=new Employee2();        // object instantiation
        harry.salary=30000;                     // setting attribute
        System.out.println(harry.getSalary());
        harry.setName("prashant kokate");       // calling method via objet and passing argument string
        System.out.println(harry.getName());    // calling another method
        System.out.println(harry.getSalary());
    }
    */

/*  problem2:  create class cellphone with method ringing vibrating etc..

class Cellphone{                // created a class cellphone
    public void ringing(){      // created a public  method name --ringing  for cellphone class
        System.out.println("basterd your phone is ringing");
    }
    public void vibrating(){   //  created a public method of name vibrating  for cellphone class
        System.out.println("basterd your phone is vibrating");

    }

}
public class Ch_39_ClassPS {
    public static void main(String[] args) {
        // class instantiation
        Cellphone my=new Cellphone();
        Cellphone your=new Cellphone();
        // calling method
        my.ringing();
        your.ringing();
        my.vibrating();
        your.vibrating();
    }

 */
/* problem-3 create a class Square with method initialising side area and perimeter

 */
class Square{        // created a custom class
    int A;
    int P;
    public void area(int a, int b){
        A=a*b;
        P=2*(a+b);
        System.out.println("area is "+A);
        System.out.println("perimeter is "+P);
    }

}
public class Ch_39_ClassPS {
    public static void main(String[] args) {
       Square fig1=new Square();   // instantiation of class -- created an object
       fig1.area(5,6); // calling method via object area


    }
}

