/**
 * This class is subclass for Command and is specifically for the In Army Command.
 * 
 * @author Siri, Ali, Valerie, Maddie
 */

public class InArmyCommand implements Command {

    private MilitaryCadence cadence;

    public InArmyCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }

    public void execute() {
        cadence.singInArmy();
    }
    
}
