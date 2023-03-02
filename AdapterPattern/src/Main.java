import java.util.Scanner;


public class Main {
/**
 * @param <iPadGUI>
 * @param <GameControllerGUI>
 * @param <Adapter>
 * @param args
 */
public static void main(String[] args) {
    // Instantiate Admin, Operator, and Pilot objects

    // Instantiate GUI objects
    final ComputerGUI computerGUI = new ComputerGUI();
    final iPadGUI iPadGUI = new iPadGUI();
    final GameControllerGUI gameControllerGUI = new GameControllerGUI();

    //Operator operator = new Operator();
    // Instantiate Adapters for Operator and Pilot
    //final Adapter operatorAdapter = new AdapterImpl(operator);
    //Pilot pilot = new Pilot();
    //final Adapter pilotAdapter = new AdapterImpl(pilot);
    //Admin admin = new Admin();
    //final Adapter adminAdapter = new Adapter(admin);

    try (// Use Adapters to control drones
    Scanner scanner = new Scanner(System.in)) {
        System.out.println("Enter 0 to enter into Admin interface");
        System.out.println("Enter 1 to control drone as Operator");
        System.out.println("Enter 2 to control drone as Pilot");
        int choice = scanner.nextInt();
        switch (choice) {
            case 0:
                computerGUI.displayMission();
                break;
            case 1:
                iPadGUI.displayControls();
                //operatorAdapter.controlDrone();
                break;
            case 2:
                gameControllerGUI.displayControls();
                //pilotAdapter.controlDrone();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
}
   
