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
            + "\n |       Map                 |"
            + "\n------------------------------"
            + "\nQ – Quit"
            + "\n------------------------------");
    }
   @Override 
   public boolean doAction(Object obj) {
       
       String value = (String) obj;
       value = value.toUpperCase();
       char selection = value.charAt(0);
       
        switch (selection) {
            case 'Q' :
                return false;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
        }
        return true;
    }
        private void mapMenu() {
        System.out.println(" ** Map In Progress Level One etc... **");
    }
}

