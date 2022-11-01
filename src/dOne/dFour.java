package dOne;

public class dFour {
    public static void main(String[] args) {
        int a = 3;
        int ans = 0;
        for(int x = 1; x <= 10; x++){
            ans = x * a;
            System.out.printf("%d * %d = %d\n", x, a, ans);
        }
    }
}
