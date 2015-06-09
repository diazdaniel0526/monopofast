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
     public double calcTimeToCompleteOrderTwo(double cookingTurnover, double cookingSticks) {
        
	if (cookingTurnover <= 0) {
                return -1;
        }        
        
        if (cookingSticks <= 0) {
                return -1;
        }
        
	double time = (cookingTurnover * 3) + (cookingSticks * 2);
                
	return time;
         
    }
     public double calcTimeToCompleteOrderThree (double ChocMilkSha, double PlainMcBurg) {
          if (ChocMilkSha <= 0) {
		return -1;
        }
        
	if (PlainMcBurg <= 0) {
                return -1;
        }        
        
	double time = (ChocMilkSha * 6) + (PlainMcBurg * 2);
                
	return time;
     }
}
