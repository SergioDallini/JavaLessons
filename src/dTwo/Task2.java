package dTwo;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        int a = sc.nextInt();
        System.out.println("Enter B:");
        int b = sc.nextInt();
        for (int i = a; i <= b; i++){
            if ((i % 5 == 0)  && (i % 10 != 0)){
                System.out.println(i);
            } else continue;
        }
    }
}
