package com.company;
class Phone{         //parent/super class
    public void method1(){
    System.out.println("turn on phone");
}

}
class SmartPhone extends Phone {      //child/sub class
    @Override              //method override
    public void method1(){
        System.out.println("turn on SmartPhone");

}
public class Ch_49_DynamicMethodDispatch {
    public static void main(String[] args) {


    }
}
