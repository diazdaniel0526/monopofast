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
    
  	bottomBun("bun.", "Bread"),
        burger("burger.", "Meat"),
        cheese("chesse.", "Dairy"),
        bacon("bacon.", "Meat"),
        lettuce("lettuce.", "Veggies"),
        tomato("tomato.", "Veggies"),
        mayo("mayo.", "Dressing"),
        topBun("bun.", "bread");

    
    private final String typeOfFood;
    private final String description; 
    private IngredientOrder[] ingredientOrders;

           
    FoodItem(String description, String typeOfFood) {
        this.description = description;
        this.typeOfFood = typeOfFood;
     }
    
    
    public String getTypeOfFood() {
        return typeOfFood;
    }

  
    public String getDescription() {
        return description;
    }    
    
}
