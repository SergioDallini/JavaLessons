package Calculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {
    int a = 0;
    int b = 0;

    public static int rimTo10(String str){
        int dig = 0;
        switch (str) {

            case "I":
                dig = 1;
                break;
            case "II":
                dig = 2;
                break;
            case "III":
                dig = 3;
                break;
            case "IV":
                dig = 4;
                break;
            case "V":
                dig = 5;
                break;
            case "VI":
                dig  = 6;
                break;
            case "VII":
                dig = 7;
                break;
            case "VIII":
                dig = 8;
                break;
            case "IX":
                dig = 9;
                break;
            case "X":
                dig = 10;
                break;
            default:
                dig = Integer.parseInt(str);
        }
        return dig;
    }
    public static void main(String[] args) {

        int dig10 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение:");
        String s = sc.nextLine();

        if((s.indexOf("+")>0) || (s.indexOf("-")>0)|| (s.indexOf("*")>0)|| (s.indexOf("/")>0)){
            System.out.println("Ok");

            if((s.indexOf("+")>0)){
                String a = s.substring(0,s.indexOf('+'));
                String b = s.substring(s.indexOf('+')+1, s.length());
//                Pattern pattern1 = Pattern.compile ("[IV]");
//                Matcher matcher = pattern1.matcher(a);
//                if(matcher.find())
                if (String.valueOf(a) != null) {
                    System.out.println(rimTo10(a) + rimTo10(b));
                } else{
                    System.out.println(String.valueOf(a) + String.valueOf(b));
                }
            }
            if((s.indexOf("-")>0)){
                String a = s.substring(0,s.indexOf('-'));
                String b = s.substring(s.indexOf('-')+1, s.length());
                System.out.println(rimTo10(a)-rimTo10(b));
            }
            if((s.indexOf("*")>0)){
                String a = s.substring(0,s.indexOf('*'));
                String b = s.substring(s.indexOf('*')+1, s.length());
                System.out.println(rimTo10(a)*rimTo10(b));
            }
            if((s.indexOf("/")>0)){
                String a = s.substring(0,s.indexOf('/'));
                String b = s.substring(s.indexOf('/')+1, s.length());
                System.out.println(Double.parseDouble(String.valueOf(rimTo10(a)/rimTo10(b))));
            }
        } else {
            System.out.println("Капец!!!");
        }
    }
}
