package com.ps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {

//        // Steps to import from a file:
//
//            // Create file to import
//                // Done!
//        try{
//            // Create instance of BufferedReader(With instance of FileReader)
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("students.txt"));
//
//            // Create variable to store the first line
//            String header = bufferedReader.readLine();
//            System.out.println(header);
//
//            String input;
//
//            // Loop through each line until we reach the end of the file (While)
//            while((input = bufferedReader.readLine()) != null){
//                // do stuff
//                System.out.println(input);
//            }
//            // Close the BufferedReader instance
//            bufferedReader.close();
//
//        } catch(Exception e){
//            e.printStackTrace();
//        }


        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true));

            bufferedWriter.write("Hello\n");
            bufferedWriter.write("World");

            bufferedWriter.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}