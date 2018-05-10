package observer;

public class JobHopper implements Observer {

    private String name;

    public JobHopper(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject s) {
        System.out.println(this.name + " got notified!");
        //print job list
        System.out.println(s);
    }
}