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
public class GameMenuView {

    private final String MENU = "\n"
            + "\n------------------------------"
            + "\n |        Game Menu          |"
            + "\n------------------------------"
            + "\nC - Challange #1"
            + "\nH - Challange #2"
            + "\nA - Challange #3"
            + "\nQ – Quit"
            + "\n------------------------------";
    
    public void displayMenu() {
        
        String selection = " ";
        do {
            
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.substring(0,1);
            selection = selection.toUpperCase();
            this.doAction(selection);
            
        } while (!selection.equals("Q"));
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

    private void doAction(String selection) {
        
        
        switch (selection) {
            case "C" :
                this.challangeOne();
                break;
            case "H" :
                this.challangeTwo();
                break;
            case "A" :
                this.challangeThree();
                break;
            case "Q" :
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
        }
    }

    private void challangeOne() {
        System.out.println("Calculate first challange");
    }
    
    private void challangeTwo() {
        System.out.println("Calculate second challange");
    }

    private void challangeThree() {
        System.out.println("Calculate third challange");
    }

   
    
    
}
