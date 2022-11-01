package dFive;

public class Car {
    private int year;
    static int num = 0;
    private String color;
    private String model;
    private  int number;
    public Car(){
        num++;
        this.number = num;
    }
    public Car(int year, String model, String color){
        this.year = year;
        this.color = color;
        this.model = model;
        num++;
        this.number = num;
    }

    public void setYear(int year){
        this.year = year;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getYear(){
        return year;
    }
    public int getNumber(){
        return number;
    }
    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }
    public void about(){
        System.out.println("Авто - "+ getNumber() + "\nМодель - " + getModel() + "\nЦвет - " + getColor() + "\nГод выпуска - " + getYear());
    }
}
