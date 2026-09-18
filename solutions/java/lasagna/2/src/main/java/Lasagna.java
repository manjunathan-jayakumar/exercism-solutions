public class Lasagna {

    private int ovenTime = 40;

    private int prepTimePerLayer = 2;
    
    public int expectedMinutesInOven() {
        return (this.ovenTime);
    }
    
    public int remainingMinutesInOven(int timeElapsed) {
        return (this.expectedMinutesInOven() - timeElapsed);
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return (this.prepTimePerLayer * numberOfLayers);
    }

    public int totalTimeInMinutes(int numberOfLayers, int timeElapsedInOven) {
        return (preparationTimeInMinutes(numberOfLayers) + timeElapsedInOven);
    }

}
