
// Adapter Class
public class AdapterImpl implements Adapter {
private Operator operator;
private Pilot pilot;
private Admin admin;

public AdapterImpl(Operator operator) {
    this.operator = operator;
}

public AdapterImpl(Pilot pilot) {
    this.pilot = pilot;
}

public AdapterImpl(Admin admin) {
    this.admin = admin;
}

public void controlDrone() {
    if (operator != null) {
        operator.controlDrone();
    } else if (pilot != null) {
        pilot.controlDrone();
    }
}
}