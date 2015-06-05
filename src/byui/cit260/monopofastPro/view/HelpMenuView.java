/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.view;

import java.util.Scanner;

/**
 *
 * @author Galicia
 */
public class HelpMenuView {
    
    private final String MENU = "\n"
            + "\n------------------------------"
            + "\n |         Help Menu         |"
            + "\n------------------------------"
            + "\nG – Goal of the game?"  
            + "\nC - View Commands available"
            + "\nO – View Objects available" 
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

    private void doAction(char selection) {
        switch (selection) {
            case 'G' :
                this.goalOfGame();
                break;
            case 'C' :
                this.viewCommandsAvailable();
                break;
            case 'O' :
                this.viewObjectsAvailable();
                break;
            case 'Q' :
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
        }
    }

    private void goalOfGame() {
        System.out.println("********************************************************");
        
         System.out.println("\n* The ultimate goal in the game is to get         *"
                          + "\n* to the top of the food chain in each restaurant *"
                          + "\n* and merge them all together in order to become  *"
                          + "\n* the ultimate fast food tycoon. After taking     *"
                          + "\n* control of each restaurant, you go to the next  *"
                          + "\n* restaurant starting at the bottom again.        *");
         
        System.out.println("********************************************************");
    }
    
    private void viewCommandsAvailable() {
        System.out.println("*****************************");
        
         System.out.println("\n* add      *" +
                            "\n* bake     *" +
                            "\n* blend    *" +
                            "\n* dispense *" +
                            "\n* frost    *" +
                            "\n* prepare  *" +
                            "\n* remove   *" +
                            "\n* serve    *");
         
        System.out.println("*****************************");
    }

    private void viewObjectsAvailable() {
        System.out.println("*****************************");
        
         System.out.println("\n* bacon            *" +
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
         
        System.out.println("*****************************"); 
    }
}
