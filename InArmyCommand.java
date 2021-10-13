public class InArmyCommand implements Command {

<<<<<<< HEAD
    private MilitaryCadence cadence;

    public InArmyCommand(MilitaryCadence cadence) {
        this.cadence = cadence;
=======
    public InArmyCommand(MilitaryCadence cadence) {
        
>>>>>>> c443e096d1478af9d1d0b492c4cda7c4b2149988
    }

    public void execute() {
        cadence.singInArmy();
    }
    
}
