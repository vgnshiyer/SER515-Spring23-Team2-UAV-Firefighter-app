package commandPattern;

public class Drone {

	private String name;

	public Drone(String name) {
		this.name = name;
	}

	public void move(int x, int y) {
		System.out.println(name + " is moving to (" + x + ", " + y + ")");
	}

	public void dropWater() {
		System.out.println(name + " is dropping water");
	}

}
