package com.ps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

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


//        try {
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true));
//
//            bufferedWriter.write("Hello\n");
//            bufferedWriter.write("World");
//
//            bufferedWriter.close();
//
//        } catch (Exception e){
//            e.printStackTrace();
//        }

//        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yy");
        LocalDate yesterday = LocalDate.parse("10-08-24", format);

        System.out.println(yesterday.getDayOfWeek());

//        System.out.println(today.toEpochSecond(ZoneOffset.UTC));

//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E, MMM dd, yyyy");
//
//        System.out.println(today.format(dtf));
    }
}