/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.control;

import byui.cit260.monopofastPro.exceptions.MapControlExceptions;
import byui.cit260.monopofastPro.model.Map;
import byui.cit260.monopofastPro.model.Workstation;
import java.awt.Point;
import monopofastpro.Monopofastpro;

/**
 *
 * @author Galicia
 */
public class MapControl {
    private static Object monopofastPro;
    public static Map createMap() {
      Map map = new Map(5,5);
      Workstation[] workstation = createWorkstation();
      assignLocationsToWorkstations(map,workstation);
      
      return map;
}
    
    public static void moveActorsToStartingLocation(Map map) 
                            throws MapControlExceptions {
        Character[] character = Character.Values();
        
        for (Character character : character) {
            Point coordinates = Character.getCoordinates();
            MapControl.moveActorsToLocation(character, coordinates);
           }
    }
    
    public static void moveActorsToLocation(Character character, Point coordinates) 
                            throws MapControlExceptions {
        Map map = Monopofastpro.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if(newRow < 0 || newRow >= map.getNoOfRows() || newColumn < 0 || newColumn >= map.getNoOfColumns()) {
            throw new MapControlExceptions("Can not move character to location"
                                           + coordinates.x + "' " + coordinates.y 
                                           + "because that location is outside"
                                           + "the bounds of the map.");
        }
        
    }

    private static Workstation[] createWorkstation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void assignLocationsToWorkstations(Map map, Workstation[] workstation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void moveActorsToLocation(byui.cit260.monopofastPro.model.Character character, Point coordinates) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class MapControlException extends Exception {

        public MapControlException(String string) {
        }
    }
    
}    
