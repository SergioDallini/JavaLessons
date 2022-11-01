package dFive;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(1988);
        car1.setColor("gray");
        car1.setModel("audi 100");
        Car car2 = new Car(2000, "white", "mercedes");
        Car car3 = new Car(2010, "silver", "volkswagen");
        car1.about();
        System.out.println("");
        car2.about();
        System.out.println("");
        car3.about();
    }
}
