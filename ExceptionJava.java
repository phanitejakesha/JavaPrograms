//Author: Phani Teja Kesha
package com.company;
import java.io.*;

public class ExceptionJava {
    public static void main(String[] args){
        try (FileReader fr = new FileReader("phaniText.txt")) {
        }    //As filereader inherits throwable class we need to throw a exception or handle it
        catch(Exception e){
            System.out.println("Please write a valid file name");
        }
    }
}

class checkedException{
    void openFile(String s) throws Exception{
        FileReader f = new FileReader(s);   //This a other way to handle a checked exception in java by
        // throwing a exception to the upper class
    }
}

class uncheckedException{
    void intOverflow(){
        int i = 1/0;
        System.out.println(i);  //This is an example of unchecked exception
    }
}


//Notes for the exceptions
/*
Throwable is the parent class for exceptions and it has two subclasses
1) Exception
2) Error
 The classes which inherit exception like IO,SQL are checkedExceptions
 The classes which inherit RuntimeException Class like Arithemetic Expression, NullPointer, NumberFormat, IndexOutofBounds classes are
    called as uncheckedExceptions
 Errors are irrecoverable, Outofmemory,virtualmachineerror,assertionError
 */