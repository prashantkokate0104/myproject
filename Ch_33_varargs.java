package com.company;

public class Ch_33_varargs {
     /* purpose of varargs --
        suppose we are overloading a method with number of way  like below
      1>  static int sum(){

       return 0;
        }
       2> static int sum(int a){
       int result=0;
       result+=a;
       return result;
       }
       3> static int sum(int a,int b){
       int result=0;
       result=a+b;
       return result;
       then we kept on increasing argument and accessing a each method in main method
       is'nt it a labour work ???   --- instead if form one array and run for loop for method overloading we don't have to write
       overload each method manually....that's what VARARGS does
         */

    static int sum(int...arg) {         // method overload with the help of array
        // available as Int [] arr;
        /*concept 2--static int sum(int a,int ...args)  we are passing int value compulsory with array in method
         now we can't call method with no argument as such method not exist...

         */

        int result = 0;
        for (int a : arg) {          //accessing element from method called by specific no of parameter
            result += a;             //task to perform----Expression...
        }
        return result;               // return the result of expression.....
    }
    public static void main(String[] args) {
        /* purpose of varargs --
           suppose we are overloading a method with number of way  like below
           static int sum();   // Calling first method
           static int sum(int a);  // calling second method
           static int sum(int a,int b); // calling third method
           and same way we kept calling is'nt it a labour work ???
         */
        System.out.println(sum());        /* concept2-- called one method overload with no argument-- as we did not access array here so by default 0 will pass
                                           here we could access method with no argument becuase we pass array only but
                                          we pass int value along with array and tried acces method with no argument it will generate error as we ahve to have
                                          method with will have one int value
                                           */

        System.out.println(sum(2,3)); // called method sum with 2 argument
        System.out.println(sum(4,5,6,7,8)); //called method sum with 5 argument
        // dont worry about sequence your are accessing method with argument here we have overload method so
        // so only matter is argument we are passing to access that particular method...

    }
}
