package practise_b59;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MarketProject {

    static List<String> gunler = new ArrayList<>(Arrays.asList(" Pazartesi",
                          " Sali", " Carsamba", " Persembe", " Cuma", " Cumartesi", " Pazar"));//1. adım
    static List<Double> gunlukKazanclar = new ArrayList<>();//2. adım
    static double ciro = 0;


    public static void main(String[] args) {

        /*
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları
         *            tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *            ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *            ortalama kazançtan aşağıysa o günleri return yap.
         * */

        int gun = 0;
        Scanner sc = new Scanner(System.in);
        while (gun < 7) {//3. adım
            System.out.print(gunler.get(gun) + " gününün kazancını giriniz : ");//gunler listinden aldığım gün için
                                                                          // kullanııcdan o günün hasılatını istedim.
            double gunlukhasilat = sc.nextDouble();//istediğim hasılatı gunluk hasılata atadım
            gunlukKazanclar.add(gunlukhasilat);//aldığım günlük hasılatı gunlukKazanclar listine ekledim.
            ciro += gunlukhasilat;//aldığım günlük hasılatı kasaya ekledim.
            gun++;//0 1 2 3 4 5 6 .günleri çağırdım.
        }


    }
}
