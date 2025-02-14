package com.exceptions.checked_exception;

import java.io.FileReader;
import java.io.IOException;


public class CompileTimeException {
   public static void main(String[] args)  {

       // FileReader read the file data if file is present in system
       try(FileReader readfile = new FileReader("Data.txt")){
           int ch;
           // Display file data in output
           while((ch = readfile.read()) != -1){
               System.out.print((char)ch);
           }
           // if file is not present in system display the error
       } catch (IOException e) {
           System.out.println(e.getMessage());
       }

   }
}
