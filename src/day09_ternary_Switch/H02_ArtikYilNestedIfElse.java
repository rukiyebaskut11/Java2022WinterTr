package day09_ternary_Switch;

import java.util.Scanner;

public class H02_ArtikYilNestedIfElse {
    public static void main(String[] args) {

         /*
        Kullanicidan artik yil olup olmadigini kontrol
        etmek icin yil girmesini isteyin.

           Kural 1: 4 ile bolunemeyen yillar artik yil degildir
           Kural 2: 4’un kati olmasina ragmen 100 ile                                                            bolunebilen yillardan sadece 400’un                                                       kati olan yillar artik yildir
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yıl yazınız");

        int yıl= scan.nextInt();

        if (yıl%100==0) {  //100 e bölünebiliyor

            if (yıl % 400 == 0) {
                System.out.println("Artık yıl");
            } else {
                System.out.println("Artık yıl degil");

            }
        }
    }
}
