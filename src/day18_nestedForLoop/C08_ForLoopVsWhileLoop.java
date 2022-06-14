package day18_nestedForLoop;

import java.util.Scanner;

public class C08_ForLoopVsWhileLoop {
    public static void main(String[] args) {

        //kullanıcıdan toplamak istediği sayıları alın
        //ve kullanıcı 0 ' a basıncaya kadar devam edin
        //kullanıcı 0'a basdığında
        //girdiği tüm sayıların toplamını yazdırın

        Scanner scan= new Scanner(System.in);
        int sayı =0;
        int toplam=0;

        for (int i = 1; i <1000000 ; i++) {
            System.out.println("Lütfen bir sayı giriniz");
            sayı=scan.nextInt();

            if (sayı==0){
                break;
            }else {
                toplam+=sayı;
            }
        }

        System.out.println(toplam);

        sayı=1;
        toplam=0;

        while (sayı!=0){
            System.out.println("Lütfen bir sayı giriniz");
            sayı=scan.nextInt();
            toplam+=sayı;
        }
        System.out.println(toplam);


        //baslangıc ,bitis ve değişim değerleri net olan durumlarda for loop daha avantajlıdır
        //ama adım sayısı belli olmayan durumlarda while loop daha avantajlıdır
    }
}
