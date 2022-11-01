package dFour;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int [][] arr = new int[12][8];
        int[] sum = new int[arr.length];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = random.nextInt(50);
            }
        }
        //-------------Поиск макс------------

        for(int i = 0; i < arr.length; i++){
            sum[i] = 0;
            int sumTemp = 0;
            for (int j = 0; j < arr[i].length; j++){
                sumTemp += arr[i][j];
                sum[i] = sumTemp;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" - sum = " + sum[i]);
            System.out.println();
        }
        int max = sum[0];
        int ray = 0;
        for (int i = 0; i < sum.length; i++){
            if (max <= sum[i]){
                max = sum[i];
                ray = i;

            }System.out.print(sum[i] +"  ");
        }
        System.out.println("ray - " + ray);
    }
}
