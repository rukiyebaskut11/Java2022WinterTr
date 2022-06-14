package practise_free;

import java.util.Scanner;

public class Q01_Practise {

    /*
  Problem Tanımı :
  Basit 4 islem yapan bir hesap makinesi kodlayiniz....
  Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
  Kullanicidan iki sayi girmesini isteyiniz.
  Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirını

   */
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        System.out.println("yapacagınız islemi  * + / - olarak seciniz....: ");

        char islem=scan.next().charAt(0);

        System.out.println("islem için birinci sayıyı giriniz :");
        double sayı1= scan.nextDouble();

        System.out.println("islem için ikinci sayıyı giriniz :");
        double sayı2= scan.nextDouble();

        hesapMakinesi(islem,sayı1,sayı2);
    }

    private static void hesapMakinesi(char islem, double sayı1, double sayı2) {
        switch (islem){
            case '*' :
                System.out.println(sayı1 + "*" + sayı2 + "=" + (sayı1*sayı2));
                break;
            case '+' :
                System.out.println(sayı1 + "+" + sayı2 + "=" + (sayı1*sayı2));
                break;
            case '/' :
                System.out.println(sayı1 + "/" + sayı2 + "=" + (sayı1*sayı2));
                break;
            case '-' :
                System.out.println(sayı1 + "-" + sayı2 + "=" + (sayı1*sayı2));
                break;

            default:
                System.out.println("dört islem harici bir secim yaptınız..");

        }
    }


}
