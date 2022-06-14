package practise_free;

import java.util.Random;
import java.util.Scanner;

public class Q04_Practise {

    /*
    cm olarak verilen bir sayiyi, metre ve kilometreye
     donusturen bir method yaziniz
    */

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("metre ve kilometreye dönüştürmek üzere cm olarak sayı giriniz :");
        double santiMetre = scanner.nextDouble();
        donusturSM(santiMetre);
    }
    public static void donusturSM (double cm){
        double metre =cm/100;
        double kiloMetre = cm/100000;
        System.out.println("sizin girdiginiz "  + cm + " cm degeri :" +metre + " metredir, " +kiloMetre  + " kilometredir" );

    }
}
