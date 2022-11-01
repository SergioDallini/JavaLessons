package AlishevStudy;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        String path = "text";
        File file = new File(path);
        String str = "";
        BufferedReader br = new BufferedReader(new FileReader(file));
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
    }
}
