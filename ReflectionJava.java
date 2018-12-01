package com.company;
//Imports which are used to use reflections
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class ReflectionJava {
    public static void main(String[] args) {
        Demo obj = new Demo();
        Class cls = obj.getClass();
        System.out.println("The name of class is " +
                cls.getName());
        //Throwing a checked exception here, so we need to handle it
        Constructor constructor = null;
        try {
            constructor = cls.getConstructor();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println("The name of constructor is " +
                constructor.getName());
        System.out.println("The public methods of class are : ");

        // Getting methods of the class through the object
        // of the class by using getMethods
        Method[] methods = cls.getMethods();

        // Printing method names
        for (Method method:methods)
            System.out.println(method.getName());
    }
}


class Demo
{
    // creating a private field
    private String s;

    // creating a public constructor
    public Demo()  {  s = "Phani Teja Kesha"; }

    // Creating a public method with no arguments
    public void method1()  {
        System.out.println("The string is " + s);
    }

    // Creating a public method with int as argument
    public void method2(int n)  {
        System.out.println("The number is " + n);
    }

    // creating a private method
    private void method3() {
        System.out.println("Private method invoked");
    }
}

/*
Notes:
1_ Reflection is an API in java which  used to examine the behaviour and variables of the objects in the runtime
2_ Adv: Used for debuggers Dis: Overhead and exposure of internals
 */