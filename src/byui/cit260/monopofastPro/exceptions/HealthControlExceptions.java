/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.exceptions;

/**
 *
 * @author Galicia
 */
public class HealthControlExceptions extends Exception{

    public HealthControlExceptions() {
    }

    public HealthControlExceptions(String message) {
        super(message);
    }

    public HealthControlExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public HealthControlExceptions(Throwable cause) {
        super(cause);
    }

    public HealthControlExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
