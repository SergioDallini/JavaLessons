package dTwelve;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 30; i++){
            if (i % 2 == 0){
                list.add(i);
            }
        }
        for (int i = 300; i <= 350; i++){
            if (i % 2 == 0){
                list.add(i);
            }
        }
        str.append(list);
        System.out.println(str);
    }
}
