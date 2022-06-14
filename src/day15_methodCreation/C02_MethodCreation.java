package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

    public static void main(String[] args) {

        //kulanıcıdan bir kelime isteyin
        //eğer kelime 3 harften kısa ise "kelime çok kısa" yazdırın
        //eğer kelime 3,4 veya 5 harfli ise harf sayısını ve
        //kelimenin tersten yazılışını yazdırın
        //eğer 5 harften uzunsa "kelime çok uzun" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.printf("Lütfen bir kelime giriniz");
        String kelime=scan.next();
        String tersKelime="";

        if (kelime.length()<3){
            System.out.println("kelime cok kisa");
        }else if (kelime.length()<=5){
            if (kelime.length()==3){
                tersKelime=kelime.substring(2)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);
            }else if(kelime.length()==4){
                tersKelime=kelime.substring(3)+
                        kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);
            }else {
                tersKelime=kelime.substring(4)+
                        kelime.substring(3,4)+
                        kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);
            }
            System.out.println("girdiginiz kelimedeki harf sayisi : " + kelime.length());
            System.out.println("kelimenin tersten yazilisi : " + tersKelime);
        } else {
            System.out.println("kelime cok uzun");
            }
    }
}
