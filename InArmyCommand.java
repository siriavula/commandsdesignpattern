/**
 * This class is subclass for Command and is specifically for the In Army Command.
 * 
 * @author Siri, Ali, Valerie, Maddie
 */

public class InArmyCommand implements Command {
    /**
     * Initializes a private instance of MilitaryCadence
     */
    private MilitaryCadence cadence;

    /**
     * This is the constructor for the InArmyCommand class
     * @param cadence is the appropriate cadence and assigned to this.cadence.
     */
    public InArmyCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }

    /**
     * Overrides and executes the singInArray method from the MilitaryCadence class
     */
    public void execute() {
        cadence.singInArmy();
    }
    
}
