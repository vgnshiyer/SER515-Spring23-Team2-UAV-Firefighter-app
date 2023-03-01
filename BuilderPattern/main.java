public class main {
    public static void main(String[] args){

        /* wing types : fixed-wing, rotary-wing, flapping-wing */
        /* weight capacities : micro (< 1 kg), miniature (1–25 kg), and heavier (> 25 kg)  */
        /* flight endurance : short (< 5 h, < 100 km), medium (5–24 h, 100–400 km), and long/range (> 24 h, > 1500 km)  */
        
        // Notice that in both initializations, we have different set of attributes available.. Which demonstrates the power of the builder pattern. By using this pattern we do not need to add multiple constructor overloading the different combination of parameters. 
        UAV uav1 = new UAV.UAVBuilder(1, 1)
        .setBatteryPower(5000)
        .setWingType("fixed-wing")
        .setFlightEndurance("long")
        .build();

        UAV uav2 = new UAV.UAVBuilder(1, 1)
        .setBatteryPower(5000)
        .setWingType("rotary")
        .setOtherFeatures("efficient")
        .build();
    }
}
