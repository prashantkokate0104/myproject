package com.company;
class A{             //customise class A
    int a;
    public void method1(){
        System.out.println(" I am method1 of class A");
    }
}
class B extends A{
    @Override           /* this annotation help us if we override method truly or not so if we
                        made any changes with overridden method we would get error in annotation
                                 */
    public void method1(){      /*here we did method override by creating same method
                                in both parent and child class, in method over right everything of
                                 method is same no change from method name to return type and argument
                                       */

        System.out.println(" I am method1 of class B");
    }

}

public class Ch_48_MethodOverRiding {
    public static void main(String[] args) {
        A a=new A();     //object instantiation of class A
        B b=new B();     //object instantiation of class B
        a.method1();    // calling method1 by object of parent class
        b.method1();    /* calling method1 by object of child class
                          so object b of child will call over right method of child class
                          and not of parent class even having same details, we do it if we want
                          a particular method to  customise according to requirement while rest of
                          requirement is same for the rest of method
                        */

    }

}
