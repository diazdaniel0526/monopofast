/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.monopofastPro.view;

/**
 *
 * @author ellisoverson
 */
public class MapMenuView extends View {
    
        public MapMenuView()
    {   super("\n"
            + "\n------------------------------"
            +"\n*********** Food World 1 ***********"
            +"\n | 0  | 1  | 2  | 3  | 4  | 5  | "
            +"\n*********** Food World 2 ***********"
            +"\n | 0  | 1  | 2  | 3  | 4  | 5  | "
            +"\n*********** Food World 3 ***********"
            +"\n | 0  | 1  | 2  | 3  | 4  | 5  | "
            +"\n*********** Food World 4 ***********"
            +"\n | 0  | 1  | 2  | 3  | 4  | 5  | "
            +"\n*********** Food World 5 ***********"
            +"\n | 0  | 1  | 2  | 3  | 4  | 5  | "
            + "\n------------------------------"
            + "\nQ – Quit"
            + "\n------------------------------");
    }
        
   
//   public double getNumber() {     
//   double number = null;
//            Object number;
//   
//   while(number == null) {
//    String value = this.getInput();
//    value = value.trim().toUpperCase();
//    if (value = value.equals("Q"))
//        break;
//    
//    
//    try {
//    number = Double.parseDouble(value);
//    } catch (NumberFormatException nf) {
//        
//        this.console.println("\n You must enter a valid number."
//                            + "Try again or enter Q to quit.");
//    
//    }
//        }
//   return number;
//   }

    
    
    
   @Override 
   public boolean doAction(Object obj) {
       
       String value = (String) obj;
       value = value.toUpperCase();
       char selection = value.charAt(0);
       
        switch (selection) {
            case 'Q' :
                return false;
            default:
                this.console.println("\n*** Invalid Selection *** Try Again");
        }
        return true;
    }
        private void mapMenu() {
        this.console.println(" ** Map In Progress Level One etc... **");
    }
}

