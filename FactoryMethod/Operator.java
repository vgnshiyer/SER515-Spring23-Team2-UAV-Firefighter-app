import java.util.List;

public class Operator implements UAVUser {

	private List drones;

	public Operator() {
		this.drones = new List<int>;
	}

	public void addDrones(Drone d) {
		this.drones.add(d.getDroneId());
	}

	public void notify() {
		System.out.println("Pilot notified!");
	}

	public void connectDrones(Drone d) {
		System.out.println("Operator connected to the drone: " + d.getDroneId());
	}

	public void showLiveLocation(Drone d) {
		Float lat = d.getLatitude();
		Float lon = d.getLongitude();
		System.out.println("Drone Latitude: " + d.getLatitude());
		System.out.println("Drone Longitude: " + d.getLongitude()); 
	}

}
