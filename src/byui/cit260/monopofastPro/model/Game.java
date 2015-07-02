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
 * @author Galicia
 */
public class Game implements Serializable{
    private String descriptionOfGame;
    private int totalScore;  
    private Player player;
    private Character character;
    private Map map;
    
    public Game() {
    }

    @Override
    public String toString() {
        return "Game{" + "descriptionOfGame=" + descriptionOfGame + ", totalScore=" + totalScore + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.descriptionOfGame);
        hash = 37 * hash + this.totalScore;
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.descriptionOfGame, other.descriptionOfGame)) {
            return false;
        }
        if (this.totalScore != other.totalScore) {
            return false;
        }
        return true;
    }

    
    
    public String getDescriptionOfGame() {
        return descriptionOfGame;
    }

    public void setDescriptionOfGame(String descriptionOfGame) {
        this.descriptionOfGame = descriptionOfGame;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
    

    public Map getMap() {
        return map;
    }

    public void setMap(Map restaurant) {
        this.map = restaurant;
    }
    
    
}
