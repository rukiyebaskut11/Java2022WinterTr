package interviewQuestions1;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        String pin = "said.12345";
        int girisHakkı = 4;

        System.out.println("******Hosgeldiniz******");

        while (true){
            System.out.print("pin kodu giriniz : ");
            String girilenPin = scan.nextLine();

            if (pin.equals(girilenPin)){
                System.out.println("basarılı giris yaptınız...:)");
                break;
            }else {
                System.out.println("yanlıs giris yaptınız...");
                girisHakkı--;
                System.out.println("kalan giris hakkınız :" + girisHakkı);

            }if (girisHakkı==0){
                System.out.println("giris hakkınız kalmadı..sim kartınız bloke oldu..");
                break;
            }
        }
    }
}
