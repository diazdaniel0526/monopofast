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
public class ChallengeMenuView extends View{
    
    public ChallengeMenuView() {
        super("\n"
            + "\n------------------------------"
            + "\n |         Help Menu         |"
            + "\n------------------------------"
            + "\nV – View Challenges"  
            + "\nC - View Completed Challenges"
            + "\nQ – Quit"  
            + "\n------------------------------");
    }
    
//    public void displayMenu() {
//        
//        String selection = " ";
//        do {
//            
//            System.out.println(MENU);
//            
//            String input = this.getInput();
//            selection = input.substring(0,1);
//            
//            this.doAction(selection);
//            
//        } while (!selection.equals("Q"));
//}
//
//    private String getInput() {
//       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        boolean valid = false; // indicates if the name has been retrieved
//        String input = null;
//        Scanner keyboard = new Scanner(System.in); // keboard input stream
//        
//        while(!valid) { //while a valid name has not been retrieved
//            
//            //prompt for the players name
//            System.out.println("Enter your selection here:");
//            
//            //get the name form the keobard and trim off the blanks
//            input = keyboard.nextLine();
//            input = input.trim();
//            
//            //if the name is invalid (less than to character in length))
//            if (input.length() > 1) {
//                System.out.println("Invalid selection - the selection should be one letter");
//                continue; // and repeat again
//            }
//            break; // out of the (exit) the repetition
//        }
//        
//        return input; // return selection
//    }
    
    @Override 
     public boolean doAction(Object obj) {
        
       String value = (String) obj;
        
        switch (selection) {
            case "V" :
                this.viewChallenges();
                break;
            case "C" :
                this.viewCompletedChallenges();
                break;
            case "Q" :
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
        }
    }

    private void viewChallenges() {
        System.out.println("********************************************************");
        
         System.out.println("\n*                  Challenge 1                    *"
                          + "\n* If it takes you _____ seconds to make a Son of  *"
                          + "\n* a Bacon Eater Sandwich, and there are 6 people  *"
                          + "\n* the ultimate fast food tycoon. After taking     *"
                          + "\n* control of each restaurant, you go to the next  *"
                          + "\n* ordering one, and you must wash your hands      *"
                          + "\n* (which takes _____ seconds), how long will it   *"
                          + "\n* take you complete all of the above?             *");
         
        System.out.println("********************************************************");
        
        System.out.println("********************************************************");
        
         System.out.println("\n*                  Challenge 2                     *"
                          + "\n* If it takes you _____ seconds to make a turnover,*"
                          + "\n* _____ seconds to make mozzarella sticks, how     *"
                          + "\n* long will it take you to complete 3 turnovers,   *"
                          + "\n* and 2 mozzarella sticks?                         *");
         
        System.out.println("********************************************************");
        
        System.out.println("********************************************************");
        
         System.out.println("\n*                  Challenge 3                     *"
                          + "\n* If it takes you _____ seconds to make a chocolate*"
                          + "\n* milkshake, _____ seconds to make Plain McBurger. *"
                          + "\n* How long will it take you to complete 6 Chocolate*"
                          + "\n* milkshakes and 2 Plain McBurgers?                *");
         
        System.out.println("********************************************************");
    }

    private void viewCompletedChallenges() {
         System.out.println("Display Challenges Completed");
    }
}