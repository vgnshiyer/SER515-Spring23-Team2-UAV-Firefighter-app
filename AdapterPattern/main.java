// Example Usage
public class Main {
public static void main(String[] args) {
    // Instantiate Admin, Operator, and Pilot objects

    // Instantiate GUI objects
    ComputerGUI computerGUI = new ComputerGUI();
    iPadGUI iPadGUI = new iPadGUI();
    GameControllerGUI gameControllerGUI = new GameControllerGUI();

    // Instantiate Adapters for Operator and Pilot
    Adapter operatorAdapter = new AdapterImpl(operator);
    Adapter pilotAdapter = new AdapterImpl(pilot);

    // Use Adapters to control drones
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 0 to enter into Admin interface");
    System.out.println("Enter 1 to control drone as Operator");
    System.out.println("Enter 2 to control drone as Pilot");
    int choice = scanner.nextInt();
    operatorAdapter.controlDrone();
   
