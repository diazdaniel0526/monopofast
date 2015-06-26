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
public class IngredientOrder implements Serializable{
    
    //class instance variables
    private String order;
    private FoodItem foodItem;
    private Ingredients ingredient;

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    public Ingredients getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredients ingredient) {
        this.ingredient = ingredient;
    }
    

    public IngredientOrder() {
    }

    @Override
    public String toString() {
        return "IngredientOrder{" + "order=" + order + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.order);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final IngredientOrder other = (IngredientOrder) obj;
        if (!Objects.equals(this.order, other.order)) {
            return false;
        }
        return true;
    }
    
    
    
}
