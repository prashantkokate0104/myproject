package com.company;
class Base1{
    Base1(){
        System.out.println("i am a constructor");
    }
    Base1(int a){
        System.out.println("I am a overloaded constructor with value of n as :"+a);
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am a constructor of derived class");
    }
    Derived1(int n1, int n2){
        super(n1);
        System.out.println("I am a overloaded constructor of derived class with n1 and n2 value  "+n1+" "+ n2);
    }

}
class ChildOfderived extends Derived1{       // creating a further child class of derived class
    ChildOfderived(){       // created a constructor of child class
        System.out.println("I am child class constructor");
    }
    ChildOfderived(int x,int y,int z){     // overloaded a child class constructor
        super(x,y);                // calling a overloaded constructor of derived class of 2 argument
        System.out.println("I am a overloaded constructor of child class with value of x,y,z"+x+" "+y+" "+z);
    }
}

public class Ch_46_ConstructorInheritance {
    public static void main(String[] args) {
       //creating an obj of base class
        /*concept 1:* the movement we instantiate an obj from base class constructor of it will be
        automatically

        Base1 b1=new Base1();

         */

        /* concept 2: now we are calling overloaded constructor of base class by passing a
        particular argument during object instantiation

        Base1 b2=new Base1(10);*/

        /* Concept 3: the movement we instantiate an obj from derived class inevitably
        a constructor of base class with "no argument" get call first then constructor of
        derived class get call as all property of base class are accessible to derived class
        so constructor will be accessible too.

        // creating an obj of derived class
        Derived1 d1=new Derived1();

         */
        /* concept 4: even if instantiate an obj of derived class and called an overloaded
        constructor of derived still a default constructor of base class will be invoked first.
        and then overloaded constructor of derived class will invoke...

          Derived1 b1=new Derived1(20);
         */

        /* Concept 5: how can invoke an overloaded Constructor of base class which have argument
        using base class object instantiation we do it by writing "super" keyword and argument in ()
        in derived class any constructor with which you want invoked with it
        e.g to invoke an overloaded constructor of base class which is of  particular argument

        syntax-- super(argument)
        argument could be direct raw value or variable which is passed to the constructor
        I have written super keyword
        let's invoke overloaded constructor of derived class and base class together
        to do it we have to write super keyword in overloaded constructor of derived class
        with argument of required type.

        Derived1 b1=new Derived1(10,12);

         */
        /* concept 6:  now here we also created a child class for exiting derived class
        and instantiate an obj of child class with overloaded construction calling
        now rest we know*/

        ChildOfderived cd=new ChildOfderived(5,6,7);









    }
}
