/**
 * This class is subclass for Command and is specifically for the IDontKnow Command.
 * 
 * @author Siri, Ali, Valerie, Maddie
 */
public class IDontKnowCommand implements Command {
    
    private MilitaryCadence cadence;

    public IDontKnowCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }

    @Override
    public void execute() {
        cadence.singIDontKnow();
    }
}
