/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.view;

import byui.cit260.monopofastPro.control.ProgramControl;
import byui.cit260.monopofastPro.model.Player;
import java.util.Scanner;

/**
 *
 * @author Galicia
 */
public class StartProgramView {
    public StartProgramView () {
}


public void startProgram() {
        // display the banner screen
        this.displayBanner();
    
        String playersName = this.getPlayersName();
        
        //create and save the player object
        
        Player player = ProgramControl.createPlayer(playersName);
        
        //display a welcome message
        
        this.displayWelcomeMessage(player);
        
        //display the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
        
        
}
    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n===============================================");
        System.out.println("\tWelcome to the game " + player.getNameOfPlayer());
        System.out.println("\tHave fun, beat your best score!");
        System.out.println("===================================================");
    }


    private void displayBanner() {
     System.out.println("\n\n**************************************");
     
     System.out.println("*                                      *"
                    + "\n* Monopofast is a quick-paced game and *"
                    + "\n* its objective is to monopolize the   *"
                    + "\n* major fast food joints in the US.    *");
     
     System.out.println("*                                      *"
                    + "\n* To do this, you must work your way   *"
                    + "\n* through the ranks ensuring that you  *"
                    + "\n* are faster than the owner of each    *"
                    + "\n* joint at making their food. You'll   *"
                    + "\n* start as a lowly fry-dipper and work *"
                    + "\n* your way up to completing the most   *"
                    + "\n* difficult sandwiches in record time. *"
                    + "\n* After conquering one fast food joint,*"
                    + "\n* you will move on to the next,        *"
                    + "\n* starting at the bottom each time.    *"
                    + "\n* Restaurants included in the game are:*"
                    + "\n* McDumbledore’s, Venti’s, Ardy’s,      *"
                    + "\n* Karl’s Sr., Jack and the Fox, and    *" 
                    + "\n* Queen Burger.                        *");
     
     System.out.println("*                                     *"
                    + "\n* Good Luck and Enjoy it!!             *"
                    + "\n*                                      *");
     
     System.out.println("*****************************************");
     
    }

    private String getPlayersName() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        boolean valid = false; // indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); // keboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            //prompt for the players name
            System.out.println("Enter the player's name below:");
            
            //get the name form the keobard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
            //if the name is invalid (less than to character in length))
            if (playersName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition
        }
        
        return playersName; // return name
       
    }
    
    public static Player createPlayer(String playersName){
        System.out.println("\n**** createPlayer function called ****");
        return null;
    }

}
