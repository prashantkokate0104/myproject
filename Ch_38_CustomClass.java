package com.company;
class Employee1 {               //declaring custom class
    // setting Attribute of custom class
    int id;
    int salary;
    String name;
    String sex;
    // Declaring method of custom class
    public void details(double n) {        //Declaring method of custom class
        /* till the we were writing static method write cuase static method can be access in class we made but here we are accessing
        method from different class so we need access modifier as public so it could be call from different class
        via object

         */

        if (n > 1 && n < 3) {
            System.out.println("employee name is " + name);
            System.out.println("employee id is "+id);
            System.out.println("you will get 20% increment");
            System.out.println("your updated salary is " + salary * 1.20f);
        } else if (n > 3) {
            System.out.println("employee name is " + name);
            System.out.println("employee id is "+id);
            System.out.println("you will get 35% increment");
            System.out.println("your updated salary is " + salary * 1.35f);
        } else {
            System.out.println("employee name is " + name);
            System.out.println("employee id is "+id);
            System.out.println("you will not get any increment");
            System.out.println("your salary is " + salary);
        }
        // we can write as many method as we want and can be called by via object
    }
}

    public class Ch_38_CustomClass {
        public static void main(String[] args) {
            Employee1 harry = new Employee1();  // Instantiation of object
            Employee1 jenny = new Employee1();  // Instantiation of object
            Employee1 ram = new Employee1();    // Instantiation of object

            //setting attribute
            harry.id = 920;
            harry.name = "harry pandit";
            harry.salary = 30000;
            harry.sex = "male";

            jenny.id = 820;
            jenny.name = "jenny pandit";
            jenny.salary = 35000;
            jenny.sex = "female";

            //printing an attribute
            System.out.println(harry.id);
            System.out.println(harry.sex);
            System.out.println(jenny.salary);

            harry.details(1.5);  // calling method details of class employee via object harry
            jenny.details(3.5); // calling method details of class employee via object jenny

        }

    }

