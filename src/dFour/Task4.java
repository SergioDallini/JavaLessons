package dFour;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[10];
        for (int i=0; i < mas.length; i++){
            mas[i] = random.nextInt(20);
            System.out.print(mas[i] + " ");
        }
        //--------------------------------
        int sum = 0;
        int max = 0;
        int maxInd = 0;
        for (int i = 0; i < mas.length-2; i++){
            sum = 0;
            sum += (mas[i]+mas[i+1]+mas[i+2]);
            if (max < sum){
                max = sum;
                maxInd = i;
            }
        }
        System.out.println("\n max - " + max + "\n # - " + maxInd);
    }
}
