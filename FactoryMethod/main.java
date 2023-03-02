public class main {
    public static void main(String[] args) {

        Drone d1 = new Drone(1);
        d1.setLatLon(359.1, 124.5);
        
        GetUserFactory uFact = new GetUserFactory();
        
        UAVUser superAdmin = uFact.getUser('SuperAdmin');
        UAVUser pilot = uFact.getUser('Pilot');
        UAVUser operator = uFact.getUser('Operator');
        
        superAdmin.addDrones(d1);
        superAdmin.connectDrones(d1);
        superAdmin.notify();
        
        pilot.addDrones(d1);
        pilot.connectDrones(d1);
        pilot.notify();
        
        Drone d2 = new Drone(2);
        d2.setLatLon(382.3, 124.5);
        
        superAdmin.addDrones(d2);
        superAdmin.connectDrones(d2);
        superAdmin.notify();
        
        operator.addDrones(d2);
        operator.connectDrones(d2);
        operator.notify();
        
        Drone d3 = new Drone(3);
        d3.setLatLon(320.4, 130.6);

        superAdmin.addDrones(d3);
        superAdmin.connectDrones(d3);
        superAdmin.notify();
        
    }

}