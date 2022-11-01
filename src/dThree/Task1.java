package dThree;

import java.util.Objects;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans;
        String inp ;
//        do{
//             inp = sc.nextLine();
//             ans = switch (inp) {
//                 case "Москва", "Владивосток", "Ростов" -> "Россия";
//                 case "Рим", "Милан", "Турин" -> "Италия";
//                 default -> "Unknown country";
//             };
//            System.out.println(ans);
//            }
//         while (!inp.equals("стоп"));
    while (true){
        System.out.println("Enter city");
        inp = sc.nextLine();
        if (inp.equals( "стоп")){
            break;
        }
        ans = switch (inp){
            case "Москва", "Ростов" -> "Россия";
            case "Рим", "Милан" -> "Италия";
            default -> "Неизвестно";
        };
        System.out.println(ans);
    }
    }

}
