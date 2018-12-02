package com.company;
import java.util.*;

public class SingleResponsibilty {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("phani");
        al.add("teja");
        al.add("kesha");
        al.add("phani");
        StringConverter sc = new StringConverter(al);
        sc.createDictionary();
        writeIntoAFile wc = new writeIntoAFile(sc.sendDictionary());
        wc.printDict();
    }
}

//takes a list and converts them to hashMap
class StringConverter{
    ArrayList<String> a = new ArrayList<String>();
    StringConverter(ArrayList<String> a){
        this.a = a;
    }
    //Why value cant be primiyive type in hashmap
    HashMap<String,Integer> dictionary = new HashMap<>();
    public void createDictionary(){
        Iterator itr = a.iterator();
        while(itr.hasNext()){
            String subStr = (String) itr.next();
            if(dictionary.containsKey(subStr)){
                int val = dictionary.get(subStr)+1;
                dictionary.put(subStr,val);
            }
            else{
                dictionary.put(subStr,1);
            }
        }
    }
    public HashMap sendDictionary(){
        return dictionary;
    }
    //Once the list is converted int hashMap it needs to be stored in a text file
    //we cant write the code for storing the hashMap in file here, we need to create one more
    //class to do that work, each class must have only single responsibility because
    //if the output wants to be changed in the later changes we must not change this class
}

class writeIntoAFile{
    HashMap<String,Integer> dict= new HashMap<>();
    writeIntoAFile(HashMap<String,Integer> dict){
        this.dict = dict;

    }
    public void printDict(){
        System.out.println(dict);
    }
    //Create the method to convert the dictionary or load the dictionary in a file
    //Hence single responsiblity is achieved
}

/*
Notes:
1) Each class must have only one responsibility,
 */