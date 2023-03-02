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