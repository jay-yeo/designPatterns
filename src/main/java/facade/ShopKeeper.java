package facade;

public class ShopKeeper {
    private CarShop honda;
    private CarShop toyota;
    private CarShop ford;

    public ShopKeeper() {
        honda = new Honda();
        toyota = new Toyota();
        ford = new Ford();
    }

    public void hondaSale() {
        honda.carId();
        honda.price();
    }

    public void toyotaSale() {
        toyota.carId();
        toyota.price();
    }

    public void fordSale() {
        ford.carId();
        ford.price();
    }


}
