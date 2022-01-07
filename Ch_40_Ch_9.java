package com.company;

import java.util.Scanner;

/*class Myemployee{
   /* int id;        // here this are default attribute so can be accessible to another than the class it created ..
    String name;

    private int id;    // now this attribute are become can not be accessible from outside class without method
    private String name;
    public void setID(int n){          //method access private attribute from another class
        id=n;
    }
    public int getId(){               //method access private attribute from another class
        return id;
    }
    public void setName(String N){
        name=N;
    }
    public String getName(){
        return name;
    }
}
    public class Ch_40_Ch_9 {
         public static void main(String[] args) {
             Myemployee obj=new Myemployee();   //instantiation of class i.e creation of obj from class
             /*obj.id=50;    generate  error we have set id as private attribute so can't access it directly
             in this case we pass attribute  value through  methods we created..like below se and get methods ...

             obj.setID(50);                   // calling method by obj
             System.out.println(obj.getId());  // calling method by obj
             // obj.id=50;
             obj.setName("hello 85");
             System.out.println(obj.getName());


             // exercise to calculate area and parameter of circle and recheck radius is right or wrong

         }
    }
    */
// exercise to calculate area and parameter of circle and recheck radius is right or wrong
class Circle{
          private float pie=3.14f;
          private float r;
          private float area;
          private float perimeter;
          public void setr( float n){
              r=n;
          }
          public float getArea(){
              area=pie*r*r;
              return area;
          }
          public float getPerimeter(){
              perimeter=2*pie*r;
              return perimeter;
          }
          public void validation(){
              if(r/2==area/perimeter)
                  System.out.println("calculation is valid ");
              else
                  System.out.println("calculation is not valid");
          }
}
public class Ch_40_Ch_9 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
         System.out.println("Enter radius for calculation");
         float radius=sc.nextFloat();
         Circle obj=new Circle();  // instantiation of obj
          obj.setr(radius);
        System.out.println(obj.getArea());
        System.out.println(obj.getPerimeter());
        obj.validation();






    }
}


