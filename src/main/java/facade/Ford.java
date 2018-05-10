package facade;

public class Ford implements CarShop, Garage {
    private static int generatedId = 0;

    public void carId() {
        generatedId++;
        System.out.println("F" + generatedId);
    }

    public void price() {
        System.out.println(" 3.000.000 USD");
    }

    public void getEngine() {
        System.out.println("American V8");
    }

}
