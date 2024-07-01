package stqa.exam.preparation;

public class Aircraft {
    private String name;
    private int passengers;
    private IEngine engine;

    public Aircraft(String name, int passengers, IEngine engine) {
        this.name = name;
        this.passengers = passengers;
        this.engine = engine;
    }

    public double calculateTripFuelRequired(int trip) {
        return (engine.calculatConsumption() / 100) * trip;
    }
}
