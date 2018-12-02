package com.company;

public class OpenClosed {
    public static void main(String[] args) {
        student phani = new student(19,"phani");
        phani.getStudent();
        student teja = new childStudent(20,"teja");
        teja.getStudent();
    }
}

class student{
    int id;
    String name;
    student(){

    }
    student(int id,String name){
        this.id = id;
        this.name = name;
    }

    public void getStudent(){
        System.out.println(id);
        System.out.println(name);
    }
}
//So by design change we want the getStudent to have an extra print statement after some days,
//rather than changing the code we extend it create the following

class childStudent extends student{
    childStudent(int id,String name){
        super.id = id;
        super.name = name;
    }
    public void getStudent(){
        System.out.println(id);
        System.out.println(name);
        System.out.println("hello World");
    }
}

/*
Notes
1_ A class must be open to extension and close to modification
2_ once a class is created it must only be exteneded but not modified because if modified
    some of the other users using the class will lose some functionalities
 */