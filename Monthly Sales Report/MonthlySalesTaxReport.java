//Mark Doctor, 9/30/16, iTechPM Section 3: Assignment 3 
//Purpose: Learn modular programming
//Filename: monthlySalesTaxReport.java
//Documentation: Chapter 3 - P123 - #10 MDoctor.docx
//Assumption: total sales is considered as the total amount of money received (purchase price and taxes combined)

import java.util.*;
import java.text.*;

public class MonthlySalesTaxReport
{
   public static final double COUNTY_TAX_RATE = 0.02;
   public static final double STATE_TAX_RATE = 0.04;
   
   public static void main(String[] args)
   {
      //Variable declaration
      Scanner kb = new Scanner(System.in);
      double totalSales, countyTax, stateTax;
      
      //Request monthly sales amount
      System.out.println("Please enter the total sales for the month: ");
      totalSales = kb.nextDouble();
      
      //Calculate taxes via taxCalculator method
      countyTax = taxCalculator(totalSales, COUNTY_TAX_RATE);
      stateTax = taxCalculator(totalSales, STATE_TAX_RATE);
      reportBuilder(totalSales, countyTax, stateTax);
   } //end of main
   
   //Calculates the tax amount from the total sales (total sales is purchase price plus tax)
   public static double taxCalculator(double totalSales,double taxRate)
   {
      double tax = totalSales - totalSales/ (1 + taxRate);
      return tax;
   } // end of taxCalculator
   
   //Creates a report/receipt of all information needed for the monthly sales tax report
   public static void reportBuilder(double totalSales, double countyTax, double stateTax)
   {
      DecimalFormat df = new DecimalFormat("#.00");
      double totalTax = countyTax + stateTax;
      System.out.println("--MONTHLY SALES TAX REPORT--");
      System.out.println("Total sales: $" + df.format(totalSales));
      System.out.println("County sales tax: $" + df.format(countyTax));
      System.out.println("State sales tax: $" + df.format(stateTax));
      System.out.println("Total sales tax: $" + df.format(totalTax));
   } //end of reportBuilder
} //end of class: MonthlySalesTaxReport


/*
 ----jGRASP exec: java MonthlySalesTaxReport
Please enter the total sales for the month: 
1000
--MONTHLY SALES TAX REPORT--
Total sales: $1000.00
County sales tax: $19.61
State sales tax: $38.46
Total sales tax: $58.07

 ----jGRASP: operation complete.
*/