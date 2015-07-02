/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.model;

import byui.cit260.monopofastPro.control.MapControl;
import byui.cit260.monopofastPro.exceptions.MapControlExceptions;
import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Galicia
 */
public enum Character implements Serializable{
    
    DonTaco("He is the master of the taco."),
    DonBurger("He is the master of all kinds of hamburgers."),
    DonaShakes("She is the master of the shakes");
    
    private final Point coordinates;
    private final String description;
    private Character character;
    private Location[] locations;
    private int values;

    Character(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    @Override
    public boolean doAction(String choice) {
        Character character = null;
        
        try {
            MapControl.moveActorsToLocation(character, coordinates);
        } catch (MapControlExceptions me) {
            System.out.println(me.getMessage());
        }
    }
    
    public Point getCoordinates() {
        return coordinates;
    }

    public String getDescription() {
        return description;
    }   

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public int getValues() {
        return values;
    }

    public void setValues(int value) {
        this.values = values;
    }
   
    
}
