package interviewQuestions1;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /*
         * Kulanicidan alina bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string giriniz :");
        String str = scan.nextLine();

        System.out.println("Bir sayı giriniz :");
        int sayı = scan.nextInt();
       // ilkSonHarf(str,sayı);

        System.out.println("girilen stringin ilk ve son harfinin istenen sayı kadar birlesik hali :" + ilkSonHarf(str,sayı));


    } // main sonu

    private static String ilkSonHarf(String str, int sayı) {

        String s = str.substring(0,1) + str.substring(str.length()-1);   //ea

        String output = "";     // output aslında

        for (int i =1; i <=sayı ; i++) {     // ea dan kaç tane yazacağım eaeaea
            output+=s;   // b=b+s




        }
        return output;

    }
}
