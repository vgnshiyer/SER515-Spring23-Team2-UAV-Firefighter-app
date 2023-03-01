package commandPattern;

public class MoveCommand implements Command {

	private int x;

	private int y;

	private Drone drone;

	public MoveCommand(Drone drone, int x, int y) {
		this.drone = drone;
        this.x = x;
        this.y = y;
	}

	public void execute() {
		drone.move(x, y);
	}

}
