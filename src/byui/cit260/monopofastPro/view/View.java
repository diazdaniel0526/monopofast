/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import monopofastpro.Monopofastpro;

/**
 *
 * @author ellisoverson
 */
public abstract class View implements ViewInterface {
    
    private String promptMessage;
    
    protected final BufferedReader keyboard = Monopofastpro.getInFile();
    protected final PrintWriter console = Monopofastpro.getOutFile();
    
    public View(String promptMessage){
        this.promptMessage = promptMessage;
    }
        
        @Override
        public void display() {
        
        String value= "";
        boolean done = true;
        
        do {
            System.out.println(promptMessage);//display promp message 
            value = this.getInput();
            //selection = input.charAt(0);
            done = this.doAction(value); // do cation based on the value entered
            
        } while (done);
    }
    
    @Override
        public String getInput() {
            Scanner keyboard = new Scanner(System.in); // keboard input stream
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            boolean valid = false; // indicates if the name has been retrieved
            String value = null;
        
        
        while(!valid) { //while a valid name has not been retrieved
            
            //prompt for the players name
            System.out.println("Enter your selection here:");
            
            //get the name form the keobard and trim off the blanks
            value = keyboard.nextLine();
            value = value.trim();
            
            //if the name is invalid (less than to character in length))
            if (value.length() < 1) {
                System.out.println("Invalid selection - the selection should be one letter");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition
        }
        
        return value; // return name
       
    }
        public String getPromptMessage() {
            return promptMessage;
        }
        
        public void setPromptMessage(String message) {
            this.promptMessage = message;
        }
    
}
