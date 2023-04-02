package entities;

public class Mammals extends Animals {
    private String coatColor;

    public Mammals(String name, int age, String coatColor) {
        super(name, age);
        this.coatColor = coatColor;
    }

    public String getCoatColor() {
        return coatColor;
    }   

}