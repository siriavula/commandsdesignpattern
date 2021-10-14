/**
 * The Input Handler holds an array of the commands
 * 
 * @author Siri, Ali, Valerie, Maddie
 */

import java.util.*;
public class InputHandler {

    //create an instance of each command class in an arraylist
    private ArrayList<Command> commands;
    private Command IDontKnowCommand;
    private Command InArmyCommand;
    private Command EverywhereCommand;

//assign each instance to its correlating number
    public InputHandler(MilitaryCadence cadence) {
        commands.add(IDontKnowCommand);
        commands.add(InArmyCommand);
        commands.add(EverywhereCommand);
    }

//check to see if it has a valid index 
    public int playCadence(int num) {
        if(num == 0)
        {
            IDontKnowCommand.execute(); //calling execute from Military Cadence
        }
        if(num == 1) {
            InArmyCommand.execute();  //calling execute from Military Cadence
        }
        if(num == 2) {
            EverywhereCommand.execute();//calling execute from Military Cadence
        }
        else {
            return -1;
        }
        return 0; 
    }
}