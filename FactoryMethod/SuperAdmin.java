import java.util.List;

public class SuperAdmin implements UAVUser {

	private List acl;

	private List drones;

	public SuperAdmin() {
		this.acl = new List<String>;
		this.drones = new List<String>;
	}

	public void notify() {

	}

	public void connectDrones() {

	}

	public void monitorHealth() {

	}

	public void setMissionComplete() {

	}

	public void getLiveLocation() {

	}

	public void releasePilot() {

	}

	public void getFireUpdates() {

	}
}
