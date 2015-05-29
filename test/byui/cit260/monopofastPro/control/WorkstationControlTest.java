/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Galicia
 */
public class WorkstationControlTest {
    
    public WorkstationControlTest() {
    }

    /**
     * Test of calcTimeToCompleteOrder method, of class WorkstationControl.
     */
    @Test
    public void testCalcTimeToCompleteOrder() {
        
        System.out.println("calcTimeToCompleteOrder");
        
        /*****************
         * Test Case 1
         ****************/
        
        System.out.println("\tTest case 1");
        
        //inputs values for test case 1
        double cooking = 50.0;
        double washing = 30.0;
        
        double expResult = 330; 
        
        //create instances of WorkstationControl class          
        WorkstationControl instance = new WorkstationControl();
        
        // call function to run test
        double result = instance.calcTimeToCompleteOrder(cooking, washing);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
       
        
        
         /*****************
         * Test Case 2
         ****************/
        
        System.out.println("\tTest case 2");
        
        //inputs values for test case 2
        cooking = 0.0;
        washing = 60.0;
        
        expResult = -1; 
        
        
        // call function to run test
        result = instance.calcTimeToCompleteOrder(cooking, washing);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        
        
        
        /*****************
         * Test Case 3
         ****************/
        
        System.out.println("\tTest case 3");
        
        //inputs values for test case 3
        cooking = 60.0;
        washing = 0.0;
        
        expResult = -1; 
        
        
        // call function to run test
        result = instance.calcTimeToCompleteOrder(cooking, washing);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        
        
        
        /*****************
         * Test Case 4
         ****************/
        
        System.out.println("\tTest case 4");
        
        //inputs values for test case 4
        cooking = 1.0;
        washing = 60.0;
        
        expResult = 66; 
        
        
        // call function to run test
        result = instance.calcTimeToCompleteOrder(cooking, washing);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        
        
        
        
        /*****************
         * Test Case 5
         ****************/
        
        System.out.println("\tTest case 5");
        
        //inputs values for test case 5
        cooking = 60.0;
        washing = 1.0;
        
        expResult = 361; 
        
        
        // call function to run test
        result = instance.calcTimeToCompleteOrder(cooking, washing);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
    }
    
}
