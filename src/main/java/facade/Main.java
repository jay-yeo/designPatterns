package facade;

// Create new interface: Garage
// getEngine
// RepairMan should be able to give you back repairFord, repairHonda... the engine and the price of the repair.

public class Main {
    public static void main(String[] args) {

        RepairMan mechanic = new RepairMan();

        mechanic.repairFord();
        mechanic.repairHonda();
        mechanic.repairToyota();
    }}
