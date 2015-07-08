/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.view;

import java.io.PrintWriter;
import monopofastpro.Monopofastpro;

/**
 *
 * @author Galicia
 */
public class ErrorView {
    private static final PrintWriter errorFile = Monopofastpro.getOutFile();
    private static final PrintWriter logFile = Monopofastpro.getLogFile();
    
    public static void display(String className, String errorMessage) { 
        
        errorFile.println(
                    "----------------------------------------"
                  + "\n- ERROR - " + errorMessage
                  + "\n----------------------------------------");
        
        //log error
        logFile.println(className + " - " + errorMessage);
    }
}
