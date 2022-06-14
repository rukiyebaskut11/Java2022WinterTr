package practise_basic_day06;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q03_LocalDate01 {

    public static void main(String[] args) {

        String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);

        //what is the result ?

        // String date = LocalDateTime.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
        //System.out.println(date);

        /*
         * A) May 04, 2014T00:00:00:000
         *
         * B) 2014-05-04T00:00:00:000
         *
         * C) 5/4/14T00:00:00:000
         *
         * D) An exception is throw at runtime  **cevap****  :Local Date : günler içindir
         *                                                    LocalDateTime : zaman ı gösterir  sa, dk ,sn
         *
         */

        //link : https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#ISO_LOCAL_DATE




    }
}
