import java.util.List;
import java.util.ArrayList;

public class Pack {

	private int pack_id;

	private static Pack pack=null;

	private List<Drone> drones = new ArrayList<Drone>();

	private Pack() {
	}

	public static Pack getInstance() {
		if(pack==null){
			pack = new Pack();
		}
		return pack;
	}
	
	public void addDrone(Drone drone) {
		this.drones.add(drone);
		System.out.println("Added drone" + drone.getID() + "to a singleton pack");
	}

}
