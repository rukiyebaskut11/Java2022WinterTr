package day38_inheritance_overriding;

public class Ustabasi extends Isci{

    String statu = "Ustabasi";
    String haklar = "Ustabasi haftada birgun ekstra tatil hakkina sahiptir";



    public void mesai(){
        System.out.println("Ariza varsa Ustabasi ekstra ucret almadan  calisir");

    }

    public void maasHesapla(){
        System.out.println("Tum personel 30 gun * 8 saat * 12 euro = "+(30*8*12)+" euro maas alir");
    }

    public static void main(String[] args) {
        /*

        Icinde oldugumuz class dan klasik haliyle bir obje olusturursak
        o obje ile cagırdıgımız variable ve method larda
        java once icinde bulundugumuz class a bakar
        aradıgımız class uyesi , icinde oldugumuz class da varsa
        bize onu getirir

        YOKSA,
        parent class(lar) a bakar, ilk buldugunu getirir

         */


        Ustabasi yasin = new Ustabasi();
        System.out.println(yasin.statu);  // Ustabasi
        System.out.println(yasin.haklar);  // Ustabasi haftada birgun ekstra tatil hakkina sahiptir
        System.out.println(yasin.ikramiye);
        System.out.println(yasin.izin);
        yasin.maasHesapla();
        yasin.mesai();

        /*

           eger isci olarak özelliklerini görmek istersek
           Class adini ( Data Turu ) Isci seceriz

         */

        Isci ahmet = new Ustabasi();
        System.out.println(ahmet.statu);
        System.out.println(ahmet.haklar);
        System.out.println(ahmet.ikramiye);
        System.out.println(ahmet.izin);
        ahmet.maasHesapla();
        ahmet.mesai();

        /*
        Siz bir objeyi hangi class dan tanımlarsanız o class a ait özelliklere sahip olur
         */


        Personel adem = new Ustabasi();
        System.out.println(adem.statu); // PERSONEL
        System.out.println(adem.haklar);
        //System.out.println(adem.ikramiye); CTE VERİR
        System.out.println(adem.izin);
        adem.maasHesapla();
        adem.mesai();

        /*
        Personel adem = new Ustabasi();  bu bir Ustabası objesidir
        Personel adem = new Personel();  bu Personel objesidir
         */


        /*
         Personel adem = new Ustabasi();

         adem in data turu Personel dir.
         böylece biz adem i ne olarak isimlendirdigimizi bilebiliriz

         ancak ben adem in ustabası oldugunu biliyorum
         cünkü constructor i Ustabasi

         ama bu yazim formati ile
         adem in tum personel ile birlikte sahip oldugu
         ortak özellikleri vurgulamak istiyorum

         bu kullanım seklinde olusturulan obje data turu olarak secilen class
         ve onun parent class larındaki variable lari kullanabilir

         */

    }
}
