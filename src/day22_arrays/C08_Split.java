package day22_arrays;

public class C08_Split {
    public static void main(String[] args) {

        //verilen bir cümlede istenen harfin kaç defa kullanıldığını yazdıran
        // bir method oluşturun

        String cumle="Nerede o 'hello world' yazdıramayan ögrenciler?";
        String harf="e";

        harfKacKereKullanılmıs(cumle,harf);



    }

    private static void harfKacKereKullanılmıs(String cumle, String harf) {

        int sayac=0;

        String karakterler[]=cumle.split("");

        for (int i = 0; i <karakterler.length ; i++) {
            if (karakterler[i].equals(harf)){
                sayac++;

            }

        }
        System.out.println(" aradıgınız "+ harf + " verilen cumlede "+ sayac + " adet kullanılmıs ");

    }
}
