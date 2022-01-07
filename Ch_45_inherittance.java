package com.company;
/*class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}
class Derived extends Base{         /*derived class from base class_name 'Base' by key word
                                     extends baseclass_name
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Ch_45_inherittance {
    public static void main(String[] args) {
        // creating an object of base class
        Base b=new Base();
        b.setX(40);
        System.out.println(b.getX());

        // creating an object of derived class
        Derived d=new Derived();
        d.setX(45);                  //accessing properties of base class using object of
                                     // derived class
        System.out.println(d.getX());
        d.setY(55);                  // accessing an obj of derived class using obj of it
        System.out.println(d.getY());

    }
}
*/
// task: create a animal as baseclass and derived a class name dog from it
class Animal{
    String p1;
    String p2="hello";

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }
}
class Dog extends Animal{          // derived a dog class from base class animal
    String p3;
    String p2="not hello";

    }


public class Ch_45_inherittance{
    public static void main(String[] args) {
        Animal obj1=new Animal();
        obj1.setP1("i am prashant");
        System.out.println(obj1.getP1());
        // creating an obj of derived class
        Dog obj2=new Dog();
        System.out.println(obj2.p2);




    }

}
