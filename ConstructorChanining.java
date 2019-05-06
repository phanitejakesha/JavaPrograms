package com.phani.concepts;

public class ConstructorChaining {
    public static void main(String[] args) {
        Chaining obj1 = new Chaining();
        Chaining obj2 = new Chaining("Phani");
        Chaining obj3 = new Chaining("Phani",100);
    }
}

class Chaining{
    Chaining(){
        this("NoName");
    }
    Chaining(String s){
        this(s,-1);
    }
    Chaining(String s, int b){
        System.out.println(s);
        System.out.println(b);
    }
}
