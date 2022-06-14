package practise_free;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ReplitDeneme {


    //   public static void main(String argv[]) {
    //   argv= new String []{"hello","world"};
    //   System.out.println(argv[1]);


    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Lutfen bir tamsayi giriniz : ");
    int sayi = scan.nextInt();


    terstenYazdir(sayi);




    }

    private static void terstenYazdir(int sayi) {

        int terstenSayi=0;
        for (int i = sayi; i >=1 ; i--)  {

        }

        System.out.println(terstenSayi);
    }
}




