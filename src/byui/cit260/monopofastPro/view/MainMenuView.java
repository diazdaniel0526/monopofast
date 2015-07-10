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
            + "\nG - Get and Start Saved Game"
            + "\nH - Get Help"
            + "\nS – Save Game"
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
            case 'G' :
                this.startExistingGame();
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
        // prompt for and get the name of the file to save the game in
        System.out.println("\n\nEnter the file path for the file where the game"
                            + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            // save the game to the specified file
            GameControl.saveGame(Monopofastpro.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
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

    private void startExistingGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }
