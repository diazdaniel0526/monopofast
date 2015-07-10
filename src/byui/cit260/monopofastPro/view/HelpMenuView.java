/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.view;

//import java.util.Scanner;

/**
 *
 * @author Galicia
 */
public class HelpMenuView extends View {
    
    public HelpMenuView() {
    super("\n"
            + "\n------------------------------"
            + "\n |         Help Menu         |"
            + "\n------------------------------"
            + "\nG – Goal of the game?"  
            + "\nC - View Commands available"
            + "\nO – View Objects available" 
            + "\nQ – Quit"
            + "\n------------------------------");
    }
    


    @Override 
   public boolean doAction(Object obj) {
       
       String value = (String) obj;
       value = value.toUpperCase();
       String selection = value;
       
        switch (selection) {
            case "G" :
                this.goalOfGame();
                break;
            case "C" :
                this.viewCommandsAvailable();
                break;
            case "O" :
                this.viewObjectsAvailable();
                break;
            case "Q" :
                return false;
            default:
                this.console.println("\n*** Invalid Selection *** Try Again");
        }
        return true;
    }

    private void goalOfGame() {
        this.console.println("********************************************************");
        
         this.console.println("\n* The ultimate goal in the game is to get         *"
                          + "\n* to the top of the food chain in each restaurant *"
                          + "\n* and merge them all together in order to become  *"
                          + "\n* the ultimate fast food tycoon. After taking     *"
                          + "\n* control of each restaurant, you go to the next  *"
                          + "\n* restaurant starting at the bottom again.        *");
         
        this.console.println("********************************************************");
    }
    
    private void viewCommandsAvailable() {
        this.console.println("*****************************");
        
         this.console.println("\n* add      *" +
                            "\n* bake     *" +
                            "\n* blend    *" +
                            "\n* dispense *" +
                            "\n* frost    *" +
                            "\n* prepare  *" +
                            "\n* remove   *" +
                            "\n* serve    *");
         
        this.console.println("*****************************");
    }

    private void viewObjectsAvailable() {
        this.console.println("*****************************");
        
         this.console.println("\n* bacon            *" +
                            "\n* bottom bun       *" +
                            "\n* bread            *" +
                            "\n* burger           *" +
                            "\n* cheese           *" +
                            "\n* egg              *" +
                            "\n* grilled onions   *" +
                            "\n* ham              *" +
                            "\n* heehaw sauce     *" +
                            "\n* ketchup          *" +
                            "\n* lettuce          *" +
                            "\n* mayo             *" +
                            "\n* mustard          *");
         
        this.console.println("*****************************"); 
    }
}
