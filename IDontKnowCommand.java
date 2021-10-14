/**
 * This class is subclass for Command and is specifically for the "I Dont Know" Command.
 * 
 * @author Siri, Ali, Valerie, Maddie
 */

public class IDontKnowCommand implements Command {
    /**
     * Initializes a private instance of MilitaryCadence
     */
    private MilitaryCadence cadence;

    /**
     * This is the constructor for the IDontKnow class
     * @param cadence is the appropriate cadence and assigned to this.cadence.
     */
    public IDontKnowCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }

    /**
     * Overrides and executes the singIDontKnow method called from the MilitaryCadence class to perform the lyrics
     */
    @Override
    public void execute() {
        cadence.singIDontKnow();
    }
}
