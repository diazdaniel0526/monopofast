/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopofastpro;

import byui.cit260.monopofastPro.model.Game;
import byui.cit260.monopofastPro.model.Player;
import byui.cit260.monopofastPro.view.StartProgramView;

/**
 *
 * @author Galicia
 */
public class Monopofastpro {
    
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Monopofastpro.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Monopofastpro.player = player;
    }
    
    
    
    public static void main(String[] args) { 
        //create start programViewand start the program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
    }
    
}
