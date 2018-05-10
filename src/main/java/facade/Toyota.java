package facade;

public class Toyota implements CarShop, Garage {
    private static int generatedId = 0;

    public void carId() {
        generatedId++;
        System.out.println("T" + generatedId);
    }

    public void price() {
        System.out.println(" 2.000.000 USD");
    }

    public void getEngine() {
        System.out.println("Japanese V6");
    }

}
