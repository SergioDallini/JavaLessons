package dSix;

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

    void  fillUp(int vol){
        this.fuel+=vol;
    }
}
