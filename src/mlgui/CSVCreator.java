package mlgui;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class CSVCreator {

     
    //Delimiter used in CSV file

    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
     
    //CSV file header
    private static final String FILE_HEADER = "LANGUAGE (COMMUNICATION IN ENGLISH),ENGINEERING CHEMISTRY I,ENGINEERING PHYSICS I,ENGINEERING MATHEMATICS  I,ENGINEERING MECHANICS I,BASIC ELECTRICAL ENGINEERING,ENGINEERING CHEMISTRY LAB,ENGINEERING PHYSICS LAB,ELECTRICAL LAB,ENGINEERING GRAPHICS I,WORKSHOP PRACTICE I,GENERAL PROFICIENCY,ENGINEERING MATHEMATICS  II,ENGINEERING PHYSICS II,ENGINEERING CHEMISTRY II,DISASTER MANAGEMENT,BASIC ELECTRONICS,ENGINEERING MECHANICS II,INTRODUCTION TO PROGRAMMING,BASIC ELECTRONICS LAB,COMPUTER PROGRAMMING LAB,ENGINEERING GRAPHICS II,WORKSHOP PRACTICE II,MATHEMATICS - III,ENGINEERING ECONOMICS AND COSTING,DIGITAL CIRCUITS AND LOGIC DESIGN,DISCRETE MATHEMATICAL STRUCTURES,DATA STRUCTURES AND PROGRAMMING METHODOLOGY,DIGITAL CIRCUITS AND LOGIC DESIGN LAB,DATA STRUCTURES LAB,Mathematics - IV,Design & Analysis of Algorithm,Computer Organization,Formal Language & Automata Theory,Object Oriented Programming,Algorithm Laboratory,Object Oriented Programming Laboratory,MICROPROCESSOR & APPLICATIONS,OPERATING SYSTEM,DATA COMMUNICATION,SOFTWARE ENGINEERING,GRAPH THEORY AND COMBINATORIES,MICROPROCESSOR LABORATORY,OPERATING SYSTEM LABORATORY,SOFTWARE ENGINEERING LABORATORY,DATABASE MANAGEMENT SYSTEM,COMPILER DESIGN,COMPUTER NETWORKS,ARTIFICIAL INTELLIGENCE,DATABASE MANAGEMENT SYSTEM LAB,COMPILER DESIGN LAB,COMPUTER NETWORKS LAB,CRYPTOGRAPHY AND NETWORK SECURITY,STATE,CATEGORY,SSC,HSC";

 

    public static void writeCsvFile(String fileName) {
         


         

        FileWriter fileWriter = null;

                 

        try {

            fileWriter = new FileWriter(fileName);

 

            //Write the CSV file header

            fileWriter.append(FILE_HEADER.toString());

             

            //Add a new line separator after the header

            fileWriter.append(NEW_LINE_SEPARATOR);

             

            //Write a new student object list to the CSV file
            String students[] = {"A","A","A","A"};
            for (String student : students) {

                fileWriter.append(student);

                fileWriter.append(COMMA_DELIMITER);
            }

 

             

             

            System.out.println("CSV file was created successfully !!!");

             

        } catch (Exception e) {

            System.out.println("Error in CsvFileWriter !!!");

            e.printStackTrace();

        } finally {

             

            try {

                fileWriter.flush();

                fileWriter.close();

            } catch (IOException e) {

                System.out.println("Error while flushing/closing fileWriter !!!");

                e.printStackTrace();

            }

             

        }

    }
    
    public static void main(String args[])
    {
        writeCsvFile("student.csv");
    }

}