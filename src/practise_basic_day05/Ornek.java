package practise_basic_day05;

import java.util.Scanner;

public class Ornek {

    /*
     * - Main method icerisinde bir ogrenciye ait variable’lar olusturun ve bu
     * variable’lara atama yapin
     *
     * - isimDegistir adinda bir method olusturun, parametre olarak ogrenci
     * bilgilerini alsin ve methodun icinde tum bilgileri degistirip, yeni bilgileri
     * yazdirsin
     *
     * - Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
     * sonrasinda yeniden ogrenci bilgilerini yazdirin
     *
     * -Soyisimdegistir isminde bir method olusturun, bu method parametre olarak "soyisim"
     * variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini istesin ve
     * eski soyismi degistirsin.
     *
     * Not :Instance variable'lar object'lere aittir ve diger adi object variable'dir
     */

    public static void main(String[] args) {

        String ogrenciIsim = "Ali";
        String ogrenciSoyisim="Can";
        String ogrenciTel="123456789";


        System.out.println("isim :" + ogrenciIsim + " soyisim :" +ogrenciSoyisim + " tel :"+ogrenciTel);
           // isim :Ali soyisim :Can tel :123456789

        isimDegistir(ogrenciIsim,ogrenciSoyisim,ogrenciTel);  // isim :Mehmet soyisim :Bulut tel :9986544995

        //soyIsimDegistir(ogrenciSoyisim); ilk methodu create ederken bu satırı kullandık

        ogrenciSoyisim = soyIsimDegistir(ogrenciSoyisim);
        System.out.println("isim :" +ogrenciIsim + " yeniSoyisim :" +ogrenciSoyisim + " tel :" + ogrenciTel);


    }

    private static String soyIsimDegistir(String ogrenciSoyisim) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Yeni soyisminizi giriniz :");
        String yeniSoyisim = scan.nextLine();

        return yeniSoyisim;

    }

    public static void isimDegistir(String ogrenciIsim, String ogrenciSoyisim, String ogrenciTel) {

        ogrenciIsim = "Mehmet";
        ogrenciSoyisim = "Bulut";
        ogrenciTel = "9986544995";

        System.out.println("isim :" + ogrenciIsim + " soyisim :" +ogrenciSoyisim + " tel :"+ogrenciTel);



    }

}
