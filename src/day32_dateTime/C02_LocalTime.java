package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {

    public static void main(String[] args) {

        LocalTime tm = LocalTime.now();
        System.out.println(tm);  //22:09:49.207614

       // bir işlemin ne kadar sürede bittiğini bulmak istersek
        // islemden önce
        // aradaki farkı hesaplayabiliriz
        int sayi = 0;
        for (int i = 0; i <100000 ; i++) {
            sayi+=i;

        }

        System.out.println(tm);  // 22:09:49.207614
                                 // aynı olur çünkü objeyi oluşturduğumuz zamanı alır

        LocalTime tmLoopSonrasi = LocalTime.now();
        System.out.println(tmLoopSonrasi);   //22:15:01.896198800

        double nano1 = tm.getNano();
        double nano2 = tmLoopSonrasi.getNano();

        System.out.println(" islem " + (nano2-nano1) + " nanosaniyede bitti"); //islem 2000000.0 nanosaniyede bitti

        // ileri veya geri gidebiliriz
        System.out.println(tm.plusMinutes(1000));  //15:00:17.205928700

        // istersek zone id kullanarak istediğimiz bölgenin saati içinde obje oluşturabiliriz



    }
}
