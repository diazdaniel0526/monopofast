/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.view;

import byui.cit260.monopofastPro.control.GameControl;
import byui.cit260.monopofastPro.control.HealthControl;
import static byui.cit260.monopofastPro.control.HealthControl.SortingHealthStrenght;
import byui.cit260.monopofastPro.model.FoodItem;
//import java.util.Scanner;
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
            + "\nV – View Map"
            + "\nP – Health Strength of Food"
            + "\nQ – Quit"
            + "\n------------------------------");
    
}
   @Override 
   public boolean doAction(Object obj) {
       
       String value = (String) obj;
       value = value.toUpperCase();
       char selection = value.charAt(0);
       
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
            case 'V':
                this.viewMap();
                break;
            case 'P':
                this.HealthControl(FoodItem.values());
                break;
            case 'Q' :
                return false;
            default:
                this.console.println("\n*** Invalid Selection *** Try Again");
        }
        return true;
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
        this.console.println(" ** savegame function called **");
    }

    private void viewChallenges() {
         ChallengeMenuView challengeMenu = new ChallengeMenuView();
        challengeMenu.display();
    }
    private void viewMap() {
        MapMenuView viewMap = new MapMenuView();
        viewMap.display();
    }        

    public void HealthControl(FoodItem footItemList[]) {
        FoodItem[] sortedFoodItems = HealthControl.SortingHealthStrenght(footItemList);
         
                   
        }

    }
