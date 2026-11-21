class NeedForSpeed {

    final int speed;
    final int batteryDrain;
    int battery = 100;
    int travelledDistance = 0;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return travelledDistance;
    }

    public void drive() {
        if (battery >= batteryDrain) {
            battery -= batteryDrain;
            travelledDistance += speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    private final int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return distance <= Math.floorDiv(car.battery, car.batteryDrain) * car.speed;
    }
}
