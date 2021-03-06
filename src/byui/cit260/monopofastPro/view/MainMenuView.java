/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.view;

import byui.cit260.monopofastPro.control.GameControl;
import byui.cit260.monopofastPro.control.HealthControl;
import static byui.cit260.monopofastPro.control.HealthControl.SortingHealthStrenght;
import byui.cit260.monopofastPro.exceptions.ActionException;
import byui.cit260.monopofastPro.exceptions.HealthControlExceptions;
import byui.cit260.monopofastPro.model.FoodItem;
import byui.cit260.monopofastPro.model.Location;
import java.io.IOException;
import java.io.PrintWriter;
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
            + "\nR – Print Character Report"
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
            case 'R':
                this.printReport(FoodItem.values());
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
        
        MapMenuView mapMenu = new MapMenuView();
        mapMenu.display();
//          Location[][] locations = Monopofastpro.getCurrentGame().getMap().getLocations();
//          
//          System.out.println("\n********** Food World 1 ***********");
//          System.out.println("\n   | 0  | 1  | 2  | 3  | 4  | 5  | ");
//          System.out.println("\n********** Food World 2 ***********");
//          System.out.println("\n   | 0  | 1  | 2  | 3  | 4  | 5  | ");
//          System.out.println("\n********** Food World 3 ***********");
//          System.out.println("\n   | 0  | 1  | 2  | 3  | 4  | 5  | ");
//          System.out.println("\n********** Food World 4 ***********");
//          System.out.println("\n   | 0  | 1  | 2  | 3  | 4  | 5  | ");
//          System.out.println("\n********** Food World 5 ***********");
//          System.out.println("\n   | 0  | 1  | 2  | 3  | 4  | 5  | ");
//          
//          for (int i = 0; i < locations[0].length; i++) {
//
//            System.out.println("\n------------------------------------------------------");
//             System.out.format("%2d", i);
//             for (int j = 0; j < locations[0].length; j++) {
//                 System.out.print(" | ");
//                 System.out.print(locations[i][j].getWorkstation());
// 
//             }
//             System.out.print(" | ");
//         }
//
//       System.out.println("\n------------------------------------------------------");
       
       
    }        

    public void HealthControl(FoodItem footItemList[]) {
        FoodItem[] sortedFoodItems = HealthControl.SortingHealthStrenght(footItemList);
            this.console.println("\nList of Foot Items");
         this.console.println("Health");
         
         // for each inventory item
         for (FoodItem foodItem : sortedFoodItems) {
             // DISPLAY the description, the required amount and amount in stock
             this.console.println(foodItem.getTypeOfFood() + "\t   "
                              + foodItem.getHealthStrenght());
         }
         
         // display other sub menus
         //MapMenuView viewMap = new MapMenuView();
        //viewMap.display();
                   
        }

    private void startExistingGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void printReport(FoodItem footItemList[]) 
        throws HealthControlExceptions {
         try (PrintWriter out = new PrintWriter("C:\\Users\\Galicia\\Desktop\\logfile.txt")) {
            
              FoodItem[] sortedFoodItems = HealthControl.SortingHealthStrenght(footItemList);
            this.console.println("\nLIST OF FOOD ITEMS");  
            this.console.println("\nFoot Item");
            this.console.println("Health");
         
         // for each inventory item
         for (FoodItem foodItem : sortedFoodItems) {
             // DISPLAY the description, the required amount and amount in stock
             out.println(foodItem.getTypeOfFood() + "\t   "
                              + foodItem.getHealthStrenght());
         }
          
             
             System.out.println("Health printed");
         } catch (IOException te) {
             ErrorView.display("GameMenuView", te.getMessage());
         
    }

    }
}
