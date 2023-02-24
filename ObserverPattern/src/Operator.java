import java.util.ArrayList;
import java.util.List;

public class Operator extends Person {

	private List<Drone> drones = new ArrayList<Drone>();

	public void update(Drone drone) {

	}

	public void addDrone(Drone drone){
		this.drones.add(drone);
	}

	public List<Drone> getDrone(){
		return this.drones;
	}
}
