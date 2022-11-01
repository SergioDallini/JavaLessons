package dSeven;

public class Task1 {
    public static void main(String[] args) {
        Airplane air1 = new Airplane("Boeing", 2015, 38, 20000);
        Airplane air2 = new Airplane("An", 2020, 38, 17000);
        Airplane.compareAirlines(air1, air2);
    }

}
