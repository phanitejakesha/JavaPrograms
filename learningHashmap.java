package com.company;
import java.util.*;

public class LearningHashMap {
    public static void main(String[] args) {
        //Creating a map
        Map < String, Integer> employeeMap = new HashMap<>();
        //Adding elements into a hashmap
        employeeMap.put("Phani",1);
        employeeMap.put("Teja",2);
        employeeMap.put("Kesha",3);
        //Print the whole map using different methods
        System.out.println("Hashmap printing by for each ");
        employeeMap.forEach((key,value) ->{
            System.out.println(key + ""+ value);
        });
        System.out.println("printing hashmap by using iterator and entry set");
        Set<Map.Entry<String,Integer>> employeeEntries = employeeMap.entrySet();
        Iterator<Map.Entry<String,Integer>> empIterator = employeeEntries.iterator();
        while(empIterator.hasNext()){
            Map.Entry<String,Integer> entry = empIterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("iterating by entryset ");
        employeeEntries.forEach(entry->{
            System.out.println(entry.getKey()+" "+ entry.getValue());
        });

        //If a key is not present then add a key
        employeeMap.putIfAbsent("UMBC",4);

        employeeMap.forEach((k1,k2)->{
            System.out.println(k1+k2);
        });

        //Check if a key is presnt in the map
        if(employeeMap.containsKey("Phani")){
            System.out.println("Found");
        }else{
            System.out.println("not found");
        }

        if(employeeMap.containsKey("phani")){
            System.out.println("Found");
        }else{
            System.out.println("not found");
        }

        //Print the value of the key
        System.out.println(employeeMap.get("Phani"));

        //Print if map is empty
        System.out.println(employeeMap.isEmpty());
        //Print length of map
        System.out.println(employeeMap.size());

        Set<Map.Entry<String,Integer>> se = employeeMap.entrySet();
        for(Map.Entry<String, Integer> e:se){
            System.out.println(e.getKey()+e.getValue());
        }
    }
}

/*
1) A hashmap can contain one null key and null values
2) It has no duplicates
3) It is a unordered collection and has no specific order of the elements
4) It is not thread safe, you need to explicity synchronize it to make it thread safe
*/
