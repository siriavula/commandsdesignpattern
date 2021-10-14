/**
 * The Input Handler holds an array of the commands
 * 
 * @author Siri, Ali, Valerie, Maddie
 */
import java.util.*;
public class InputHandler {

    //create an instance of each command class in an arraylist
    private ArrayList<Command> commands;

    public InputHandler(MilitaryCadence cadence) {
        Command[] IDontKnowCommand = new Command[0];
        Command[] InArmyCommand = new Command[1];
        Command[] EverywhereCommand = new Command[2];
    }

    public boolean playCadence(int num) {
        if(num == 1)
        {
            return true; 
        }
        else if(num == 2) {
            return true;
        }
        else if(num == 3) {
            return true;
        }
        else {
            return false;
        }
        
    }

}