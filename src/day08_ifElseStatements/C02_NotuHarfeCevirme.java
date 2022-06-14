package day08_ifElseStatements;

import java.util.Scanner;

public class C02_NotuHarfeCevirme {
    public static void main(String[] args) {

        //soru 7) kullanıcıdan 100 üzerinden notunu isteyin.Notu harf sistemine çevirip yazdırın
        //50'den küçükse "D"
        //=50<60 arası "C"
        //=60<80 arası "B"
        //=80'nin üzerinde ise "A"

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");

        double notsayı= scan.nextDouble();

        if(notsayı<50 || notsayı>100) {
            System.out.println("lütfen geçerli bir not giriniz");
        }
        else if(notsayı<50){
            System.out.println("notunuz D");
        }else if(notsayı<60){
            System.out.println("notunuz C");
        }else if(notsayı<80){
            System.out.println("notunuz B");
        }else {

            System.out.println("notunuz A");
        }
    }
}
