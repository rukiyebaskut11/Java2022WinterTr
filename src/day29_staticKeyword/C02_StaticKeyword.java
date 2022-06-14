package day29_staticKeyword;

import java.util.concurrent.Callable;

public class C02_StaticKeyword {

    public static void main(String[] args) {

        // başka class daki static class üyelerine
        // ulasabilmek için sadece classIsmi.staticUyeIsmi
        // yazmamız yeterlidir


        System.out.println(C01_Static.okulTelefonu);

        C01_Static.okulTelefonu="3125474747";

        System.out.println(C01_Static.okulTelefonu);

        // BAŞKA CLASS DAKİ STATİC OLMAYAN CLASS ÜYELERİNE
        // ANCAK O CLASS DAN OBJE OLUŞTURARAK ULAŞABİLİRİZ
        // VE OBJE İLE YAPILAN ATAMALAR SADECE O OBJE İÇİN GEÇERLİ OLUR

        C01_Static obj1 = new C01_Static();
        C01_Static obj2 = new C01_Static();


        System.out.println(obj2.okulIsmi);   // Yıldız koleji

        obj2.okulIsmi="Sabir koleji";

        System.out.println(obj1.okulIsmi);   //  Yıldız koleji


    }
}
