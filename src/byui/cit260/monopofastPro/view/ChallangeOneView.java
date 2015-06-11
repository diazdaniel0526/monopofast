/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.view;

import byui.cit260.monopofastPro.control.WorkstationControl;
import java.util.Scanner;

/**
 *
 * @author Galicia
 */
public class ChallangeOneView {
    private final String CHALLANGE = "\n"
            + "\n |                Challange #1                    |"
            + "\n* If it takes you _____ seconds to make a Son of  *"
            + "\n* a Bacon Eater Sandwich, and there are 6 people  *"
            + "\n* the ultimate fast food tycoon. After taking     *"
            + "\n* control of each restaurant, you go to the next  *"
            + "\n* ordering one, and you must wash your hands      *"
            + "\n* (which takes _____ seconds), how long will it   *"
            + "\n* take you complete all of the above?             *";
    
    public void displayChallange() {
       
        do {
            System.out.println(CHALLANGE);
            long cook = Long.parseLong(cooking);
            String cooking = this.getCooking();
            long wash = Long.parseLong(washing);
            String washing = this.getWashing();
           
            this.doAction(cooking,washing);
            
        } while (result != 1);
}

    private String getCooking() {
       
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        boolean valid = false; // indicates if the name has been retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in); // keboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            //prompt for the players name
            System.out.println("Enter your first input here:");
            
            //get the name form the keobard and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();
            
            //if the name is invalid (less than to character in length))
            if (input.length() < 1) {
                System.out.println("Invalid input - the input should be a number greater than 0");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition
        }
        
        return input; // return selection
    }

    private String getWashing() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        boolean valid = false; // indicates if the name has been retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in); // keboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            //prompt for the players name
            System.out.println("Enter your first input here:");
            
            //get the name form the keobard and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();
            
            //if the name is invalid (less than to character in length))
            if (input.length() < 1) {
                System.out.println("Invalid selection - the selection should be a number");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition
        }
        
        return input; // return selection
    }

    private void doAction(long result) {
      
    
              
    }

    private void doAction(String cooking, String washing) {
     long guess = WorkstationControl.calcTimeToCompleteOrder(cooking, washing);
       
       if (guess > 0 )
           System.out.println("Great, keep going with the next challange");
           return 1;
       else
           System.out.println("wrong, keep trying!");
           return -1;
    }

    
    
}
