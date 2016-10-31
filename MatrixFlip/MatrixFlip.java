//MatrixFlip.java
//Mark Doctor
//Iterates through a 2D array and flips rows and columns to TRUE
//if the row/column contains a true value. Outputs as 0 or 1

import java.util.Scanner;

public class MatrixFlip
{
   public static void main(String[] args)
   {  
      //declaration/initialization
      Scanner input = new Scanner(System.in);
      boolean[][] arr = {
       {true, false, false, true},
       {false, false, true, false},
       {false, false, false, false}};
      boolean[][] arr2 = flip(arr);
      
      //Processes
      output(arr); //Displays array
      System.out.println("-------");
      output(arr2);
      //flip(arr);   //calls output() with a new array with flipped values 
        
   }//end main
   
   // Creates new array with Arguments same size. Iterates through passed
   // array and flips new array's row/column values to true when a row/column
   // contains a true value
   private static boolean[][] flip(boolean[][] arr)
   {
      boolean[][] tempArr = new boolean[arr.length][arr[1].length];
      for (int row = 0; row < arr.length; row++)
      {
         for (int column = 0; column < arr[1].length; column++)
         {
            if (arr[row][column])//check value to see if it needs to be flipped
            {
               for (int flipRow = 0, flipCol = column; flipRow < arr.length; flipRow++)//flips across rows
               {
                  tempArr[flipRow][flipCol] = true;
               }//end flipRow loop
               for (int flipRow = row, flipCol = 0; flipCol < arr[1].length; flipCol++)//flips across columns
               {
                  tempArr[flipRow][flipCol] = true;
               }//end flipRow loop
            }//end if block
         }//end column loop
      }//end row loop
      return tempArr;
   }//end flip method
   
   //Displays boolean array values as 0 or 1   
   private static void output(boolean[][] arr)
   {
      for (int row = 0, value; row < arr.length; row++)
      { 
         for (int column = 0; column < arr[1].length; column++)
         {
            value = arr[row][column] ? 1 : 0;//Tests arr[][] and sets value to true: 1 or false: 0          
            System.out.print(value + " ");
         }//end column loop
         System.out.println();
      }//end row loop
   }//end output method
}//end class