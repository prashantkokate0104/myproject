package com.company;
// use constructor initialise obj with 1000
class MyEmployee{
    private int salary;
    public MyEmployee(int n ){
        salary=n;
    }
    public int getSalary(){
        return salary;
    }

}
public class Ch_42_exercise {
    public static void main(String[] args) {
        MyEmployee obj=new MyEmployee(1000);
        System.out.println(obj.getSalary());
    }
}
