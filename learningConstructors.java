package com.phani.concepts;

public class learningConstructors {

    public static void main(String[] args) {
        Class obj1 = new Class();
        Class obj2 = new Class(1);
        Class obj3 = new Class(1,2);
        inheritedClass obj4 = new inheritedClass(1,2);
        inheritedClass obj5 = new inheritedClass(1);
        obj4.print();
        obj5.set();
        new implementedClass(1).print();
        new implementedClass(1).set();

    }

}

class Class{
    Class(){
        System.out.println("Default constructor called");
    }
    Class(int a){
        System.out.println("Constructer with an integer is called");
    }
    Class(int a, int b ){
        System.out.println("Constructer with two integers");
    }
}

class inheritedClass extends Class{
    inheritedClass(int a){
        super();
    }
    inheritedClass(int a, int b){
        super(a);
        System.out.println("child Constructor with two interges");
    }
    void print(){
        System.out.println("Print method called");
    }
    void set(){
        System.out.println("Set method called");
    }
}


class implementedClass extends inheritedClass implements learnInterface {

    implementedClass(int a) {
        super(a);
    }

    @Override
    public void print() {
        System.out.println("Print method called-Inherit");
    }

    @Override
    public void set() {
        System.out.println("Set method called-Inherit");

    }
}


interface learnInterface{
    void print();
    void set();
    default void get() {
        System.out.println("default method");
    }
}
/*
Notes:
1) The  default constructor is automaticcaly inherited when a class inherits an other class if no constructor is mentioned in the
child class
2) If a constructor is provided then the default is not present for the child class
 */