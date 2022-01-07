package com.company;

public class Ch_31_Methods {
    /* method syntax-- >1  static_data type_name of method(int a, int b){    //  not required to build an object
    comments
    }
    method syntax-- >2  data type_name of method(int a, int b){       // required to build an object
    comments
    }

     */
    static int logic(int x, int y) {    //1--why static __currently we are using single logic so no confusion and we are calling it right...
   //  int logic(int x,int y) {         //2-- but when we are using multiple logic then so we need object so we could called  a specific logic(method)
        int z;
        if (x > y)            // this is logic which will produce one output  and that will return!!!....
            z = x + y;
        else
            z = (x + y) * 5;
        return z;      // return it will dump the value of expression whenever we call method
    }
        public static void main (String[]args){
         //   Ch_31_Methods obj=new Ch_31_Methods();
            int a = 9;
            int b = 15;
            int c;
            c = logic(a, b);     // calling the method to return value of expression or logic!!!...
         //  c=obj.logic(a,b);    // 2--calling method by object creation
            System.out.println(c);
            int a1 = 16;
            int b1 = 20;
            int c1;
           c1 = logic(a1, b1);     // calling the method to return value of expression or logic!!!...
          //  c1=obj.logic(a1,b1);
            System.out.println(c1);
        }
    }




