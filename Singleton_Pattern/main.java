public class main {
    public static void main(String[] args) {
        Pack pack = Pack.getInstance();
        
        Drone drone1 = new Drone(1);
        pack.addDrone(drone1);

        Drone drone2 = new Drone(2);
        pack.addDrone(drone2);
    }
}