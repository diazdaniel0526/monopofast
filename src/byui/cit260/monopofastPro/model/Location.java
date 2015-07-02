/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author User
 */
public class Location implements Serializable {
    // class instance variables
    private int location; 
    private String levelType;
    private Character[] characters;
    private Workstation workstation;

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public String getLevelType() {
        return levelType;
    }

    public void setLevelType(String levelType) {
        this.levelType = levelType;
    }

    public Workstation getWorkstation() {
        return workstation;
    }

    public void setWorkstation(Workstation workstation) {
        this.workstation = workstation;
    }
    
    

    public Location() {
    }

    public Location(int location, String levelType) {
        this.location = location;
        this.levelType = levelType;
    }

    @Override
    public String toString() {
        return "Location{" + "location=" + location + ", levelType=" + levelType + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.location;
        hash = 79 * hash + Objects.hashCode(this.levelType);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.location != other.location) {
            return false;
        }
        return Objects.equals(this.levelType, other.levelType);
    }

    public void setCoordinates(String coordinates_of_location) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
