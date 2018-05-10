package facade;

public class Honda implements CarShop, Garage {
    private static int generatedId = 0;

    public void carId() {
        generatedId++;
        System.out.println("H" + generatedId);
    }

    public void price() {
        System.out.println(" 1.000.000 USD");
    }

    public void getEngine() {
        System.out.println("Japanese V6");
    }


}
