package day15_methodCreation;

import java.util.Scanner;

public class C03_MethodCreation {

    public static void main(String[] args) {
        //kulanıcıdan bir kelime isteyin
        //eğer kelime 3 harften kısa ise "kelime çok kısa" yazdırın
        //eğer kelime 3,4 veya 5 harfli ise harf sayısını ve
        //kelimenin tersten yazılışını yazdırın
        //eğer 5 harften uzunsa "kelime çok uzun" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.printf("Lütfen bir kelime giriniz");
        String kelime=scan.next();
        int harfSayısı=kelime.length();

        if (harfSayısı<3){
            System.out.println("kelime çok kısa");
        }else if(harfSayısı==3){
            ucHarfiTersineCevir(kelime);
        }else if(harfSayısı==4){
            dörtHarfiTersineCevir(kelime);
        }else if(harfSayısı==5){
            besHarfiTersineCevir(kelime);
        }else {
            System.out.println("kelime çok uzun");
        }

    }

    private static void dörtHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 4" );
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }

    private static void besHarfiTersineCevir(String kelime) {
        String tersKelime= kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 5" );
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }
    // 1- method olusturmak icin method'un adini yazariz
    // 2- method'a giderken goturmem gerek variable varsa, bunu method'a eklemeliyim


    private static void ucHarfiTersineCevir(String kelime) {
        String tersKelime = kelime.substring(2) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 3");
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }
}
