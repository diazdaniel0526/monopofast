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
public enum FoodItem implements Serializable{
    //class instance variables
    
    
    
    private final String typeOfFood;
    private final String description; 

    

        
    FoodItem(String description) {
        this.description = description;
        
    }
    
    
    public String getTypeOfFood() {
        return typeOfFood;
    }

   

    public String getDescription() {
        return description;
    }

    
    
    
    
}
