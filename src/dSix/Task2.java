package dSix;

public class Task2 {
    public static void main(String[] args) {
        Airplane air1 = new Airplane("Boeing", 2015, 32, 15000);
        air1.info();
        air1.fillUp(200);
        air1.info();
        air1.setYear(2020);
        air1.setWeight(18000);
        air1.fillUp(580);
        air1.info();
    }
}
