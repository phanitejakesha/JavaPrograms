package com.company;
import java.util.*;

public class listTypes {
    public static void main(String[] args) {
        //creating a new Arraylist variable and adding elements
        ArrayList<String> list=new ArrayList<String>();     //Creating arraylist
        list.add("Phani");
        list.add("Teja");
        list.add("Kesha");



        //Iterator is the root class for all the collections and it acts as a iterator for all objects
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //For each object, iterating method for a list
        for(String obj:list)
            System.out.println(obj);

        list.remove("Kesha");   //it's not throwing an error even if the word is not existing in the list
        //removeall is used to remove all the elements in a list
        //For loop to iterate each element in a list
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    
}


//Notes for the arrayList
/*
1) public class ArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable
        where E is a generic type in JAVA
2) All the collections have the parent class as Iterable which has only one abstract method, Iterator which needs
    to be implemented by all the classes which extend the collections class
3)  The iterator is implemented by two pointers cursor and nextelement, one pointing the current element and
    other pointing the next element
 */