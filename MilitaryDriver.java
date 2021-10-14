import java.util.Scanner;
/**
 * Runs the code for the Military Program
 */
public class MilitaryDriver {
    /**
     * Creates an instance of the Scanner variable "reader"
     */
    private Scanner reader;

    /**
     * This is the public constructor for the Driver
     */
    public MilitaryDriver() {
        reader = new Scanner(System.in);
    }

    /**
     * This method actually runs the code for the Military program
     */
    public void run() {
        MilitaryCadence cadencePlayer = new MilitaryCadence();
        InputHandler inHandler = new InputHandler(cadencePlayer);

        System.out.println("Welcome to our Military Cadence Prgraom");

        while (true) {
            System.out.print("Enter 1, 2, or 3, or q: ");
            String input = reader.nextLine().trim();

            if (input.equals("q"))
                break;

            try {
                int num = Integer.parseInt(input) - 1;
                inHandler.playCadence(num);
            } catch (Exception e) {
                System.out.println("Invald input");
            }

        }

        System.out.println("Goodbye");
    }

    public static void main(String[] args) {
        MilitaryDriver driver = new MilitaryDriver();
        driver.run();
    }
}
