public class main {
    public static void main(String[] args){
        Drone drone1 = new Drone(1,1);
        Drone drone2 = new Drone(2,1);
        Drone drone3 = new Drone(1,2);

        Operator operator1 = new Operator(1);
        Operator operator2 = new Operator(2);
        Pilot pilot1 = new Pilot(3);

        // registering person data in drones
        /*
         * drone1 - pack1 - operator1
         * drone2 - pack1 - operator1
         * drone1 - pack1 - pilot1
         * 
         * drone3 - pack2 - operator2
         */
        drone1.addPerson(operator1);
        drone2.addPerson(operator1);
        drone1.addPerson(pilot1);

        drone3.addPerson(operator2);
        
        // registering drone data to operators and pilots - although not reqd for this demonstration
        operator1.addDrone(drone1);
        operator1.addDrone(drone2);
        pilot1.assignDrone(drone1);

        operator2.addDrone(drone3);

        // demonstrating state change for drones
        for(int i = 0; i < 10; i++){
            int droneid = getDroneID(1,3);
            Drone drone = null;
            if(droneid == 1) drone = drone1;
            else if(droneid == 2) drone = drone2;
            else drone = drone3;
            drone.changeState();
        }
    }

    public static int getDroneID(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }
}
