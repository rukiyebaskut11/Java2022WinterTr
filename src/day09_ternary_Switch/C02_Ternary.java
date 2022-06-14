package day09_ternary_Switch;

import java.util.Scanner;

public class C02_Ternary {

    public static void main(String[] args) {

        //ternary ile yapılan tüm işlemler if else ile de yapılabilir
        //if else yerine ternary tercih etme sebebi yapının basit ve anlaşılabilir olmasıdır
        //ternary içerisinde komplex kodlar olmaz
        //sadece sonuc veya bizi sonuca götüren basit işlemler olabilir


        //kullanıcıdan bir tamsayı alıp tek mi çift mi yazdıran bir kod yazalım

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayı giriniz");

        int sayı = scan.nextInt();

        if (sayı%2==0){
            System.out.println("sayı çift");
        }else {
            System.out.println("sayı tek");
        }
        System.out.println(sayı%2==0 ? "sayı çift"  :  "sayı tek");
    }
}
