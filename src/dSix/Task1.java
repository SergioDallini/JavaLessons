package dSix;


public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(1988);
        car1.setColor("gray");
        car1.setModel("audi 100");
        Car car2 = new Car(2000, "white", "mercedes");
        Car car3 = new Car(2010, "silver", "volkswagen");
        Motorbike moto1 = new Motorbike(2020, "red", "honda");
        System.out.println(moto1.getColor() + " " + moto1.getModel() + " " + moto1.getYear());
//        car1.about();
//        System.out.println("");
//        car2.about();
//        System.out.println("");
//        car3.about();
        car1.info();
        car2.info();
        car3.info();
        moto1.info();
        car1.diff();
        moto1.diff();
    }
}
