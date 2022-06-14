package practise_basic_day06;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Q09_ZoneDateTime {

    // Baska ülke veya bolgelerin saat dilimine gore zamani alma
    // Newyork un saat dilimine gore saat ?

    public static void main(String[] args) {

        // zoneId link : https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html

        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("America/New_York"));

        ZonedDateTime zdtLocal = ZonedDateTime.now();  // yerelde bulundugunuz yerin zamanını verir

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy  HH:mm");  // istenilen formatta

        System.out.println("zdt = " + zdt.format(format));      // zdt = 04.04.2022  16:44
        System.out.println("zdtLocal = " + zdtLocal.format(format));  // zdtLocal = 04.04.2022  23:44

    }
}
