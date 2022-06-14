package practise_basic_day06;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q10_Varargs01 {

    // istedigimiz kadar sayi girdigiimizde
    // toplamlari bize veren bir method yazalim...

    static int toplam;

    public static void main(String[] args) {


        // Not ; Var-args ---> Arguman cesitliligi
        // Var --->variety args--->arguments

        Scanner scan = new Scanner(System.in);

        int sayi = 1;

        while (sayi > 0) {
            System.out.println("istediginiz kadar sayi giriniz : " + " \nSayilarin toplami icin 0 a basınız");
           sayi = scan.nextInt();
           sayiToplama(sayi);

        }

    }

    private static void sayiToplama(int ...sayi) {
          toplam = 0;

        for (int each:sayi
             ) {
            toplam+=each;

        }

        System.out.println(toplam);
    }
}

