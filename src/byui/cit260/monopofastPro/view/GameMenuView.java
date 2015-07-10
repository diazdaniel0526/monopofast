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
public class GameMenuView extends View{

    public GameMenuView()
    {   super("\n"
            + "\n------------------------------"
            + "\n |        Game Menu          |"
            + "\n------------------------------"
            + "\nC - Challange #1"
            + "\nH - Challange #2"
            + "\nA - Challange #3"
            + "\nP - Pause Options"
            + "\nQ – Quit"
            + "\n------------------------------");
    }
    

     @Override 
     public boolean doAction(Object obj) {
        
       String value = (String) obj;
       value = value.toUpperCase();
       String selection = value;
       
        
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
            case "P" :
                this.pauseMenu();
                break;    
            case "Q" :
                return false;
            default:
                this.console.println("\n*** Invalid Selection *** Try Again");
        }
        return true;
    }

    private void challangeOne() {
        this.console.println("Calculate first challange");
    }
    
    private void challangeTwo() {
        this.console.println("Calculate second challange");
    }

    private void challangeThree() {
        this.console.println("Calculate third challange");
    }

    private void pauseMenu() {
        PauseMenuView pauseView = new PauseMenuView();
        pauseView.display();
    }
    
}
