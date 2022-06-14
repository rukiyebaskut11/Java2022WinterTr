package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_ListedenTekrarlıElementleriSilme {
    public static void main(String[] args) {

        // verilen bir listede tekrar eden sayıları sadece bir kere yazdıran
        // bir method oluşturun
        // ör: [1, 3, 5, 3, 5, 6, 1, 7]
        // output [1, 3, 5, 6, 7]

        List<Integer> sayilar= new ArrayList<>();

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        tekrarsızListeOlustur(sayilar);

    }

    public static void tekrarsızListeOlustur(List<Integer> sayilar) {

        List<Integer> tekrarsızList = new ArrayList<>();

        for (int i = 0; i <sayilar.size() ; i++) {

            if (!tekrarsızList.contains(sayilar.get(i))){ // içermiyorsa
                tekrarsızList.add(sayilar.get(i));
            }

        }
        System.out.println(tekrarsızList);  //[1, 3, 5, 6, 7]
    }
}
