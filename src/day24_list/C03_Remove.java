package day24_list;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {

        List<Integer> sayılar = new ArrayList<>();

        sayılar.add(5); //[5]
        sayılar.add(3); //[5,3]
        sayılar.add(0,7);  // [7,5,3]
        sayılar.add(2,7);  // [7,5,7,3]

        sayılar.remove(3);  // index olarak 3 deki elementi siler
        // sayılar.remove(5);  // IndexOutOfBoundsException

        /*
        sayılardan oluşan bir List de objeyi vererek element silme  method u çalışmaz
        sayı değeri girdiğimizde Java otomatik olarak sayıyı index kabul eder
         */

        // int sayı=5;    // burada primitive olduğu için kabul etmedi
        // sayılar.remove(sayı);  // IndexOutOfBoundsException

        Integer sayı=5;    //Integer wrapper class ı kullanınca sayı obje olduğundan
                           // bu method çalıştı(burada obje olduğu için kabul etti)
        sayılar.remove(sayı);
        System.out.println(sayılar);  //[7, 7]

    }
}
