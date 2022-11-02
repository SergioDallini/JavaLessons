package AlishevStudy;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public  class  Test {
    public static void main(String[] args) {
//        ////////////////////////////////HASH MAP///////////////////////////////////////
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "One");
//        map.put(2, "Two");
//        map.put(3, "Three");
//        for(Map.Entry<Integer, String> entry: map.entrySet()){
//            System.out.print(entry.getKey() + " - " + entry.getValue() + " || ");
//        }
//        System.out.println();
//        ////////////////////////////////LINKED HASH MAP///////////////////////////////////////
//        Map<String, String> transl = new HashMap<>();
//        transl.put("кошка", "cat");
//        transl.put("собака", "dog");
//        transl.put("слон", "elephant");
//
//        for (Map.Entry<String, String> entry: transl.entrySet()){
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }
        Map<Integer, String> hashMap= new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();
//        testMap(treeMap);
        System.out.println(fib1(20));
    }
    public static void testMap(Map<Integer, String> map){
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Tom");
        map.put(0, "Tim");
        map.put(1500, "Lewis");
        map.put(7, "Bob");
        String i = "hjg";
        for (Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
    public static int fib1(int n){
        if (n < 2){ return n;}
        return fib1(n-1)+fib1(n-2);
    }

}
//class Fib3{
//    static Map<Integer, Integer> memo = new HashMap<>(Map.of(0, 0, 1, 1));
//    static int fib3(int n){
//
//    }
//}
