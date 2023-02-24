import java.util.ArrayList;
import java.util.List;

public class Operator extends Person {

	public Operator(int ID) {
		super(ID);
	}

	private List<Drone> drones = new ArrayList<Drone>();

	@Override
	public void update(Drone drone) {
		System.out.println("Notification for operator :");
		System.out.println("Drone "+drone.getID()+" from pack "+drone.getPackID()+" has entered "+drone.getState()+" state");
		System.out.println();
	}

	public void addDrone(Drone drone){
		this.drones.add(drone);
		drone.addPerson(this);
	}

	public List<Drone> getDrone(){
		return this.drones;
	}
}
