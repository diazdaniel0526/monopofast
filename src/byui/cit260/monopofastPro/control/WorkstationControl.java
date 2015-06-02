/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.control;

/**
 *
 * @author Galicia
 */
public class WorkstationControl {
    
    public double calcTimeToCompleteOrder(double cooking, double washing) {
        
        if (cooking <= 0) {
		return -1;
        }
        
	if (washing <= 0) {
                return -1;
        }        
        
	double time = (cooking * 6) + washing;
                
	return time;

    }
     public double calcturnover(double cookingTurnover, double cookingSticks, double makingDrinks) {
                 if (cookingTurnover <= 0) {
		return -1;
        }
        
	if (cookingSticks <= 0) {
                return -1;
        }        
        
        if (makingDrinks <= 0) {
                return -1;
        }
	double calcTurnover = (cookingTurnover + cookingSticks + makingDrinks;
                
	return calcTurnover;
         
    }
    
}
