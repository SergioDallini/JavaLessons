package dEight;

public class Task1 {
    public static void main(String[] args) {
        String str ="";
        long before = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++){
            str += (i + " ");
        }
        long after = System.currentTimeMillis();
        System.out.println("Time String - " + (after-before));
        System.out.println(str);
////////////////////////////////////////////////////////////////////////////////
        long before1 = System.currentTimeMillis();
        StringBuilder str1 = new StringBuilder("");
        for (int i = 0; i <= 20000; i++) {
            str1.append(i).append(" ");
        }
        long after1 = System.currentTimeMillis();
        System.out.println("Time StringBuilder - " + (after1-before1));
        System.out.println(str1);
    }
}
