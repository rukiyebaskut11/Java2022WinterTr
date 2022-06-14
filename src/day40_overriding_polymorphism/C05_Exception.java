package day40_overriding_polymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_Exception {

    public static void main(String[] args) {



    // kullanicidan istediği sayiyi alip toplayan bir program yaziniz
    // toplam 500 ü gecerse programi bitirsin veya
    // kullanici bitirmek istediğinde Q ya basmalıdır

    Scanner scan = new Scanner(System.in);
    int toplam = 0;

    do {
        System.out.println("Lutfen toplamak istediginiz sayiyi giriniz \nbitirmek icin Q' ya basiniz");
       int sayi=0;

       // int sayi= scan.nextInt();

        try {
            sayi = scan.nextInt();

        } catch (InputMismatchException e) {


        }

        toplam +=sayi;

    }while (toplam<500);

    }
}
