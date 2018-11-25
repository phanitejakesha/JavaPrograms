//Author: Phani Teja Kesha
package com.company;

public class RuntimePolymorphism {
    public static void main(String []args){
        A obj1 = new A();
        B obj2 = new B();
        A obj3 = new B();
        //B obj4 = new A();   //B extends A, but A does not extend B so this throws a compile time error
        //Now,lets see what can be accesed for each object
        System.out.println("Acccesed by object 1");
        obj1.printFunction();
        obj1.getClassObj();
        System.out.println(obj1.i);
        System.out.println("Acccesed by object 2");
        obj2.printFunction();//All the methods and variables in both classes are accesible for this object
        obj2.getNumber();
        System.out.println(obj2.j);
        obj2.getClassObj();
        System.out.println(obj2.i);
        System.out.println("Acccesed by object 3");
        obj3.printFunction();   //The function is overrided by the child class
       // obj3.getNumber();   //Error throwed as getNumber is a class in B not in A
        // System.out.println(obj3.j); //Error as j in Class B not in A
        obj3.getClassObj();
        System.out.println(obj3.i);
        //For obj3 only the variables and methods in A and the methods which are overided in B are acccessible

    }
}

class A{
    int i = 0;
void printFunction(){
    System.out.println("I am class A");
}
void getClassObj(){
    System.out.println("Class Object A");
}
}
//Class B inherits the Class A
class B extends A{
    int j = 20;
    void printFunction(){
        System.out.println("I am class B ");
    }
    void getNumber(){
        System.out.println("10");
    }
}

//Notes for the runtime polymorphism
/*
If a child object is created with the reference to its parent class the the object can access all the methods and variables
in the parent class and if the methods are overrided in child class then the methods in Child class are called
Note: Static and Final classes cannot be overrided
 */