//Mark Doctor, 10/13/16, iTechPM Section 6: Assignment 6a
//Purpose: Functions
//Filename: testScore.java
//Documentation: In Class Chapter 6 - P271 - #7 MDoctor.docx
import java.util.*;
public class testScore
{
   final static int SIZE = 5; //constant controls array size
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      String score;
      int count = 0;
      int[] testScore = new int[SIZE];
      //while loop to gather test score input
      while(count < SIZE)
      {
         System.out.print("Enter test score " + (count + 1) +
            ": ");
            score = kb.nextLine();
            //Input validation
            if(isValid(score))
            {
               //Add score to testSCore and increment
               testScore[count] = Integer.parseInt(score);
               count++;
            }
      }//end of while loop
      
      //Call report module to display scores, grades (through determineGrade method)
      //and average score
      report(testScore);
      
   }//end of main
   
   //isValid method returns true if score is a valid test score.
   //allows while loop to increment
   public static boolean isValid(String score)
   {
      boolean isValid = false;
      try
      {
         if (Integer.parseInt(score) >= 0 && Integer.parseInt(score) <= 100)
         {
            isValid = true;
         }//end of if statement
      }//end of try
      catch(NumberFormatException e)
      {
      }//end of catch
         if (!isValid)
            System.out.println("Please enter a valid test score");
      return isValid;
   }//end of isValid function
   
   //report module displays s989
   cores, grades through determineGrade method,
   //and average score
   public static void report(int[] testScore)
   {
      char grade;
      int total = 0;
      for(int count = 0; count < SIZE; count++)
      {
         grade = determineGrade(testScore[count]);
         System.out.println("Score " + (count + 1) + ": " +
            testScore[count] + " --> " + grade);
         total += testScore[count];

      }//end of for loop
      System.out.println("Average score: " + (total / SIZE));
   }//end of report module
   
   //determineGrade function calculates the grade from the testScore using
   //a case structure
   public static char determineGrade(int score)
   {
      char grade = ' ';
      switch(score / 10)
      {
         case 10: ;
         case 9: grade = 'A'; break;
         case 8: grade = 'B'; break;
         case 7: grade = 'C'; break;
         case 6: grade = 'D'; break;
         default: grade = 'F'; break;
      }//end of case structure
      return grade;
   }//end of determineGrade function
}//end of class
/*
  ----jGRASP exec: java testScore
 Enter test score 1: hundred
 Please enter a valid test score
 Enter test score 1: 100
 Enter test score 2: -50
 Please enter a valid test score
 Enter test score 2: 80
 Enter test score 3: 60
 Enter test score 4: 30
 Enter test score 5: 89
 Score 1: 100 --> A
 Score 2: 80 --> B
 Score 3: 60 --> D
 Score 4: 30 --> F
 Score 5: 89 --> B
 Average score: 71
 
  ----jGRASP: operation complete
*/
