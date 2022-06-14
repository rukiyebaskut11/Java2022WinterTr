package _11_dateTime;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {




    List<Kullanici> kisiler = new ArrayList<>(); // boş list create edildi. kayitAl() methodu bu list e element atayacak

    public List<Kullanici>kayitAl(){

        Scanner scan = new Scanner(System.in);
        System.out.print("Adinizi giriniz : ");
        String isim = scan.nextLine();

        Kullanici k1 = new Kullanici(isim, LocalDateTime.now());

        kisiler.add(k1);



        return kisiler;

    }

    public void sansliKullanici(List<Kullanici>kll){

        for (Kullanici k:kll){   // kayitAl () methodundan create edilen her bir kullanici döngüye sokuldu
            if (k.kayitZamani.getSecond()<10){  // har bir kullanicinin kayitZamanindaki saniye if sartina sokuldu
                System.out.println("sansli kisisiniz "+ k.name + " agam 5 kilo bal kazandin  :) ");
            }else System.out.println("maalesef " + k.name + "ballar balini buldunuz kovaniz yagmalandi   :) ");

        }




        }

}

