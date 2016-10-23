//Mark Doctor, 10/5/16, iTechPM Section 5: Assignment 5b
//Purpose: Learn FOR method
//Filename: temperatureTable.java
//Documentation: Chapter 5 - p230 - #8 MDoctor.docx

import java.util.*;

public class temperatureTable
{
   public static void main(String[] args)
   {
      //variable declaration
      Scanner kb = new Scanner(System.in);
      int maxTemp; 
      double fTemp;
      
      //get max temperature
      System.out.println("Please enter the maximum temperature: ");
      maxTemp = kb.nextInt();
      
      //Table setup
      System.out.println("Celsius/Fahrenheit Conversion Table");
      System.out.println("-----------------------------------");
      System.out.println("Celsius\t\tFahrenheit");
      for(int counter = 0; counter <= maxTemp; counter++)
      {
         fTemp = (9 * (double)counter) /5 + 32;
         System.out.println(counter + "\t\t\t\t" + Math.round(fTemp));
      }
   
   }//end of main
}//end of class
/*
 Please enter the maximum temperature: 
 20
 Celsius/Fahrenheit Conversion Table
 -----------------------------------
 Celsius		Fahrenheit
 0				32
 1				34
 2				36
 3				37
 4				39
 5				41
 6				43
 7				45
 8				46
 9				48
 10				50
 11				52
 12				54
 13				55
 14				57
 15				59
 16				61
 17				63
 18				64
 19				66
 20				68
 
  ----jGRASP: operation complete.
 
*/