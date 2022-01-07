package com.company;

import java.awt.*;
import java.util.Scanner;
/*class cylinder{
    private float radius, height;
    void setRadHeigh(float n1,float n2){
        radius=n1;
        height=n2;
    }
    float getRad(){
        return radius;
    }
    float getHeight(){
        return height;
    }

}
public class Ch_44_pS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius");
        float r=sc.nextFloat();

        System.out.println("Enter height");
        float h=sc.nextFloat();

        cylinder obj=new cylinder();  // instantiation of obj
         obj. setRadHeigh(r,h);        //passing argument and calling method though obj
        System.out.println("radius of cylinder is"+obj.getRad());
        System.out.println("height of cylinder is"+obj.getHeight());
        /* shortcut for getter and setter
        1) click on code
        2) click on  generate
        3) click on getter and setter
        4) choose for variable input you want getter and setter
        you will choose to select all variable you make as private
         */


        /* trying here by sshortcut now
        */


class Cylinder{
   final float PI=3.14f;   // our way

   // final double PI=Math.PI;   Math.PI method give value of in double we can use it as well.
    private float radius;
    private float height;
    float area,volume;
         /*
            public float getRadius() {
                return radius;
            }

            public void setRadius(float radius) {
                this.radius = radius;
            }

            public float getHeight() {
                return height;
            }

            public void setHeight(float height) {
                this.height = height;
            }
            public float getArea(){
                area=2*PI*radius*radius+PI*2*radius*height;
                return area;
            }
            public float getVolume(){
                volume=PI*radius*radius*height;
                return volume;
            }

          */
           /*problem 3: repeat problem 1 by using constructor, use shortcut constructor


    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public float getRadius() {
        return radius;
    }

    public float getHeight() {
        return height;
    }

            */
}
       /*problem 4:
class Rectangle{            //created a custom class Rectangle
    private int length;
    private  int breadth;

           public Rectangle() {           //constructor with no argument
               this.length=4;
               this.breadth=8;
           }

           public Rectangle(int length, int breadth) {      //constructor  overload with int argument
               this.length = length;
               this.breadth = breadth;
           }

           public int getLength() {
               return length;
           }

           public int getBreadth() {
               return breadth;
           }

        */
          /*problem 5: repeat everything for sphere
          1) constructor overload and calculate area and volume
          2) calculate area and volume using getter and setter
           */
class Sphere{
    private int radius;
    final double PI=Math.PI;
    double area, volume;
          /*
           public Sphere(int radius) {        //constructor 1
               this.radius = radius;
           }

           public Sphere() {        // constructor overloaded with no parameter
               radius=6;
           }
           public double getArea() {
               return area=4*PI*radius*radius   ;
           }
           public double getVolume() {
               return volume=(4.0/3.0)*PI*radius*radius*radius;
           }

           */
           /* part 2:
           public void setRadius(int radius) {      //radius getter
               this.radius = radius;
           }

           public double getArea() {
               return area=4*PI*radius*radius;
           }

           public double getVolume() {
               return volume=(4.0/3.0)*PI*radius*radius*radius;
           }

            */
       }
public class Ch_44_pS{
            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
               // System.out.println("enter radius");
               // float r=sc.nextFloat();

               // System.out.println("Enter height");
                //float h=sc.nextFloat();

               // Cylinder obj=new Cylinder();  // instantiation of obj
                //obj.setRadius(r);     //passing argument radius and calling method though obj
               // obj.setHeight(h);    //passing argument height and calling method though obj
               /* System.out.println("radius of cylinder is "+ obj.getRadius());
                System.out.println("height of cylinder is "+obj.getHeight());

         */
          /* problem 2; use problem 1  for surface area and volume of cylinder
          surface area of cylinder=PI*r*r+2*PI*r*h
          volume of Cylinder= PI*r*r*h
           */
              //  System.out.println("area of cylinder is "+obj.getArea());
               // System.out.println("volume of cylinder is "+obj.getVolume());

            /* problem 3: repeat problem 1 by using constructor

               Cylinder obj=new Cylinder(r,h);
                System.out.println("radius of cylinder is "+ obj.getRadius());
                System.out.println("height of cylinder is "+obj.getHeight());

             */
                /* problem 4:
                // 1; calling constructor with argument
                System.out.println("enter length");
                int l=sc.nextInt();
                System.out.println("Enter breadth");
                int b=sc.nextInt();
                Rectangle obj=new Rectangle(l,b);       //object instantiation and calling together
                System.out.println("length of rectangle is "+obj.getLength());
                System.out.println("length of rectangle is "+obj.getBreadth());
                //2; calling overloaded constructor with no argument
                Rectangle obj1=new Rectangle();  /* Even having same class and we develop objectfor class but call
                 overloaded constructor we have to use different obj,,,

                System.out.println("length of rectangle is "+obj1.getLength());
                System.out.println("length of rectangle is "+obj1.getBreadth());
                */

                /*  problem 5: problem 5: repeat everything for sphere
                    1) constructor overload and calculate area and volume
                     2) calculate area and volume using getter and setter

                 */
                /*part1:
                System.out.println("Enter radius");
                int r= sc.nextInt();
               Sphere obj1=new Sphere(r);
               System.out.println("area of sphere is "+ obj1.getArea());
               System.out.println("volume of sphere is "+ obj1.getVolume());
                Sphere obj2=new Sphere();
                System.out.println("area of sphere is "+ obj2.getArea());
                System.out.println("volume of sphere is "+ obj2.getVolume());

                 */
                /*part 2:
                System.out.println("Enter radius");
                int r= sc.nextInt();
                Sphere obj1=new Sphere();   // object instantiation
                obj1.setRadius(r);         //method calling
                System.out.println("area of sphere is "+ obj1.getArea());
                System.out.println("volume of sphere is "+ obj1.getVolume());

                 */



            }

        }

