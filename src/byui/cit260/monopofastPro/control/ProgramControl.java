/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.control;

import byui.cit260.monopofastPro.model.Player;
import monopofastpro.Monopofastpro;

/**
 *
 * @author ellisoverson
 */
public class ProgramControl {

    public static Player createPlayer(String playersName) {
      if ( playersName == null) {
          return null;
      }
      
      Player player = new Player();
      player.setNameOfPlayer(playersName);
      
      Monopofastpro.setPlayer(player);
      
      return player;
    }
    
}
