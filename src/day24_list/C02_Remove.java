package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("oguzhan");

        System.out.println(isimler);

        // remove (istenenObject) methodu istenen elementi kaldırıp
        // bize true/fale döner
        // eğer remove işleminin yapıldığını kontrol etmek istiyorsanız
        // method u boolean bir variable a atayabilirsiniz

       boolean sonuc= isimler.remove("oguzhan");  // true

        // sonucu kullaniciya yazdirmak isterseniz
        // if/else ile istediginiz degerlendirmeyi yazabilirsiniz


        if (sonuc==true){
            System.out.println("istediğiniz isim silindi");
        }else {
            System.out.println("istediğiniz isim listede olmadığı için silinemedi");
        }

        System.out.println(isimler);  //[Aykut, Yusuf, Ilker]



        sonuc = isimler.remove("Berk");

        if (sonuc==true){
            System.out.println("istediğiniz isim silindi");
        }else {
            System.out.println("istediğiniz isim listede olmadığı için silinemedi");
        }

        // remove(index) yazdığımızda sildim/silmedim ihtimali kalmaz
        // bize remove edilen elementi döner

        //System.out.println(isimler.remove(1));  // Yusuf'u siler ve
           isimler.remove(1);                                           // delil olarak Yusuf ismini bize döndürür

        // yazdırsakda yazdırmasak da liste değişti ve 1.index deki element değişti

        System.out.println(isimler);  // [Aykut, Ilker]



    }
}
