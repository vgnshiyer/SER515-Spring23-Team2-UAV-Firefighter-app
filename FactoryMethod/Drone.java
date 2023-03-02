import java.util.List;
import java.util.ArrayList;

public class Drone {

	private int id;
	private Float latitude;
	private Float longitude;
	private GetUserFactory getUserFactory;

	public Drone(int id) {
		this.id = id;
		this.getUserFactory = new GetUserFactory();
	}

	public int getDroneId() {
		return this.id;
	}

	public void setLatitude(Float lat) {
		this.latitude = lat;
	}

	public void setLongitude(Float lon) {
		this.longitude = lon;
	}

	public Float getLatitude() {
		return this.latitude;
	}

	public Float getLongitude() {
		return this.longitude;
	}

}
