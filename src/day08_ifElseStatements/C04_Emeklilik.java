package day08_ifElseStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {

        //eger çalışan kadınsa 60 yasından büyük olduğunda emekli olabilir
        //çalışan erkekse 65 yasından büyükse emekli olabilir

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi yazınız" +
                           "\nKadın için K  \nErkek E harfini giriniz" );

        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("lütfen yasınızı giriniz");
        double yas=scan.nextDouble();


        if (cinsiyet=='K'){

            if (yas<0 || yas>120){
                System.out.println("lüten girdiğiniz yas değerini kontrol edin");
            }else if (yas<60){
                System.out.println("emekli olamazsın \nDaha " + (60-yas) + "yıl çalışman gerekir");
            }else{
                System.out.println("emekli olabilirsin");
            }
        }else if(cinsiyet=='E') {

            if (yas<0 || yas>120){
                System.out.println("lüten girdiğiniz yas değerini kontrol edin");
            }else if (yas<65){
                System.out.println("emekli olamazsın \nDaha " + (65-yas) + "yıl çalışman gerekir");
            }else{
                System.out.println("emekli olabilirsin");
            }

        }else{

            System.out.println("lütfen cinsiyet için geçerli bir harf giriniz");
        }
    }
}
