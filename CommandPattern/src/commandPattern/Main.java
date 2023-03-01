
public class Main {
 public static void main(String[] args) {

    Drone drone1 = new Drone("Drone 1");
    Drone drone2 = new Drone("Drone 2");
    Pilot pilot = new Pilot();

    Command moveCommand = new MoveCommand(drone1, 10, 20);
    pilot.setCommand(moveCommand);
    pilot.executeCommand();

    Command dropWaterCommand = new DropWaterCommand(drone1);
    pilot.setCommand(dropWaterCommand);
    pilot.executeCommand();

    moveCommand = new MoveCommand(drone2, 55, 65);
    pilot.setCommand(moveCommand);
    pilot.executeCommand();

    dropWaterCommand = new DropWaterCommand(drone2);
    pilot.setCommand(dropWaterCommand);
    pilot.executeCommand();
 }
}