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
public class MainMenuView extends View {

   public MainMenuView() {
    super("\n"
            + "\n------------------------------"
            + "\n |        Main Menu          |"
            + "\n------------------------------"
            + "\nN – Start New Game" 
            + "\nH - Get Help"
            + "\nS – Saved Game"
            + "\nC – View Challenges" 
            + "\nQ – Quit"
            + "\n------------------------------");
    
}
   @Override 
   public boolean doAction(Object obj) {
       
       String value = (String) obj;
       value = value.toUpperCase(); //convert to all upper case
       
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


    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(Monopofastpro.getPlayer());
        
        // display the game manu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void getHelp() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        System.out.println(" ** savegame function called **");
    }

    private void viewChallenges() {
         ChallengeMenuView challengeMenu = new ChallengeMenuView();
        challengeMenu.display();
    }
            
}
