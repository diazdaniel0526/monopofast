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
public class Player implements Serializable{
    // class instance variables
    private String nameOfPlayer;
    private String skills;
    private double fastestTime;

    public Player() {
    }

    
    
    public String getNameOfPlayer() {
        return nameOfPlayer;
    }

    public void setNameOfPlayer(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public double getFastestTime() {
        return fastestTime;
    }

    public void setFastestTime(double fastestTime) {
        this.fastestTime = fastestTime;
    }

    @Override
    public String toString() {
        return "Player{" + "nameOfPlayer=" + nameOfPlayer + ", skills=" + skills + ", fastestTime=" + fastestTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nameOfPlayer);
        hash = 37 * hash + Objects.hashCode(this.skills);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.fastestTime) ^ (Double.doubleToLongBits(this.fastestTime) >>> 32));
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.nameOfPlayer, other.nameOfPlayer)) {
            return false;
        }
        if (!Objects.equals(this.skills, other.skills)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fastestTime) != Double.doubleToLongBits(other.fastestTime)) {
            return false;
        }
        return true;
    }
    
}
