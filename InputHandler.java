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
//assign each instance to its correlating number
    public InputHandler(MilitaryCadence cadence) {
        IDontKnowCommand = new Command[0];
        InArmyCommand = new Command[1];
        EverywhereCommand = new Command[2]; 
    }
//check to see if it has a valid index 
    public int playCadence(int num) {
        if(num == 0)
        {
            IDontKnowCommand[0].execute(); //calling execute from Military Cadence
        }
        if(num == 1) {
            InArmyCommand[1].execute();  //calling execute from Military Cadence
        }
        if(num == 2) {
            EverywhereCommand[2].execute();//calling execute from Military Cadence
        }
        else {
            return -1;
        }
        return 0; 
    }
   

}