public class Pilot extends Person {

	private Drone drone;

	public void update() {

	}

	void assignDrone(Drone drone){
		this.drone = drone;
	}

	Drone getDrone(){
		return this.drone;
	}
}
