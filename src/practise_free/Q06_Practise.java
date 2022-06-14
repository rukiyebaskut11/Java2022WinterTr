package practise_free;

import java.util.Scanner;

public class Q06_Practise {

     /*     Interview Question
         Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
       ve 1'den girilen tam sayıya kadar olan sayıların
        karelerinin toplamını
       hesaplayan kodu yazınız.

      Örnek Ekran Çıktısı
      Girilen sayı=4
      Kareler toplamı=14
     */

    public static void main(String[] args) {

       /* Scanner scan=new Scanner(System.in);
        System.out.println("bir tamsayı giriniz  :");
        int sayı= scan.nextInt();  //okumamız lazım

        System.out.println("sayı = " + sayı);

        int toplam=0;
        for (int i = 1; i <sayı ; i++) {

            toplam+=(i*i);  // toplam =toplam + (i*i);

        }
        System.out.println("sayıların kareleri toplamı :" + toplam);

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 tane kenar uzunlugu giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        double dikdörtgeninAlani = (sayi1*sayi2);
        double dikdörtgeninCevresi=2*(sayi1+sayi2);


        System.out.println("Alan : "+ dikdörtgeninAlani +" \nCevre :  "+dikdörtgeninCevresi);

    }
}
