package dFour;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int common8 = 0;
        int common1 = 0;
        int commonChet = 0;
        int commonNeChet = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int inSize = sc.nextInt();
        Integer[] mas = new Integer[inSize];
        Random random = new Random();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(mas));
        for (int item : mas) {
            System.out.print(item + "  ");
        }
        System.out.println("Length - " + mas.length);
        for (int i : mas) {
            if (i >= 8) {
                common8++;
            }
            if (i == 1) {
                common1++;
            }
            if (i % 2 == 0) {
                commonChet++;
            }
            if (i % 2 != 0) {
                commonNeChet++;
            }
            sum+=i;
        }
        System.out.println(">= 8  --- " + common8);
        System.out.println("= 1  --- " + common1);
        System.out.println("Chet  --- " + commonChet);
        System.out.println("Ne chet  --- " + commonNeChet);
        System.out.println("Summa  --- " + sum);

    }
}