/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.control;

import byui.cit260.monopofastPro.exceptions.GameControlException;
import byui.cit260.monopofastPro.model.Game;
import byui.cit260.monopofastPro.model.Map;
import byui.cit260.monopofastPro.model.Player;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import monopofastpro.Monopofastpro;

/**
 *
 * @author Galicia
 */
public class GameControl {

    public static void createNewGame(Player player) {
         
        Game game = new Game();
        Monopofastpro.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        
            
    }

    public static void saveGame(Game currentGame, String filePath)
    throws GameControlException {
        
    try(FileOutputStream fops = new FileOutputStream(filePath)) {
        ObjectOutputStream output = new ObjectOutputStream(fops);
        
        output.writeObject(currentGame); // write the game object out to file
    }    
    catch(IOException e) {
        throw new GameControlException(e.getMessage());
    }
    }
    
}
