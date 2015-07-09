/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.control;

import byui.cit260.monopofastPro.model.Game;
import byui.cit260.monopofastPro.model.Map;
import byui.cit260.monopofastPro.model.Player;
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
    
}
