/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.view;

import byui.cit260.monopofastPro.control.GameControl;
import byui.cit260.monopofastPro.control.ProgramControl;
import byui.cit260.monopofastPro.model.Player;
import java.util.Scanner;

/**
 *
 * @author Galicia
 */
public class StartProgramView extends View {

    public StartProgramView(String promptMessage) {
             super(   "\n\n**************************************"
                    + "*                                      *"
                    + "\n* Monopofast is a quick-paced game and *"
                    + "\n* its objective is to monopolize the   *"
                    + "\n* major fast food joints in the US.    *"
                    + "*                                      *"
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
                    + "\n* Queen Burger.                        *"
                    + "*                                     *"
                    + "\n* Good Luck and Enjoy it!!             *"
                    + "\n*                                      *"
                    + "*****************************************"
                    + "\n\nEnter the player's name below:");
                    
    }
 


    public void displayWelcomeMessage(Player player) {
        this.console.println("\n\n===============================================");
        this.console.println("\tWelcome to the game " + player.getNameOfPlayer());
        this.console.println("\tHave fun, beat your best score!");
        this.console.println("===================================================");
    }

        

    @Override
    public boolean doAction(Object obj) {
       String name = (String)obj; 
       Player player = ProgramControl.createPlayer(name);
       this.displayWelcomeMessage(player);
       MainMenuView mainMenuView = new MainMenuView();
       mainMenuView.display();
       return true;
    }
}