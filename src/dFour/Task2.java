package dFour;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        Random random = new Random();
        for(int i = 0; i < mas.length; i++){
            mas[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(mas));
        int max = mas[0];
        int min = mas[0];
        int item0 = 0;
        for (int i : mas){
           if(max < i) max = i;
           if(i%10 == 0) item0++;
           if(i < min) min = i;
        }
        System.out.println("MAX = " + max);
        System.out.println("MIN = " + min);
        System.out.println("0 = " + item0);
    }
}
