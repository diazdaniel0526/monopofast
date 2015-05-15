/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopofastpro;


import byui.cit260.monopofastPro.model.Game;

import byui.cit260.monopofastPro.model.Player;
import byui.cit260.monopofastPro.model.Restaurant;

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

        
        
        
        
        Game gameOne = new Game();
        
        gameOne.setDescriptionOfGame("First game");
        gameOne.setTotalScore(10);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        

        
        Restaurant restOne = new Restaurant();
        
        restOne.setName("Ardys");
        restOne.setDescription("First World");
        
        String restInfo = restOne.toString();
        System.out.println(restInfo);
        
        
        
        
    }
    
}
