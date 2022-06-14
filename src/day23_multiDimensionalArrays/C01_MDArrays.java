package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {

        int arr[][]={{3,1,7},{6,10,2}};   //kaç tane süslü parantez yan yana geliyorsa katını gösterir yandaki iki katlı ..

        System.out.println(arr[0][2]); //7
        System.out.println(arr[1][1]); //10

        // ilk inner array ın tüm elementlerini yazdırın

        System.out.println(arr[0]);  //[I@1b28cdfa   arr[0] bir array olduğu için direk kullanılamaz referansı döndürür
        System.out.println(Arrays.toString(arr[0]));   //[3, 1, 7]

        System.out.println(Arrays.toString(arr));    //[[I@1b28cdfa, [I@eed1f14]


        // MDArray'de tüm elementleri bir array olarak yazdırmak istersek

        System.out.println(Arrays.deepToString(arr));   //[[3, 1, 7], [6, 10, 2]]
    }
}
