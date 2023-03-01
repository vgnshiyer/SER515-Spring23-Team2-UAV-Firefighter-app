
public class Main {
 public static void main(String[] args) {

    Drone drone = new Drone("Drone 1");
    Pilot pilot = new Pilot();

    Command moveCommand = new MoveCommand(drone, 10, 20);
    pilot.setCommand(moveCommand);
    pilot.executeCommand();

    Command dropWaterCommand = new DropWaterCommand(drone);
    pilot.setCommand(dropWaterCommand);
    pilot.executeCommand();
 }
}