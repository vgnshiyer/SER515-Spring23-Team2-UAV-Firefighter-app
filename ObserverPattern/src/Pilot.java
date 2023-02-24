public class Pilot extends Person {

	private Drone drone;

	public void update(Drone drone) {
		System.out.println("Notification for pilot :");
		System.out.println("Drone "+drone.getID()+" has entered "+drone.getState()+" state");
		System.out.println();
	}

	void assignDrone(Drone drone){
		this.drone = drone;
	}

	Drone getDrone(){
		return this.drone;
	}
}
