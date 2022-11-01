package dEleven;

public class Task1 {
    public static void main(String[] args) {
        WareHouse sklad = new WareHouse();
        Picker picker = new Picker(sklad);
        Courier courier = new Courier(sklad);


        picker.doWork();
        courier.doWork();

        System.out.println(sklad);
        System.out.println(picker);
        System.out.println(courier);

        for (int i = 0; i < 3; i++){
            picker.doWork();
            courier.doWork();
            System.out.println(sklad);
        }
        System.out.println(sklad);
        System.out.println(picker);
        System.out.println(courier);
    }
}
