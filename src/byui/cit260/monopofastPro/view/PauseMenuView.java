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
public class PauseMenuView extends View {
    
    public PauseMenuView() {
    super("\n"
            + "\n------------------------------"
            + "\n |        Pause Menu         |"
            + "\n------------------------------"
            + "\nR – Restart Level" 
            + "\nV - View Map"
            + "\nS – Save Progress"
            + "\nN – Start New Game"
            + "\nQ – Quit"
            + "\n------------------------------");
    
}

@Override 
   public boolean doAction(Object obj) {
       
       String value = (String) obj;
       value = value.toUpperCase();
       char selection = value.charAt(0);
       
        switch (selection) {
            case 'R' :
                this.restartLevel();
                break;
            case 'V' :
                this.viewMap();
                break;
            case 'S' :
                this.saveProgress();
                break;
            case 'N' :
                this.startNewGame();
                break;
            case 'Q' :
                return false;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
        }
        return true;
    }

    private void restartLevel() {
        System.out.println(" ** restartLevel Funtion in Progress **");
    }

    private void viewMap() {
        MapMenuView viewMap = new MapMenuView();
        viewMap.display();
    }

    private void saveProgress() {
        System.out.println(" ** saveProgress Funtion in Progress **");
    }

    private void startNewGame() {
        System.out.println(" ** startNewGame Funtion still in Progress **");
    }
    
}
