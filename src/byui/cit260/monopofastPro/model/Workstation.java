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
 * @author User
 */


public class Workstation implements Serializable{

      // class instance variables
    private String name;
    private String type; 
    private String description;
    private int requiredTime;
    private int actualTime;
    private Location location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRequiredTime() {
        return requiredTime;
    }

    public void setRequiredTime(int requiredTime) {
        this.requiredTime = requiredTime;
    }

    public int getActualTime() {
        return actualTime;
    }

    public void setActualTime(int actualTime) {
        this.actualTime = actualTime;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    

    public Workstation(String name, String type, String description, int requiredTime, int actualTime) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.requiredTime = requiredTime;
        this.actualTime = actualTime;
    }

    @Override
    public String toString() {
        return "Workstation{" + "name=" + name + ", type=" + type + ", description=" + description + ", requiredTime=" + requiredTime + ", actualTime=" + actualTime + '}';
    }

    public Workstation() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.type);
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + this.requiredTime;
        hash = 37 * hash + this.actualTime;
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
        final Workstation other = (Workstation) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.requiredTime != other.requiredTime) {
            return false;
        }
        if (this.actualTime != other.actualTime) {
            return false;
        }
        return true;
    }
    
            

}
