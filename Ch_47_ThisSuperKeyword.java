package com.company;

class  class1{
    class1(int n){
        System.out.println("i am a constructor of derived class "+n);
    }
}
class derivedclass1 extends class1{
    derivedclass1(int n){       /*this line is throwing error cause the movement we created obj of derived class
                           it will access default constructor of base class but here we have base class constructor with
                           argument now base class constructor will invoke so its expecting from us to make it clear so
                           we done it by writing "super" keyword
                            */
        super(n);
        System.out.println("I am a constructor of derived class "+n);
    }
}

public class Ch_47_ThisSuperKeyword {
    public static void main(String[] args) {
       derivedclass1 dc=new derivedclass1(10);
    }
}
