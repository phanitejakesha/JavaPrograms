package com.phani.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class learningFile{
    public static void main(String[] args) throws IOException {
        System.out.println("Writing into a file named as newFile.txt");
        String st = "I am learning files in java";
        //IO exception needs to be handled by try catch or returning exceptions
        FileWriter f = new FileWriter("newFile.txt");
        for(int i =0;i<st.length();i++){
            f.write(st.charAt(i));
        }
        f.close();

        System.out.println("Open the file and print ");

        int ch;

        FileReader f1 = new FileReader("newFile.txt");

        while((ch=f1.read())!=-1){
            System.out.print((char)ch);
        }

        f1.close();
    }
}


