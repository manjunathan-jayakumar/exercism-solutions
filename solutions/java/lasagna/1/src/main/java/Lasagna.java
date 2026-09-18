public class Lasagna {

    private int ovenTime = 40;

    private int prepTimePerLayer = 2;

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return (this.ovenTime);
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int timeElapsed) {
        return (this.expectedMinutesInOven() - timeElapsed);
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers) {
        return (this.prepTimePerLayer * numberOfLayers);
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayers, int timeElapsedInOven) {
        return (preparationTimeInMinutes(numberOfLayers) + timeElapsedInOven);
    }

}
