//Mark Doctor, 10/2/16, iTechPM Section 4: Assignment 4a
//Purpose: Learn case structures
//Filename: bookBuyerRewards.java
//Documentation: Chapter 4 - p171 - #7 MDoctor.docx

import java.util.*;

public class bookBuyerRewards
{
   public static Scanner kb = new Scanner(System.in); 
   public static void main(String[] args)
   {
      //variable declarations
      int books, points;
      
      //get books from user)
      System.out.println("Please enter the number of books purchased this month: ");
      books = kb.nextInt();
      
      //get points with pointCalculator method
      points = pointCalculator(books);
      
      //Display points earned
      System.out.println("Congratulations! You've earned " + points + " points."); 
   }//end of main
   
   //Receives books purchased and returns points earned
   public static int pointCalculator(int books)
   {
      int points;
      //force books into points case
      if (books > 4)
      { 
         books = 4;
      }
      
      //Set points according to books purchased. To prevent incorrectly adding points, default is 0.
      //Since 4 or more books all return 60 points, the previous If statement forces 4+ books to 4
      //to fit case 4. 
      switch (books)
      {
         case 1:
            points = 5;
            break;
         case 2:
            points = 15;
            break;
         case 3:
            points = 30;
            break;
         case 4:
            points = 60;
            break;
         default:             
            points = 0;
            break;                        
      }
      return points;
   }
   
}//end of class

/*

 ----jGRASP exec: java bookBuyerRewards
Please enter the number of books purchased this month: 
8
Congratulations! You've earned 60 points.

 ----jGRASP: operation complete.
*/