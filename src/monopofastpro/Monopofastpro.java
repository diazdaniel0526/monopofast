/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopofastpro;

import byui.cit260.monopofastPro.model.Location;

import byui.cit260.monopofastPro.model.CharacterOfGame;
import byui.cit260.monopofastPro.model.IngredientOrder;

import byui.cit260.monopofastPro.model.Player;
import byui.cit260.monopofastPro.model.Restaurant;
import byui.cit260.monopofastPro.model.Ingredients;
import byui.cit260.monopofastPro.model.Workstation;



/**
 *
 * @author Galicia
 */
public class Monopofastpro {
    private static Object drink;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setNameOfPlayer("Fred Flinstone");
        playerOne.setFastestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
 
        
        
        Location LocationCoordinates = new Location ();
        LocationCoordinates.setCoordinates("coordinates of location");
        String locationCoordinatesInfo = LocationCoordinates.toString();
        System.out.println(locationCoordinatesInfo);



        
        IngredientOrder order = new IngredientOrder(); 
        
        order.setOrder("order of ingredients");
        
        String ingredientInfo = order.toString();
        System.out.println(ingredientInfo);

        
        Restaurant restOne = new Restaurant();
        
        restOne.setName("Ardys");
        restOne.setDescription("First World");
        
        String restInfo = restOne.toString();
        System.out.println(restInfo);
        
        
        CharacterOfGame charOne = new CharacterOfGame();
        
        charOne.setName("Paul");
        charOne.setFastestTime(6.00);
        charOne.setDescription("the greatest");
        
        String charInfo = charOne.toString();
        System.out.println(charInfo);
        
    
        
        WorstationOfGame worksOne = new WorstationOfGame();
    worksOne.setName("First World");
    worksOne.setType("smoothie");
    worksOne.setDescription("beginner");
    worksOne.setRequiredTime("6 minutes");
    worksOne.setActualTime("5 minutes");
    String worksInfo = worksOne.toString();
    System.out.println(worksInfo);
    
    
    
   IngredientsNeeded ingredientsNeeded = new IngredientsNeeded();
   ingredientsNeeded.setName("Work station one");
   ingredientsNeeded.setType("ingredients for burger");
   ingredientsNeeded.setDescription("ingredients for buns");
   String ingredientsInfo = ingredientsNeeded.toString();
   System.out.println(ingredientsInfo);
   
        

    }
    
}
