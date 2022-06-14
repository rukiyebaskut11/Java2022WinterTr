package day21_arrays;

import java.util.Arrays;

public class C03_Arrays {

    public static void main(String[] args) {

        int arr[]; //değer ataması yapmadık ama java kabul etti
                   //ancak kullanmamıza izin vermez

        arr= new int[6];

        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0]

        System.out.println(arr.length); // 6
                                        // String deki lenght() , bunda yok

        // array daki her bir elemanı index değeri kadar arttıralım

        for (int i = 0; i <arr.length ; i++) {
            arr[i] += i;

        }

        System.out.println(Arrays.toString(arr));

        // son index deki elementi yazdıralım

        System.out.println(arr[arr.length-1]); // 5

    }
}
