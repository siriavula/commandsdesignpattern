/**
<<<<<<< HEAD
 * This class is subclass for Command and is specifically for the IDontKnow Command.
 * 
 * @author Siri, Ali, Valerie, Maddie
 */
public class IDontKnowCommand implements Command {
    
=======
* The 'I Don't Know' Java class that is called by the Military Cadence class
*/
public class IDontKnowCommand implements Command {
    /**
     * Establishes the military cadence class in the form of a private variable
     */
>>>>>>> fc85918bf5c0f44823ea5ee5dab858e239ea1e05
    private MilitaryCadence cadence;
    /**
     * Makes the IDontKnow command a public method, calling the private variable and
     * self-identifying the 'cadence'
     */
    public IDontKnowCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }
    /**
     * Overrides and executes the IDontKnow cadence, being called through the Military Cadence class to
     * perform the lyrics
     */
    @Override
    public void execute() {
        cadence.singIDontKnow();
    }
}
