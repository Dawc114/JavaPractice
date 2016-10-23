//Mark Doctor, 9/28/16, iTechPM - 2nd class meeting
//Purpose: Learn modular programming
//Filename: PaintJob.java
//Documentation: Chapter 3 - P123 - #9 MDoctor.docx

import java.util.*;
import java.text.DecimalFormat;
public class PaintJob
{
   //Global Constants
   public static final double FT_GAL = 115.0;
   public static final double HRS_PAINT = 8.0;
   public static final double RATE_HR = 20.00;
   public static DecimalFormat df = new DecimalFormat("#.00");
   
   public static void main(String[] args)
   {
      //Variable Declarations
      Scanner keyboard = new Scanner(System.in);
      double area, price, numGallons, paintCost, laborCost, total;
      
      //Prompt and collect area and price and calculate numGallons
      System.out.println("Please enter the area in square feet to be painted: ");
      area = keyboard.nextDouble();
      System.out.println("Please enter the price per gallon of paint: ");
      price = keyboard.nextDouble();
      numGallons = area /115;
      
      //Calculate paintCost and laborCost by calling paint() and labor()
      paintCost = paint(numGallons, price);
      laborCost = labor(numGallons);
      
      //Calculate and display total
      total = paintCost + laborCost;
      System.out.println("The total cost of this paint project is: $" + df.format(total));
      
   }//end of main
   
   
   //Calculates paintCost and prompts user on numgallons and paintCost
   public static double paint(double numGallons,double price) 
   {
      double paintCost = numGallons * price;
      System.out.println("The number of gallons required is: " + df.format(numGallons));
      System.out.println("The cost of the paint is: $" + df.format(paintCost));
      return paintCost;
   }//end of paint
   
   //Calculates hours and laborCost and prompts user on required hours and laborCost
   public static double labor(double numGallons)
   {
      double hours = numGallons * HRS_PAINT;
      double laborCost = hours * RATE_HR;
      System.out.println("The number of hours required is: " + df.format(hours));
      System.out.println("The labor cost is $" + df.format(laborCost));
      return laborCost;
   }//end of labor   
}//end of class