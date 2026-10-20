public class CarsAssemble {

    private int successRateEstimater(int speed) {
        if (speed >= 1 && speed <= 4) { 
            return 100;
        } else if (speed >= 5 && speed <= 8) {
            return 90;
        } else if (speed == 9) {
            return 80;
        } else if (speed == 10) {
            return 77;
        } else { return 0; }
    }

    private int productionRateConstant = 221;
    
    public double productionRatePerHour(int speed) {
        return (productionRateConstant * speed) * (successRateEstimater(speed)/100.00);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60.0);
    }
}
