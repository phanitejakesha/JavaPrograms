package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class learningComparator {
    public static void main(String[] args) {
        System.out.println("Learning Comparator");
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("phani",3));
        s.add(new Student("teja",2));
        s.add(new Student("kesha",1));
        System.out.println("No order");
        for(int i =0;i<s.size();i++){
            System.out.println(s.get(i).printStudent());
        }
        Collections.sort(s,new sortByName());
        System.out.println("Order by name");
        for(int i =0;i<s.size();i++){
            System.out.println(s.get(i).printStudent());
        }
        System.out.println("order by roll");
        Collections.sort(s,new sortByRoll());
        for(int i =0;i<s.size();i++){
            System.out.println(s.get(i).printStudent());
        }
    }

}

class Student{
    String name;
    Integer rollNo;

    Student(String name, Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String printStudent(){
        return name+rollNo;
    }
}

class sortByRoll implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollNo-o2.rollNo;
    }
}

class sortByName implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
