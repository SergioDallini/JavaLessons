package dTwo;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int level = sc.nextInt();
        if (level > 0) {
            String out = switch (level) {
                case 1, 2, 3, 4 -> "Малоэтажный";
                case 5, 6, 7, 8 -> "Среднеэтажный";
                case 9 -> "Многоэтажный";
                default -> throw new IllegalStateException("Unexpected value: " + level);
            };
            System.out.println(out);
        } else throw new IllegalStateException("Unexpected value: " + level);
    }
}
