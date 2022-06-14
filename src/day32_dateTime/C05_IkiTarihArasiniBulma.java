package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {

    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu = LocalDate.of(1986,05,20);

        System.out.println(Period.between(dogumGunu,bugun));  //P35Y10M11D

        System.out.println(Period.between(dogumGunu,bugun).getYears());  // 35



    }
}
