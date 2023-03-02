import java.util.List;

public class SuperAdmin implements UAVUser {

	private List drones;

	public SuperAdmin() {
		this.acl = new List<String>;
		this.drones = new List<int>;
		this.acl.add('gps', 'camera', 'sensor');
	}

	public void addDrones(Drone d) {
		this.drones.add(d.getDroneId());
	}

	public void notify() {
		System.out.println("SuperAdmin Notified!");
	}

	public void connectDrones(Drone d) {
		System.out.println("Connected to drone: " + d.getDroneId());
	}

	public void getLiveLocation(Drone d) {
		Float lat = d.getLatitude();
		Float lon = d.getLongitude();
		System.out.println("Latitude: " + d.getLatitude());
		System.out.println("Longitude: " + d.getLongitude());
	}

}
