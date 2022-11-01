package AlishevStudy;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException {
        Map<String, String> spis = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            String inp1 = "";
            String inp2 = "";
            System.out.println("Введи русское слово");
            inp1 = sc.nextLine();
            if (inp1.equals("")) break;
            System.out.println("Введи English слово");
            inp2 = sc.nextLine();
            spis.put(inp1, inp2);
        }
        System.out.println(spis);
        String path = "text";
        String str = "";
        String volume = "";

        File fileIn= new File(path);
        BufferedReader br = new BufferedReader(new FileReader(path));
        while ((str = br.readLine()) != null) {
            volume+=(str+"\n");
        }
        br.close();
        BufferedWriter pw = new BufferedWriter(new FileWriter(path));
        pw.write(volume + "\n");
        for (Map.Entry<String, String> entry: spis.entrySet()) {
//            pw.write(entry.getKey());
//            pw.write(entry.getValue());
            pw.write(entry.getKey() + " - " + entry.getValue() + "\n");
//            pw.println(entry.getKey() + " - " + entry.getValue());
        }
        pw.close();
//        fileIn.read();

        for (Map.Entry<String, String> entry: spis.entrySet()){
            pw.write(entry.getKey() + " - " + entry.getValue());
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
