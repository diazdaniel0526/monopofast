/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Galicia
 */
public enum CharacterOfGame implements Serializable{
    
    DonTaco("He is the master of the taco."),
    DonBurger("He is the master of all kinds of hamburgers."),
    DonaShakes("She is the master of the shakes");
    
    private final Point coordinates;
    private final String description;
    private CharacterOfGame character;
    private Location[] locations;

    CharacterOfGame(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public String getDescription() {
        return description;
    }   

    public CharacterOfGame getCharacter() {
        return character;
    }

    public void setCharacter(CharacterOfGame character) {
        this.character = character;
    }
   
    
}
