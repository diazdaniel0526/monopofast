/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Galicia
 */
public class CharacterOfGame implements Serializable{
    private String name;
    private double fastestTime;
    private String description;

    public CharacterOfGame() {
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFastestTime() {
        return fastestTime;
    }

    public void setFastestTime(double fastestTime) {
        this.fastestTime = fastestTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CharacterOfGame{" + "name=" + name + ", fastestTime=" + fastestTime + ", description=" + description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.fastestTime) ^ (Double.doubleToLongBits(this.fastestTime) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.description);
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
        final CharacterOfGame other = (CharacterOfGame) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fastestTime) != Double.doubleToLongBits(other.fastestTime)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
    
    
}
