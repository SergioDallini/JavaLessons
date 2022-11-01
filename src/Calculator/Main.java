package Calculator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map <Integer, RimNums> num = new HashMap<>();
        num.put(1, RimNums.I);
        num.put(2, RimNums.II);
        num.put(3, RimNums.III);
        num.put(4, RimNums.IV);
        num.put(5, RimNums.V);

        System.out.println(num.get(1));

        for (Iterator it  = num.entrySet().iterator(); it.hasNext();){
            Map.Entry entry = (Map.Entry)it.next();
            String val = entry.getValue().toString();
            Object key = entry.getKey();
            System.out.println(key.toString() +" --- " + val);
        }
    }
}

enum RimNums{
    I, II, III, IV, V,
}