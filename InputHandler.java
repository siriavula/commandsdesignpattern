/**
 * The Input Handler holds an array of the commands
 * 
 * @author Siri, Ali, Valerie, Maddie
 */
import java.util.*;
public class InputHandler {

    //create an instance of each command class in an arraylist
    private ArrayList<Command> commands;

    //calls instances of each command method, adds to array
    public InputHandler(MilitaryCadence cadence) {
        Command[] IDontKnowCommand = new IDontKnowCommand[0];
        Command[] InArmyCommand = new InArmyCommand[1];
        Command[] EverywhereCommand = new EverywhereCommand[2];
    }

    //checks if the number input is valid,
    //valid numbers being 1, 2, or 3, and returns true if so
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