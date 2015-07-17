/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.model;

import java.awt.Point;
import java.io.Serializable;

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

    Character(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }



    public Point getCoordinates() {
        return coordinates;
    }

    public String getDescription() {
        return description;
    }
    
  
    
}
