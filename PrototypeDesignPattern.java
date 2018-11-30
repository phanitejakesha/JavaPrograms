package com.company;

public class PrototypeDesignPattern {
    public static void main(String[] args) {
        EmployeeRecord r1 = new EmployeeRecord(10,"Phani","Student",1000,"Maryland");
        r1.showRecord();
        EmployeeRecord r2 = (EmployeeRecord) r1.getClone();
        r2.showRecord();
        EmployeeRecord r3 = r2.getSameObject();
        r3.showRecord();
    }

}

//Prototype is an interface which is to be imlemented by employeeRecord class
interface Prototype{
    Prototype getClone();
}

//Implements prototype interface
class EmployeeRecord implements Prototype{
    int id;
    String name;
    String design,address;
    double salary;
    public EmployeeRecord(){

    }
    public EmployeeRecord(int id,String name,String design,double salary,String address){
        this.id = id;
        this.name = name;
        this.design = design;
        this.salary = salary;
        this.address = address;
    }
    public void showRecord(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(design);
        System.out.println(salary);
        System.out.println(address);
    }
    // Why cant we directly send the employeeRecord type
    public Prototype getClone(){
        return new EmployeeRecord(id,name,design,salary,address);
    }

    //Its working but why cant we use like this?
    public EmployeeRecord getSameObject(){
        return new EmployeeRecord(id,name,design,salary,address);
    }
}

/*
Notes:
1) it says that cloning of an existing object instead of creating new one and can also be customized as per requirement
    This pattern should be followed, if the cost of creating a new object is expensive and resource intensive
2) hides complexity of creating new objects , clients can get new objects without knowing which object it will be
 */
