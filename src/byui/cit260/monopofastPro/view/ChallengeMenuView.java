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
            + "\n |         Challange Menu     |"
            + "\n------------------------------"
            + "\nV – View Challenges"  
            + "\nC - View Completed Challenges"
            + "\nQ – Quit"  
            + "\n------------------------------");
    }
    

    
    @Override 
     public boolean doAction(Object obj) {
        
       String value = (String) obj;
       value = value.toUpperCase();
       String selection = value;
       
        switch (selection) {
            case "V" :
                this.viewChallenges();
                break;
            case "C" :
                this.viewCompletedChallenges();
                break;
            case "Q" :
                return false;
            default:
                this.console.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return true;
    }

    private void viewChallenges() {
        this.console.println("********************************************************");
        
         this.console.println("\n*                  Challenge 1                    *"
                          + "\n* If it takes you _____ seconds to make a Son of  *"
                          + "\n* a Bacon Eater Sandwich, and there are 6 people  *"
                          + "\n* the ultimate fast food tycoon. After taking     *"
                          + "\n* control of each restaurant, you go to the next  *"
                          + "\n* ordering one, and you must wash your hands      *"
                          + "\n* (which takes _____ seconds), how long will it   *"
                          + "\n* take you complete all of the above?             *");
         
        this.console.println("********************************************************");
        
        this.console.println("********************************************************");
        
        this.console.println("\n*                  Challenge 2                     *"
                          + "\n* If it takes you _____ seconds to make a turnover,*"
                          + "\n* _____ seconds to make mozzarella sticks, how     *"
                          + "\n* long will it take you to complete 3 turnovers,   *"
                          + "\n* and 2 mozzarella sticks?                         *");
         
      this.console.println("********************************************************");
        
        this.console.println("********************************************************");
        
         this.console.println("\n*                  Challenge 3                     *"
                          + "\n* If it takes you _____ seconds to make a chocolate*"
                          + "\n* milkshake, _____ seconds to make Plain McBurger. *"
                          + "\n* How long will it take you to complete 6 Chocolate*"
                          + "\n* milkshakes and 2 Plain McBurgers?                *");
         
        this.console.println("********************************************************");
    }

    private void viewCompletedChallenges() {
         this.console.println("Display Challenges Completed");
    }
}