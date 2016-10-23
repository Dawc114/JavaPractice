//Mark Doctor, 10/2/16, iTechPM Section 4: Assignment 4b 
 //Purpose: Learn decision structures 
 //Filename: softwareSales.java
 //Documentation: Chapter 4 - P171 - #7 MDoctor.docx
 
 import java.util.*;
 import java.text.*;
 
 public class softwareSales
 {
   public static Scanner kb = new Scanner(System.in);
   
   public static void main(String[] args)
   {
      //variable declaration
      int quantity;
      double discount;
      
      //get quantity from user
      System.out.println("Please enter the number of packages purchased: ");
      quantity = kb.nextInt();
      
      //get discount
      if(quantity < 10)
         discount = 0; 
      else if (quantity < 20)
         discount = 0.02;
      else if (quantity < 50)
         discount = 0.03;
      else if (quantity < 100)
         discount = 0.04;
      else
         discount = 0.05;
      
      //call receipt with the quantity and discount
      receipt(quantity, discount);
         
   }//end of main
   
   public static void receipt(int quantity, double discount)
   {
      //variable declaration
      double total, discountTotal;
      DecimalFormat df = new DecimalFormat("#.00");
      //Calculate total and discountTotal
      total = quantity * 99;
      discountTotal = total * discount;
      total = total - discountTotal;
      
      //Display total and discountTotal
      System.out.println("Discount total: $" + df.format(discountTotal));
      System.out.println("total: $" + df.format(total));
   
   }//end of receipt
   
 }//end of class

/*
  ----jGRASP exec: java softwareSales
 Please enter the number of packages purchased: 
 50
 Discount total: $198.00
 total: $4752.00
 
  ----jGRASP: operation complete.
*/