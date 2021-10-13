/**
 * This class is subclass for Command and is specifically for the Everywhere Command.
 * 
 * @author Siri, Ali, Valerie, Maddie
 */
public class EverywhereCommand implements Command {

    /**
     * This is an instance variable of type MilitaryCadence.
     */
    private MilitaryCadence cadence;

    /**
     * This is the constructor for the EverywhereCommand class.
     * @param cadence is the appropriate cadence 
     */
    public EverywhereCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }

    /**
     * Overrides and executes the singEverywhereWeGo method from the MilitaryCadence class
     */
    @Override
    public void execute() {
        cadence.singEverywhereWeGo();
    }

}
