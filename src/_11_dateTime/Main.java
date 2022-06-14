package _11_dateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("isleminizi seciniz : ");
        int islem = scan.nextInt();

        Kayit yeniKayit = new Kayit();  // obj ile method call yapılacak
        List<Kullanici> kisi = new ArrayList<>();



        boolean cikilsinMi= false;

        while (!cikilsinMi){
            System.out.println("Lutfen \n1: Kayit al\n2:sansli kisi bul\n3:kisileri listele\n4:cikis");

            switch(islem){

                case 1 :
                    kisi = yeniKayit.kayitAl(); // kisi list i değerini yeniKayit obj ile kayitAl () method call dan alacak
                        break;

                case 2 :
                    yeniKayit.sansliKullanici(kisi);
            }
        }


        }


}
