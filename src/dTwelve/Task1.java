package dTwelve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> avto = new ArrayList<>();
        avto.add("one");
        avto.add("two");
        avto.add("three");
        avto.add("four");
        avto.add("five");
        System.out.println(avto);
        avto.add((avto.size()/2), "six");
//        avto.remove(0);
//        int i = 0;
//        for(String item: avto){
//            System.out.println(avto.get(i));
//            i++;
//        }
        System.out.println(avto);
    }
}
