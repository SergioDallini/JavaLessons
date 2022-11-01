package dThree;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i <= 5){
            System.out.println("Enter a");
            double a = sc.nextDouble();
            System.out.println("Enter b");
            double b = sc.nextDouble();
            i++;
            if (b == 0){
                System.out.println("Division by 0");
                continue;
            }
            System.out.println(a/b);

        }
    }
}
