//Mark Doctor, ITECH PM, 10/14/16
//Learning about an array of objects
//filename: Garage.java

import java.util.*;

public class Garage
{
   public static void main(String[] args)
   {
      Car myCar;//declares reference variable myCar as a Car
      myCar= new Car("black", "Mustang", 0.0);
      Car yourCar = new Car("red", "Prius", 50.0);
      
      System.out.println(myCar);
      System.out.println(yourCar);
      myCar.setColor("red");
      System.out.println("My car is a " + myCar.getModel());
      myCar.changeSpeed(70.0);
      System.out.println(myCar);
      
      Car[] jaysGarage = new Car[10];//creates array of cars
      jaysGarage[0] = myCar;
      jaysGarage[1] = yourCar;
      jaysGarage[2] = new Car("blue", "Thunderbird", 25.0);
      System.out.println("\nCars in Jay's Garage");
      for(int i = 0; i < jaysGarage.length; i++)
      {
         if(jaysGarage[i] != null)
         System.out.println(jaysGarage[i]);
      }
      jaysGarage[2].changeSpeed(60);
      System.out.println(jaysGarage[2]);
      yourCar = jaysGarage[2];
      System.out.println("\nCars in Jay's Garage");
      for(int i = 0; i < jaysGarage.length; i++)
      {
         if(jaysGarage[i] != null)
         System.out.println(jaysGarage[i]);
      }
      
   }//end of main
   
   
}//end of class