import java.util.ArrayList;
import java.util.List;

public class Operator extends Person {

	private List<Drone> drones = new ArrayList<Drone>();

	public void update(Drone drone) {
		System.out.println("Notification for operator :");
		System.out.println("Drone "+drone.getID()+" from pack "+drone.getPackID()+" has entered "+drone.getState()+" state");
		System.out.println();
	}

	public void addDrone(Drone drone){
		this.drones.add(drone);
	}

	public List<Drone> getDrone(){
		return this.drones;
	}
}
