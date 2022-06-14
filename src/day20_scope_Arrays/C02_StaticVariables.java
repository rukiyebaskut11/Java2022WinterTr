package day20_scope_Arrays;

public class C02_StaticVariables {

    // instance variable'lar objeye bağımlıdır
    // ve her obje farklı değerler alabilir
    // buna örnek olarak öğrenci notları
    // ve öğretmen maaşları gibi diyebiliriz
    //bir objeye ait bir variable2in son değerini bulmak için
    // sadece o objeyi dikkate alırız


    //Static variabler ise class variable olarak tanımlanır
    // ve tüm class üyeleri için aynıdır
    //

      static String okulIsmi="Yıldız Koleji";
      static int okulNo;
      static boolean okulAcıkMı;


    public static void main(String[] args) {

        System.out.println(okulIsmi); // yıldız koleji
        System.out.println(okulNo);   // 0 (sıfır)

        okulNo=102;
        System.out.println(okulNo);  // 102
        System.out.println(okulAcıkMı); // false

        staticMethod();

        System.out.println(okulNo); //200

    }
    public static void staticMethod (){

        okulNo=200;
        System.out.println(okulNo); //200

    }
}
