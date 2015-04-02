package twentyone.control;

import java.util.Arrays;
import twentyone.models.Hand;
import twentyone.models.Deck;
import twentyone.views.Player;
import twentyone.views.MainFrame;
import twentyone.enums.ErrorType;


/**
 * @author WMitchell
 * @author RFord
 */
public class TwentyOne {
    public static Hand myHand = new Hand();
    public static Player myPlayer = new Player();
    public static Deck myDeck = new Deck();
    public static int currentPlayer;
    public static MainFrame mainFrame = null;

public static void main(String[] args)  {
    TwentyOne twentyOne = null;
    try {
              /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    TwentyOne.mainFrame = new MainFrame();
                    TwentyOne.mainFrame.setVisible(true);
                }
            });
        }  

        catch (Throwable ex) {     
            ErrorType.displayErorrMsg("Unexpected error: " + ex.getMessage());
            ErrorType.displayErorrMsg(Arrays.toString(ex.getStackTrace()));           
        } 
        finally {
            if (TwentyOne.mainFrame != null) {
                TwentyOne.mainFrame.dispose();
            }
        }
}    
   
       
        
        
    }
    
    
