package com.simplilearn.filehandling;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriteDemo {
 public static void main(String[] args) {
 String data = "vikas jha project";
 try {
 FileWriter output = new FileWriter("data1.txt");
 output.write(data);
 System.out.println("Data is written successfully......");
 output.close();
 } catch (IOException e) {
 System.out.println("File write error.....");
 }
 }
}
