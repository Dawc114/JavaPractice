/*
Program:	Program 2b: Ch2-P79-#4
Author:	Mark Doctor
Course:	iTechPM
This program will accept 3 item prices and calculate, then display the 
subtotal, sales tax, and total amounts
*/

import java.util.Scanner;

public class program2b
{
   public static void main(String[] args)
   {
      // Declare/initialize variables
      Scanner keyboard = new Scanner(System.in);
      double item1, item2, item3, subtotal, salesTax, total;

      // Prompt and collect input
      System.out.println("Please enter the price of the first item: ");
      item1 = keyboard.nextDouble();
      System.out.println("Please enter the price of the second item: ");
      item2 = keyboard.nextDouble();
      System.out.println("Please enter the price of the third item: ");
      item3 = keyboard.nextDouble();
      
      // Perform calculations
      subtotal = item1 + item2 + item3;
      salesTax = subtotal * 0.06;
      total = subtotal + salesTax;
      
      // Display output
      System.out.println("The subtotal is $" + subtotal + " and the sales tax is $" + salesTax);
      System.out.println("the total is $" + total);
   }
}