/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ellisoverson
 */
public enum FoodItem implements Serializable {
    //class instance variables
    
  	bottomBun("bun.", "17"),
        burger("burger.", "89"),
        cheese("chesse.", "76"),
        bacon("bacon.", "56"),
        lettuce("lettuce.", "45"),
        tomato("tomato.", "90"),
        mayo("mayo.", "43"),
        topBun("bun.", "112");

    
    private final String typeOfFood;
    private final String healthStrenght; 
    private IngredientOrder[] ingredientOrders;

           
    FoodItem(String healthStrenght, String typeOfFood) {
        this.healthStrenght = healthStrenght;
        this.typeOfFood = typeOfFood;
     }
    
    
    public String getTypeOfFood() {
        return typeOfFood;
    }

  
    public String getHealthStrenght() {
        return healthStrenght;
    }    
    
}
