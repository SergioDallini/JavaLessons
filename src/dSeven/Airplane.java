package dSeven;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public int getFuel() {
        return fuel;
    }
    void info(){
        System.out.println("Изготовитель: " + this.producer + " год выпуска: " + this.year + " длина: " +
                this.length +  " вес: " + this.weight + " Кол-во топлива: " + this.fuel);
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    void  fillUp(int vol){
        this.fuel+=vol;
    }

    public static void compareAirlines(Airplane air1, Airplane air2){
        if (air1.getLength() > air2.getLength()){
            System.out.println(air1.producer + " longer");
        } else if (air2.getLength() > air1.getLength()) {
            System.out.println(air2.producer + " longer");
        } else System.out.println("equals");
    }
}
