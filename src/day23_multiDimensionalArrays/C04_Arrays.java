package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {

        //kullanıcıya kaç elementlik bir array oluşturacağını sorun
        // array i oluşturup elementleri kullanıcıdan alıp,array e atayın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kac elementli bir array istediginizi yazın");

        int uzunluk= scan.nextInt();  // 5 yazdıysa

        int arr[]=new int[uzunluk];  // [0,0,0,0,0] olan bir array oluşturmuş olurum

        for (int i = 0; i <uzunluk ; i++) {

            System.out.println("Array için " + (i+1) + ". elemanı giriniz");
            arr[i]= scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));
    }
}
