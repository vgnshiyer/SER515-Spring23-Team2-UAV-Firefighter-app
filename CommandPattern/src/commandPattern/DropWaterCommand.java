package commandPattern;

public class DropWaterCommand implements Command {

	private Drone drone;

	public DropWaterCommand(Drone drone) {
		this.drone = drone;
	}

	public void execute() {
		drone.dropWater();
	}

}
