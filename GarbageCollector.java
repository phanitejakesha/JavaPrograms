package com.company;

public class GarbageCollector {
    public static void main(String[] args) {
        GarbageCollector obj1 = new GarbageCollector();
        obj1 = null;
        System.gc();
        GarbageCollector obj2 = new GarbageCollector();
        obj2 = null;
        Runtime.getRuntime().gc();
    }

    protected void finalize(){
        System.out.println("Garbage collected");
    }
}
