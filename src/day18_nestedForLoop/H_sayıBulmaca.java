package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class H_sayıBulmaca {
    public static void main(String[] args) {


        //bilgisayara 1 ile 100 arasında bir sayı tutturun
        //kullanıcıdan bu sayıyı tahmin etmesini isteyin
        //girilen her tahminde sayıyı büyüt veya küçült diye kullanıcıya yol gösterin
        //kullanıcı sayıyı bulduğunda kaç tahminde sayıyı bulduğunu kullanıcıya yazdırın

        Random rnd = new Random();
        int sayı = rnd.nextInt(100); //burası 100 den küçük rastgele bir sayı oluşturur

        Scanner scan=new Scanner(System.in);
        int tahmin=0;
        int sayac=1;

        while (sayı != tahmin){

            System.out.println("Lütfen bir sayı giriniz");

            tahmin=scan.nextInt();

            if (tahmin>sayı){
                System.out.println("Daha küçük bir sayı söylemelisin");

            }else if (tahmin<sayı){
                System.out.println("Daha büyük bir sayı söylemelisin");
            }
            sayac++;
        }

        System.out.println("tuttugum sayıyı " + (sayac-1) + "tahminde buldunuz");


    }



}
