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
    operatorAdapter.controlDrone();
   
