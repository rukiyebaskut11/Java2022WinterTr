package day09_ternary_Switch;

import java.util.Scanner;

public class C01_NestedIfElse {

    public static void main(String[] args) {

        //kullanıcıdan 4 basamaklı bir sayı girmesini isteyin
        //girdiği sayı 5'e bölünüyorsa son rakamını kontrol edin
        //son rakamı 0 ise ekrana "5'e bölünen çift sayı" yazdırın
        //son rakamı 0 değilse "5'e bölünen tek sayı" yazdırın
        //girdiği password 5'e bölünmüyorsa ekrana "tekrar deneyin" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı pozitif bir tamsayı giriniz");

        int sayı= scan.nextInt();

        if (sayı< 1000 || sayı>9999){ //istenmeyen durumu yazıyoruz
            System.out.println("lütfen 4 basamaklı sayı giriniz");

        }else if (sayı%5==0){ //4 bas.sayı 5 e tam bölünüyor
            if(sayı%10==0){   //4 bas. 5 ile bölünebilen ve son rakamı 0 olan
                System.out.println("5'e bölünen çift sayı");
            }else {           //4 bas. ve 5 ile bölünebilen son rakamı 0 olmayan
                System.out.println("5'e bölünen tek sayı");

                System.out.println("tekrar deneyin");
            }
        }else {

            System.out.println("tekrar deneyin");
        }



    }
}
