package facade;

public class RepairMan {
    private Garage honda;
    private Garage toyota;
    private Garage ford;

    public RepairMan() {
        honda = new Honda();
        toyota = new Toyota();
        ford = new Ford();
    }

    public void repairHonda() {
        honda.carId();
        honda.getEngine();
    }

    public void repairToyota() {
        toyota.carId();
        toyota.getEngine();
    }

    public void repairFord() {
        ford.carId();
        ford.getEngine();
    }

}
