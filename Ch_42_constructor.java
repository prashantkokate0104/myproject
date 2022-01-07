package com.company;
class MymainEmployee{
    private int id;
    private String name;
    /* Constructor is method of same class in which we created it
   way of writing constructor
   public class_name(){
        set attribute that you define in class e.g in this case
        id=45;
        name=" your name is rascal"
       }

     */
    public MymainEmployee(){
        id=45;
        name="my name is rascal";
    }
    // constructor overloading
    public MymainEmployee(int n,String s){        //asking for two parameter one int and other is string
        id=n;
        name=s;

    }
    public void setId(int n){id=n;}
    public int getId(){return id;}
    public void setName(String myname){name=myname;}
    public String getName(){ return name;}
}

public class Ch_42_constructor {
    public static void main(String[] args) {
        /* first we used to write instantiation obj and by dot operator accessing attribute

        MymainEmployee obj=new MymainEmployee();
        obj.setId(52);
        obj.setName("my name is prashant ");
        System.out.println(obj.getId());
        System.out.println(obj.getName());

         */
        /* now we use constructor we directly instantiate an obj and call it ...
           the moment we made a obj for that class for which also have constructor.
           constructor automatically get call
         */
       // MymainEmployee obj=new MymainEmployee();
        /* in above object instantiation we can also pass argument as constructor wrk similarly of methos and
        we can overload constructor as well,*/
        MymainEmployee obj=new MymainEmployee(50,"my name is harry");
        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }

}
