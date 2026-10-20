public class JedliksToyCar {

    private int odo;

    private int battery = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + odo + " meters";
    }

    public String batteryDisplay() {
        if (battery == 0) { return "Battery empty"; }
        return "Battery at " + battery + "%";
    }

    public void drive() {
        if (battery == 0) { return; }

        odo = odo + 20;
        battery = battery - 1;
    }
}
