import java.util.List;
import java.util.ArrayList;

public class Drone {

	private int id;
	private Float latitude;
	private Float longitude;

	public Drone(int id) {
		this.id = id;
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

	public void setLatLon(Float lat, Float lon) {
		this.setLatitude(lat);
		this.setLongitude(lon);
	}

}
