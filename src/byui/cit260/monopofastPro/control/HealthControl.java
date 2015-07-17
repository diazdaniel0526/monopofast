/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.control;

import byui.cit260.monopofastPro.exceptions.ActionException;
import byui.cit260.monopofastPro.model.FoodItem;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Galicia
 */
public class HealthControl {
     
    public static FoodItem[] SortingHealthStrenght(FoodItem[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j].getHealthStrenght() < arr[index].getHealthStrenght())
                    index = j;
      
            FoodItem smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
   
//    public static void printHealth(FoodItem foodItemList[])
//             throws ActionException {
//         try (PrintWriter out = new PrintWriter("C:\\Users\\Galicia\\Desktop\\logfile.txt")) {
//            
//              FoodItem[] sortedFoodItems = HealthControl.SortingHealthStrenght(footItemList);
//            out.println("\nList of Foot Items");
//            out.println("Health");
//         
//         // for each inventory item
//         for (FoodItem foodItem : sortedFoodItems) {
//             // DISPLAY the description, the required amount 
//             out.println(foodItem.getTypeOfFood() + "\t   "
//                              + foodItem.getHealthStrenght());
//         }
//                 
//             
//             System.out.println("Health printed");
//         } catch (IOException e) {
//             throw new ActionException(e.getMessage());
//         }
//     }
    
  }


