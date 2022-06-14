package day18_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoopAvantaj {
    public static void main(String[] args) {


        //kullanıcıdan istediği kadar sayı girmesini isteyin
        //kullnıcının girdiği sayıların toplamı 500 ü geçerse
        //artık yeter çok sayı girdin, toplam...oldu yazsın

        Scanner scan=new Scanner(System.in);

        int sayı=0;
        int toplam=0;

        while (toplam<500){
            System.out.println("lütfen bir sayı giriniz");

            sayı=scan.nextInt();
            toplam+=sayı;
        }

        System.out.println("artık yeter çok sayı girdin, toplam : "+toplam + " oldu");
    }
}
