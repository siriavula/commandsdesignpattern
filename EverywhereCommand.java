public class EverywhereCommand implements Command {

    private MilitaryCadence cadence;

    EverywhereCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
    }

    public void execute() {
        cadence.singEverywhereWeGo();
    }

    // maybe need getname for 3 children
}
