//Mark Doctor, ITECH PM, 10/14/16 OOP Lesson
//Purpose: Learning about object-oriented programming
//Filename: Car.java

import java.util.*;

public class Car
{   
 //instance variables
   private String color; 
   private String model;
   private double speed;  
 //Constructor
   public Car(String cColor, String cModel, double cSpeed)
   {
      color = cColor;
      model = cModel;
      speed = cSpeed;
   }//end of constructor
   
 //behaviors - methods of this class
   public void setColor(String color)
   {this.color = color;}  //mutator method
   //end of setColor  
   
   public String getModel()
   {
      return model;  //accessor method
   }//end of getModel
   
   public void changeSpeed(double speed)
   {
      this.speed = speed;
   }//end of changeSpeed
   
   public String toString()
   {
      String result = "This car is a " + color + " " + 
         model + " car \n travelling at a speed of " + 
         speed;
      return result;
   }//end of toString
   
}//end of class
