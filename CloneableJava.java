package com.company;

public class CloneableJava {
    public static void main(String[] args) throws CloneNotSupportedException{
    CreateCloneObject obj1 = new CreateCloneObject(1);
    CreateCloneObject obj2 = (CreateCloneObject) obj1.clone();
        System.out.println(obj1.i);
        System.out.println(obj2.i);
        obj2.i = 10;
        System.out.println(obj1.i);
        System.out.println(obj2.i);
        //changing the value of one object is not changing the value of the other

    }
}



class CreateCloneObject implements Cloneable{
    public int i;
    public CreateCloneObject(int i){
        this.i = i;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

/*
Notes:
1) Its'a marker interface
2) Any class which wants to use clone() method needs to implement cloneable interface
3) Creates shallow copies
4) If the object’s class doesn’t implement Cloneable interface then it throws an exception ‘CloneNotSupportedException’
*/