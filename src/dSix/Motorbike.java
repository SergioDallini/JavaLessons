package dSix;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model){
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    void info(){
        System.out.println("This is moto " + getModel());
    }
    void diff(){
        System.out.println(this.getYear() + " - " + (2022 - this.getYear()));
    }
}
