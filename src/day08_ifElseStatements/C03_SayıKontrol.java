package day08_ifElseStatements;

import java.util.Scanner;

public class C03_SayıKontrol {
    public static void main(String[] args) {

        //kullanıcıdan iki sayı isteyin
        //sayıların ikiside pozitif ise sayıların toplamını yazdırın
        //sayıların ikiside negatif ise sayıların çarpımını yazdırın
        //sayıların ikiside farklı işaretlere sahipse
        //"farklı işaretlerde sayılarla işlem yapamazsın" yazdırın
        //sayılardan sıfıra eşit olan varsa "sıfır çarpmaya göre yutan elemandır" yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");

        double sayı1=scan.nextDouble();
        double sayı2=scan.nextDouble();

        //sayıların ikiside pozitif ise sayılrın toplamını yazdırın

        if (sayı1>0 && sayı2>0){
            System.out.println("girdiğiniz iki sayıda pozitif olduğundan toplamları="+
                               (sayı1+sayı2));
        }else if(sayı1<0 && sayı2<0){

            //sayıların ikiside negatif ise sayıların çarpımını yazdırın
            System.out.println("girdiğiniz iki sayıda negatif olduğundan çarpımları="+
                               (sayı1*sayı2));
        }




    }
}
