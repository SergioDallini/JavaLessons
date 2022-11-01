package Calculator;

import javax.swing.*;

public class CalcWind {
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
        String ansStr = "";
        double ans = 0;
        String s = JOptionPane.showInputDialog("Введите выражение:");
        if((s.indexOf("+")>0) || (s.indexOf("-")>0)|| (s.indexOf("*")>0)|| (s.indexOf("/")>0)){
            if((s.indexOf("+")>0)){
                String a = s.substring(0,s.indexOf('+'));
                String b = s.substring(s.indexOf('+')+1, s.length());
                if (String.valueOf(a) != null) {
                    ans = (rimTo10(a) + rimTo10(b));
                } else{
                    ans = Double.parseDouble((String.valueOf(a) + String.valueOf(b)));
                }
            }
            if((s.indexOf("-")>0)){
                String a = s.substring(0,s.indexOf('-'));
                String b = s.substring(s.indexOf('-')+1, s.length());
                if (String.valueOf(a) != null) {
                    ans = (rimTo10(a) - rimTo10(b));
                } else{
                    ans = Double.parseDouble(a) - Double.parseDouble(b);
                }
            }
            if((s.indexOf("*")>0)){
                String a = s.substring(0,s.indexOf('*'));
                String b = s.substring(s.indexOf('*')+1, s.length());
                if (String.valueOf(a) != null) {
                    ans = (rimTo10(a) * rimTo10(b));
                } else{
                    ans = Double.parseDouble(a) * Double.parseDouble(b);
                }
            }
            if((s.indexOf("/")>0)){
                String a = s.substring(0,s.indexOf('/'));
                String b = s.substring(s.indexOf('/')+1, s.length());
                if (String.valueOf(a) != null) {
                    ans = (rimTo10(a) / rimTo10(b));
                } else{
                    ans = Double.parseDouble(a) / Double.parseDouble(b);
                }
            }
        } else {
            System.out.println("Капец!!!");
        }
        JOptionPane.showMessageDialog(null, ans, "Ответ", JOptionPane.INFORMATION_MESSAGE);
    }
}
