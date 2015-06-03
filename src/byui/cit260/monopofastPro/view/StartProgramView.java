/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.view;

/**
 *
 * @author Galicia
 */
public class StartProgramView {
    public StartProgramView () {
}


public void startProgram() {
        // display the banner screen
        this.displayBanner();
        
}

    private void displayBanner() {
     System.out.println("\n\n**************************************");
     
     System.out.println("*                                      *"
                    + "\n* Monopofast is a quick-paced game and *"
                    + "\n* its objective is to monopolize the   *"
                    + "\n* major fast food joints in the US.    *");
     
     System.out.println("*                                      *"
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
                    + "\n* Queen Burger.                        *");
     
     System.out.println("*                                     *"
                    + "\n* Good Luck and Enjoy it!!             *"
                    + "\n*                                      *");
     
     System.out.println("*****************************************");
     
    }
}