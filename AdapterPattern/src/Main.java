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

    Object operator;
    // Instantiate Adapters for Operator and Pilot
    final Adapter operatorAdapter = new Adapter(operator);
    Object pilot;
    final Adapter pilotAdapter = new Adapter(pilot);
    Object admin;
    //final Adapter adminAdapter = new Adapter(admin);

    // Use Adapters to control drones
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 0 to enter into Admin interface");
    System.out.println("Enter 1 to control drone as Operator");
    System.out.println("Enter 2 to control drone as Pilot");
    int choice = scanner.nextInt();
    switch (choice) {
        case 0:
            ComputerGUI.displayMission();
            break;
        case 1:
            iPadGUI.displayControls();
            //operatorAdapter.controlDrone();
            break;
        case 2:
            GameControllerGUI.displayControls();
            //pilotAdapter.controlDrone();
            break;
        default:
            System.out.println("Invalid choice");
            break;
    }
}
}
   
