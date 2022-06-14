package practise_basic_day06;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Q07_LocalDate05 {


    public static void main(String[] args) {




       /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        // zaman cetveli tanımlanmıştır

                                                 // period class dan p objemiz var
        Period p = Period.ofDays(1).ofYears(2);  // periyotta en dıştaki geçerli olur
                                                 // en son olan (yani 2 yıl) geçerli olur
                                                 // öncekileri geçersiz kılar



        d = d.minus(p);  // minus geriye gider, yukardan aldıgı 2 yılı geriye götürerek 2013 olarak atama yapar.


        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        System.out.println(d.format(f));    // 10.05.2013 11:22

       /*
            A. 5/9/13 11:22
            B. 5/10/13 11:22  ***cevap***
            C. 5/9/14
            D. 5/10/14
            E. The code does not compile.
            F. A runtime exception is thrown.

        */

    }
}
