package dThree;

import java.io.InputStream;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=1;
        double b = 1;
        double res;
        while (b != 0) {
        System.out.println("Enter a");
        a = sc.nextDouble();
        System.out.println("Enter b");
        b = sc.nextDouble();
        res = (a/b);
            System.out.printf("%f\n",res);
        } ;
    }
}
