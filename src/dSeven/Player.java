package dSeven;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    static int countPlayers = 0;

    public Player() {
        if (countPlayers == 6) return;
        else {
            this.stamina = (int) (Math.random() * 10 + 90);
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    void run(){
        if (this.stamina == 0) return;
        this.stamina--;
        if (this.stamina == MIN_STAMINA){
            countPlayers--;
        }
    }
    static void info(){
        if (countPlayers == 6){
            System.out.println("Команды полные!");
        } else System.out.println("Команды неполные. На поле " + (6-countPlayers) + "свободных мест!");
    }
}
