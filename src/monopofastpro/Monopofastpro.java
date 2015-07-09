/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopofastpro;

import byui.cit260.monopofastPro.model.Game;
import byui.cit260.monopofastPro.model.Map;
import byui.cit260.monopofastPro.model.Player;
import byui.cit260.monopofastPro.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Galicia
 */
public class Monopofastpro {
    
    private static Game currentGame = null;
    private static Player player = null;
    private static Map map = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Monopofastpro.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Monopofastpro.player = player;
    }

    public static Map getMap() {
        return map;
    }

    public static void setMap(Map map) {
        Monopofastpro.map = map;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Monopofastpro.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Monopofastpro.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Monopofastpro.logFile = logFile;
    }

    
    
    
    
    public static void main(String[] args) { 
        
        //open character stream files for end user inout and output
        Monopofastpro.inFile = 
                new BufferedReader(new InputStreamReader(System.in));
        Monopofastpro.outFile = new PrintWriter(System.out, true);
        
       
        
        //create start programViewand start the program
        StartProgramView startProgramView = new StartProgramView();
        
        
        try{
        startProgramView.startProgram();
        
         //open log file
        String filePath = "C:\\Users\\Galicia\\Desktop\\logfile.txt";
        Monopofastpro.logFile = new PrintWriter(filePath);
        
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
           startProgramView.startProgram(); 
        }
        finally {
            try {
                if (Monopofastpro.inFile != null)
                    Monopofastpro.inFile.close();
                
                if (Monopofastpro.outFile != null)
                    Monopofastpro.outFile.close();
                
                if (Monopofastpro.logFile != null)
                    Monopofastpro.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }   
    
}
