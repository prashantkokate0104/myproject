package com.company;

public class Ch_32_MethodOverloading {
    /* concept 1--
    static void logic() {              // we use data type void if we dont want to return anything

        System.out.println("I invented a new word");
    }
        public static void main(String[] args) {
            logic();                     // calling method;
    }*/

    /* concept 2---passing int argument in method
    calling int value from main method

    static void change(int a){
        a=98;
    }
     */
    /* Concept 3-- passing array value in method
    static void change1(int[] arr){

        arr[0]=91;
    }

     */
    /*concept 4--Method overloading  concept 4
        note-- thing we write in method ( called argument )
        now look in java we can write method of same name but passing different type of argument its called method overloading
        when we called method we have to mentioned argument too to differentiate which method we are calling
        will be explain with expample
     */
    /* method 1--method passing  no argument
    static void method() {
        System.out.println("hello bro");
    }

    // method 2-- with integer as argument we are passing
    static void method(int a) {                // note --here a is call as parameter
        System.out.println("hello bro " + a + " times");
    }

     */
    /* concept 5-- we can not overload a method using changing data type or changing return type i.e void, int etc..
    suppose we create to method
    method1-- static void method(int a){
    }
    method2--static int method(int y){
    }
    here in case method 2 write with same parameter that's passing integer so java will say method all ready define...
    note passing different no parameter in same retrun type will be counted different in java
    e.g
    static void method(int a)
    static void method(int a, int b)
    static void method( int a,int b,int c)
    all be considered as different method in java....
     */

    public static void main(String[] args) {
       /* Concept 2--
       trying to call main method whether value of integer can be called or not---ans can't called only reference can be call
        int x=45;

        change(x);
        System.out.println("value of x after running method "+x);  // we got output 45 and not 98
                                                                // becuase we pass only reference when we call method and not value
    }

        */

         /* Concept 3--
        int[] arr={40,78,23,45,89};
        change1(arr);     // we are altering one value in array lets find out whether its change or not
        System.out.println("value of array element after calling main method "+arr[0]); // and we found value of index 0 change here becuase this time we passed reference
                                                                                        // that is arr the name of array because array itself is object

        */
        /*Method overloading  concept 4
        note-- thing we write in method ( called argument )
        now look in java we can write method of same name but passing different type of argument its called method overloading
        when we called method we have to mentioned argument too to differentiate which method we are calling
        will be explian with example


        method();  // will call method with no argument
        method(20);  // will call method with integer as argument note -- here 20 is called as argument
         */
    }
}
