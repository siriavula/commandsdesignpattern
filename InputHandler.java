/**
 * The Input Handler holds an array of the commands
 * 
 * @author Siri, Ali, Valerie, Maddie
 */
import java.util.*;
public class InputHandler {

    /**
     * We create an instance of an ArrayList of type Command.
     */
    private ArrayList<Command> commands;
    Command IDontKnowCommand;
    Command InArmyCommand;
    Command EverywhereCommand;

    /**
     * This calls instances of each command method, adds to array
     * @param cadence is the appropriate cadence and assigned to this.cadence.
     */
    public InputHandler(MilitaryCadence cadence) {
        this.commands = new ArrayList<Command>();
        commands.add(IDontKnowCommand);
        commands.add(InArmyCommand);
        commands.add(EverywhereCommand);
    }

    /**
     * This checks if num is a valid index and executes the corresponding command.
     * @param num is the index of the ArrayList of Commands.
     * @return returns a boolean value based on whether or not the index is valid
     */
    public boolean playCadence(int num) {
        if(num == 0)
        {
            commands.get(0).execute();;
            return true; 
        }
        else if(num == 1) {
            commands.get(1).execute();;
            return true;
        }
        else if(num == 2) {
            commands.get(2).execute();
            return true;
        }
        else {
            return false;
        }
    }
}
