package practise_basic_day06;

import java.time.LocalDate;

public class Q08_LocalDate06 {

    public static void main(String[] args) {

        // Bugunun tarihi aliniz, yazdiriniz...

        // Daha Sonra 1 gun, 1 Ay ve 1 yil ekleyerek degisen tarihi yazdiriniz..

        // Degisen tarih uzerinden 3 gun, 2 ay ve 5 yil eksilterek son tarihi yaziniz..

        LocalDate bugun = LocalDate.now();
        System.out.println("bugun = " + bugun);  // bugun = 2022-04-04

        LocalDate degisenTarih = bugun.plusDays(1).plusMonths(1).plusYears(1);
        System.out.println("degisenTarih = " + degisenTarih);  // degisenTarih = 2023-05-05

        LocalDate sonTarih = degisenTarih.minusDays(3).minusMonths(2).minusYears(5);
        System.out.println("sonTarih = " + sonTarih);   // sonTarih = 2018-03-02
    }
}
