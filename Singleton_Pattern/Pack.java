import java.util.List;

public class Pack {

	private int pack_id;

	private static Pack pack=null;

	private List<Drone> drones;

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
	}

}
