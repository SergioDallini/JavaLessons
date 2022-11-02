package dTwelve.Task3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        List<MusicBand> listBand = new ArrayList<>();
        List<MusicBand> listBand2000 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String name = "band";
            listBand.add(new MusicBand(name+i, 1980 + (int)(Math.random()*40)));
        }
        boolean circle = true;
        while(circle) {
            for (MusicBand band1 : listBand) {
                System.out.println(band1.getName() + " - " + band1.getYear());
            }
            System.out.println("----------------------------------");
            listBand2000 = groupsAfter2000(listBand);
            System.out.println("Всего 2000-х : " + listBand2000.size() + " из " + listBand.size());
            for (MusicBand band2 : listBand2000) {
                System.out.println(band2.getName() + " - " + band2.getYear());
            }

            System.out.println("Добавить группу? y/n");
            Scanner scanner = new Scanner(System.in);
            String que = scanner.nextLine();
            if (!que.equals("y")) {
                circle = false;
                System.out.println("The end");
            } else {
                circle = true;
                System.out.println("Введите название коллектива и через ; введите год");
                String ans = scanner.nextLine();
                addNewBand(ans, listBand);
                printMembers(listBand);
            }
        }
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> list2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000){
                list2000.add(band);
            }
        }
        return list2000;
    }

      public static void addNewBand(String inp, List<MusicBand> bands) {
        String[] mass = inp.split(";");
        String name = mass[0].trim();
        int year = Integer.parseInt(mass[1].trim());
          bands.add(new MusicBand(name, year));
    }

      public static void printMembers(List<MusicBand> bands){
          for (MusicBand band : bands) {
              System.out.println(band.getName() + " - " + band.getYear());
          }
      }
}
