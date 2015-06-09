/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.view;

import byui.cit260.monopofastPro.control.GameControl;
import java.util.Scanner;
import monopofastpro.Monopofastpro;

/**
 *
 * @author Galicia
 */
public class MainMenuView {

    private final String MENU = "\n"
            + "\n------------------------------"
            + "\n |        Main Menu          |"
            + "\n------------------------------"
            + "\nN – Start New Game" 
            + "\nH - Get Help"
            + "\nS – Saved Game"
            + "\nC – View Challenges" 
            + "\nQ – Quit"
            + "\n------------------------------";
    
    public void displayMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        } while (selection != 'Q');
    }

    private void doAction(char selection) {
        switch (selection) {
            case 'N' :
                this.startNewGame();
                break;
            case 'H' :
                this.getHelp();
                break;
            case 'S' :
                this.saveGame();
                break;
            case 'C' :
                this.viewChallenges();
                break;
            case 'Q' :
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
        }
    }

    private String getInput() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        boolean valid = false; // indicates if the name has been retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in); // keboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            //prompt for the players name
            System.out.println("Enter your selection here:");
            
            //get the name form the keobard and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();
            
            //if the name is invalid (less than to character in length))
            if (input.length() > 1) {
                System.out.println("Invalid selection - the selection should be one letter");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition
        }
        
        return input; // return name
       
    }

    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(Monopofastpro.getPlayer());
        
        // display the game manu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void getHelp() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void saveGame() {
        System.out.println(" ** savegame function called **");
    }

    private void viewChallenges() {
         ChallengeMenuView challengeMenu = new ChallengeMenuView();
        challengeMenu.displayMenu();
    }
            
}
