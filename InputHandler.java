/**
 * The Input Handler holds an array of the commands
 * 
 * @author Siri, Ali, Valerie, Maddie
 */
import java.util.*;
public class InputHandler {

    //create an instance of each command class in an arraylist
    private ArrayList<Command> commands;
   private Command[] IDontKnowCommand;
   private Command[] InArmyCommand;
   private Command[] EverywhereCommand;

    public InputHandler(MilitaryCadence cadence) {
        IDontKnowCommand = new Command[0];
        InArmyCommand = new Command[1];
        EverywhereCommand = new Command[2]; 
    }

    public int playCadence(int num) {
        if(num == 0)
        {
            return 0; 
        }
        if(num == 1) {
            return 1;
        }
        if(num == 2) {
            return 2;
        }
        else {
            return -1;
        }
        
    }

}