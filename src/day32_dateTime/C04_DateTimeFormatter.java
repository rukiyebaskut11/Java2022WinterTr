package day32_dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {

    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/M/YYYY");

        System.out.println(formatter.format(tarihSaat)); //31/3/2022

        DateTimeFormatter formatterSaat = DateTimeFormatter.ofPattern("HH:mm:ss a");  // 22:55:27 ÖS
        System.out.println(formatterSaat.format(tarihSaat));  //22 : 52
        /*
         format olustururken
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini

         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami

         YY : yilin son iki rakamini
         YYYY : Yilin tamamini


         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati

         h  : 12 saat dilimine göre 2 rakam olarak
         hh : 12 saat dilimine göre tek rakam olanları tek olarak

         m  : minute tek rakamları tek

         mm : tek rakamları 08 gb
         a yazarsak AM veya PM degerini yazar


         */


    }
}
