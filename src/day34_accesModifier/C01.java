package day34_accesModifier;

public class C01<privite> {

    private static int sayi = 10;
    private static  String str = "Java";
    static int acikSayi = 20;  // acces modifier ' i default Acces Modifier
    String acikString = "Hi";  // acces modifier'i default  Acces Modifier

    public static int halkaAcikSayi =15;

    protected C01(){

        // bu constructor'in access modifier'i
        // default access modifier'dir
        // dolayisiyla icinde oldugumuz paketin disinda
        // bu class'dan obje olusturulamaz
    }
    private C01(int numara){

        System.out.println("parametreli Constructor calisti");
    }
    private void method1(){


    }

}
