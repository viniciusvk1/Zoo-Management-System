package entities;

public class Birds extends Animals{
    private double wingspan;

    public Birds(String name, int age, double wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

}