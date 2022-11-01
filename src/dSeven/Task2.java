package dSeven;

public class Task2 {
    static void info1(Player[] mas){
        for (Player pl: mas) {
            System.out.print(pl.getStamina() + " | ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Player[] mas = new Player[6];
        for (int i = 0; i < 6; i++){
            mas[i] = new Player();
            System.out.println(Player.countPlayers);
        }
        Player.info();
//        System.out.println(Player.countPlayers);
//        for (int i = 0; i < 6; i++){
//            System.out.println(mas[i].getStamina());
//        }
        info1(mas);
        while(Player.countPlayers>=3) {
            for (Player pl : mas) {
                pl.run();
            }
            info1(mas);
        }
        Player.info();
        while (mas[5].getStamina() > 0){
            mas[5].run();
        }
        Player.info();
    }
}
