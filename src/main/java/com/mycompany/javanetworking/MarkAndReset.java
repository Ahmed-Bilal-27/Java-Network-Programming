package com.mycompany.javanetworking;
import java.io.*;
public class MarkAndReset {
	public static void main(String[] args) throws IOException
    {
  
        // Create input stream 'demo.txt'
        // Convert inputStream to
        // bufferedInputStream
        BufferedInputStream buffInputStr
            = new BufferedInputStream(new FileInputStream(
                    "D:\\Bilal\\Documents\\Scholarships\\Mitacs Globalink Research Internships\\Projects List.txt"));
  
        // Read and print characters one by one
        System.out.println(
            "Char : "
            + (char)buffInputStr.read());
        System.out.println(
            "Char : "
            + (char)buffInputStr.read());
        System.out.println(
            "Char : "
            + (char)buffInputStr.read());
  
        // Mark is set on the input stream
        buffInputStr.mark(0);
  
        System.out.println(
            "Char : "
            + (char)buffInputStr.read());
  
        // Reset() is invoked
        buffInputStr.reset();
  
        // Read and print characters
        System.out.println(
            "Char : "
            + (char)buffInputStr.read());
        System.out.println(
            "Char : "
            + (char)buffInputStr.read());
        buffInputStr.close();
    }
}