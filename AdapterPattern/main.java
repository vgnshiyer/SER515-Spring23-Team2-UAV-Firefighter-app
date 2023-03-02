// Admin Class
public class Admin {
public void createMission() { /* implementation */ }
public void setTarget() { /* implementation */ }
public void assignDrones() { /* implementation */ }
public void assignOperators() { /* implementation */ }
public void assignPilots() { /* implementation */ }
public void unAssign() { /* implementation */ }
}



// Pilot Class
public class Pilot {
public void controlDrone() { /* implementation */ }
public void dropRetardants() { /* implementation */ }
public void returnToMeet() { /* implementation */ }
}

// Adapter Interface
public interface Adapter {
public void controlDrone();
}

// ComputerGUI Class
public class ComputerGUI {
public void displayMission() { /* implementation */ }
}

// iPadGUI Class
public class iPadGUI {
public void displayControls() { /* implementation */ }
}

// GameControllerGUI Class
public class GameControllerGUI {
public void displayControls() { /* implementation */ }
}

// Adapter Class
public class AdapterImpl implements Adapter {
private Operator operator;
private Pilot pilot;

public AdapterImpl(Operator operator) {
    this.operator = operator;
}

public AdapterImpl(Pilot pilot) {
    this.pilot = pilot;
}

public void controlDrone() {
    if (operator != null) {
        operator.controlDrone();
    } else if (pilot != null) {
        pilot.controlDrone();
    }
}
}

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
   
