package practise_b59;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManavProject {

    static List<String> urunListesi = new ArrayList<String>();
    static List<Double> urunFiyatları = new ArrayList<Double>();
    static double toplamOdeme;
    static Scanner scan=new Scanner(System.in);


    public static void main(String[] args) {

        /*
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         *            istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         *            Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */

        urunListesi.add("donat -urun kodu:1 ");
        urunListesi.add("muz -urun kodu:2 ");
        urunListesi.add("elma -urun kodu:3 ");
        urunListesi.add("erik -urun kodu:4 ");
        urunListesi.add("cilek -urun kodu:5 ");




    }
}
