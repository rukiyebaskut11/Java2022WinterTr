package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int sayı=1000;

        //verilen sayının 3 veya daha çok basamaklı olup olmadığını kontrol eden
        //ve sonucu yazdıran bir ternary oluşturun

        String sonuc=sayı>100 ? "sayı 3 basamaklı veya daha büyük" : "sayı negatif veya 3 basamaktan küçük";

        //ternary bize sonuç döndürdüğü için
        //ya bu sonucu direk yazdırmalıyız
        //ya da sonucu data türüne uygun bir variable'a atama yapabiliriz

        System.out.println("girdiğiniz sayı analizi : " + sonuc);
    }
}
