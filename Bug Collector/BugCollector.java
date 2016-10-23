//Mark Doctor, 10/3/16, iTechPM Section 5: Assignment 5a
//Completed in class 
//Purpose: Learn Repetition structures 
//Filename: BugCollector.java
//Documentation: In Class Chapter 5 - P229 - #1 MDoctor.docx

import java.util.*;
import java.text.*;

public class BugCollector
{
   public static void main(String[] args)
   {
      //Variable declaration
      int day = 1;
      int totalBugs = 0;
      int numBugs;
      double avgBugs;
      Scanner kb = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#.00");
      
      //While loop to get bugs collected each day
      while (day <= 7)
      {
         System.out.println("Please enter the number of bugs collected for day " + day);
         numBugs = kb.nextInt();
         totalBugs += numBugs;
         day++;
      }
      
      //Calculate average bugs and display totals
      avgBugs = (double)totalBugs / 7;
      System.out.println("The total bugs collected over 7 days is: " + totalBugs);
      System.out.println("the average bugs collected each day is: " + df.format(avgBugs));
      
   }//end of main
}//end of class

/*
  ----jGRASP exec: java BugCollector
 Please enter the number of bugs collected for day 1
 5
 Please enter the number of bugs collected for day 2
 5
 Please enter the number of bugs collected for day 3
 5
 Please enter the number of bugs collected for day 4
 5
 Please enter the number of bugs collected for day 5
 5
 Please enter the number of bugs collected for day 6
 5
 Please enter the number of bugs collected for day 7
 5
 The total bugs collected over 7 days is: 35
 the average bugs collected each day is: 5.00
 
  ----jGRASP: operation complete.
 
*/