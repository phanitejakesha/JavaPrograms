package com.phani.file;

import java.io.*;

public class FileReadWrite {
    public static void main(String[] args){

        FileWriter fileWriter = null;
        FileReader outputReader = null;

        File inputFile ;
        File outputFile ;

        try {
            fileWriter = new FileWriter("inp.txt");
            fileWriter.write("Phani\n");
            fileWriter.write("Nikhil\n");
            fileWriter.write("Bhantu\n");
            fileWriter.close();
            inputFile = new File("inp.txt");
            outputFile = readFile(inputFile);

            outputReader = new FileReader(outputFile);
            BufferedReader outputBufferedReader = new BufferedReader(outputReader);
            String readLine = outputBufferedReader.readLine();

            while(readLine != null){
                System.out.println(readLine);
                readLine = outputBufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if (fileWriter != null) {
                    fileWriter.close();
                }
                if (outputReader != null) {
                    outputReader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    private static File readFile(File inputFile) throws IOException {
        if(inputFile == null){
            throw new IllegalArgumentException("File name is null");
        }

        //
        FileReader fileReader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String readLine = bufferedReader.readLine();

        //
        File outputFile = new File("outputFile.txt");
        FileWriter fileWriter  = new FileWriter(outputFile);

        while(readLine != null){
            fileWriter.write(readLine);
            fileWriter.write("\n");
            readLine = bufferedReader.readLine();
        }

        fileReader.close();
        fileWriter.close();

        return outputFile;
    }
}
