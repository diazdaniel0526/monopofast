/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopofastpro;

import byui.cit260.monopofastPro.model.FoodItem;
import byui.cit260.monopofastPro.model.Player;

/**
 *
 * @author Galicia
 */
public class Monopofastpro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setNameOfPlayer("Fred Flinstone");
        playerOne.setFastestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    
        FoodItem drink = new FoodItem();
        
        drink.setName("water");
        drink.setTypeOfFood("beverage");
        drink.setDescription("Something to drink");
        
        String drinkInfo = drink.toString();
        System.out.println(drinkInfo);
    }
    
}
