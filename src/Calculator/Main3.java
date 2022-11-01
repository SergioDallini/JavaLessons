package Calculator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {

        public static String calc (String input)throws Exception{
        String result = "";
        String resultNum = "";
            Pattern pattern1 = Pattern.compile ("\\d\\ *[\\Q+-*/\\E]\\ *\\d");
            Matcher matcher1 = pattern1.matcher(input);
            Pattern pattern2 = Pattern.compile ("[IVX]+\\ *[\\Q+-*/\\E]\\ *[IVX]+");
            Matcher matcher2 = pattern2.matcher(input);
                if(matcher1.find()){
                    result = calcProcess(getABArab(input), input);
                }else if (matcher2.find()){
                    result = decToRim1(calcProcess(getABRim(input), input));
                } else {
                throw new Exception("В одном выражении используй только Римские или Арабские цифры и знаки + - * /!!!");
            }
        return result;
    }
    //----------------------------------------------------------------------------------------
    static String[] getABArab(String s) throws Exception {

        Pattern patternA = Pattern.compile("\\d+");
        Matcher matchA = patternA.matcher(s);

        String[] dataAB = new String[2];
        int i = 0;
        while (matchA.find()) {
            dataAB[i] = matchA.group();
            i++;
        }
        return dataAB;
    }
//---------------------------------------------------------------------------------------
static String[] getABRim(String s) throws Exception {

    Pattern patternB = Pattern.compile("[IVX]+");
    Matcher matchB = patternB.matcher(s);

    String[] dataAB = new String[2];
    String[] dataABNew = new String[2];
    int i = 0;
    while (matchB.find()) {
        dataAB[i] = matchB.group();
        i++;
    }
    String a = dataAB[0];
    String b = dataAB[1];
    dataABNew[0] = String.valueOf(rimToDec(a));
    dataABNew[1] = String.valueOf(rimToDec(b));
     return dataABNew;
}
    //---------------------------------------------------------------------------------------
    static String calcProcess(String[] dataAB, String s) throws Exception {
        int resOper = 0;
        int res = 0;

        String a = dataAB[0];
        String b = dataAB[1];
        String sign = "";
        //Определение типа арифм.  опер. (Знака)
        Pattern pattern = Pattern.compile ("[\\Q+-*/\\E]");
        Matcher matcher = pattern.matcher(s);
        if(matcher.find()) {
            sign = matcher.group();
        }
        switch (sign){
            case "+": res = Integer.parseInt(a) + Integer.parseInt(b);
                break;
            case "-": res = Integer.parseInt(a) - Integer.parseInt(b);
                break;
            case "*": res = Integer.parseInt(a) * Integer.parseInt(b);
                break;
            case "/": res = Integer.parseInt(a) / Integer.parseInt(b);
                break;
            default: throw new Exception("Допустимы только арифметические знаки + - * / !!!");
        }
        return String.valueOf(res);
    }

    public static int rimToDec(String str){
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
//-----------------------------------------------------------------------------------
public static String decToRim(String str){
    String dig = "";
    switch (str) {
        case "1":
            dig = "I";
            break;
        case "2":
            dig = "II";
            break;
        case "3":
            dig = "III";
            break;
        case "4":
            dig = "IV";
            break;
        case "5":
            dig = "V";
            break;
        case "6":
            dig  = "VI";
            break;
        case "7":
            dig = "VII";
            break;
        case "8":
            dig = "VIII";
            break;
        case "9":
            dig = "IX";
            break;
        case "10":
            dig = "X";
            break;
    }
    return dig;
}
//-------------------------------------------------------------------------
//000000000000000000000000000000000000000000000000000000000000000000000000
public static String decToRim1(String str){
    char[] mas = new char[str.length()];
    mas = str.toCharArray();
    String dig="";
    String symb = "";

    int num = Integer.parseInt(str);



//    dig = switch (num){
//        case 1 -> "";
//        case 2 -> "X";
//        default -> throw new IllegalStateException("Unexpected value: " + num);
//    };
    
//    switch (Integer.parseInt(str)){
//        case 1 :
//            dig = "";
//            break;
//        case 2 :
//            dig = "X";
//            break;
//        case 3 :
//            dig = "XX";
//            break;
//        case 4 :
//            dig = "XXX";
//            break;
//    }
    if(mas.length > 1){
        if(num > 0 && num < 10){
            symb = "";
        } else if(num > 10 && num < 20){
            symb = "X";
        } else if (num >= 20 && num < 30){
            symb = "XX";
        }else if (num >= 30 && num < 40){
            symb = "XXX";
        }else throw new IllegalStateException("Unexpected value: " + num);
    }
 //   for (char item: mas){
 //       switch (String.valueOf(item)) {
        switch (String.valueOf(mas[mas.length-1])) {
            case "1":
                dig = "I";
                break;
            case "2":
                dig = "II";
                break;
            case "3":
                dig = "III";
                break;
            case "4":
                dig = "IV";
                break;
            case "5":
                dig = "V";
                break;
            case "6":
                dig = "VI";
                break;
            case "7":
                dig = "VII";
                break;
            case "8":
                dig = "VIII";
                break;
            case "9":
                dig = "IX";
                break;
            case "10":
                dig = "X";
                break;
        }
        symb += dig;
//    }
    return symb;
}
//-------------------------------------------------------------------------
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение:");
        String str = sc.nextLine();
            System.out.println(calc(str));
    }
}