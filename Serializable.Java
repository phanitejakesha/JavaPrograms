package com.company;
import java.io.*;

import java.io.Serializable;

public class SerializableJava {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Name a = new Name(19,"Phani");
        Name b = new Name(19,"Teja");

        //Checked exception for files so handling it by try catch block
        FileOutputStream fos = new FileOutputStream("xyz.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);
        oos.writeObject(b);

        // De-serializing 'a'
        FileInputStream fis = new FileInputStream("xyz.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        //Each time an readObject method is called then each object is loaded
        Name c = (Name) ois.readObject();//down-casting object
        Name d = (Name) ois.readObject();//down-casting object
        //Name e = (Name) ois.readObject(); Error thrown when this line is added as there is no object to be read
        System.out.println(c.id+" "+c.name);
        System.out.println(d.id+" "+d.name);

        // closing streams
        oos.close();
        ois.close();
    }
}
/*
Notes:
1) Serializable interface is present in java.io package. It is used to make an object eligible for saving its state into a file
2) All subtypes of a serializable class are themselves serializable.
3) An ObjectOutputStream writes primitive data types and graphs of Java objects
    to an OutputStream. The objects can be read (reconstituted) using an ObjectInputStream. Persistent storage of objects can
    be accomplished by using a file for the stream.
*/


class Name implements Serializable{
    int id;
    String name;
    public Name(int id,String name){
        this.id = id;
        this.name = name;
    }
}