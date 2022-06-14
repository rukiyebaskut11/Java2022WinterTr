package day45_interface;

public class C02_Default_Static_Method implements I01_Default_Static{
/*
Bir ınterface de default veya static olarak tanımlanan ve body si olan
method ların override edilmesi mecburi DEĞİLDİR

Eger static olarak tanımlanmışsa zaten override edemeyiz
 */
    @Override
    public void method1() {
        System.out.println("child class method1");

    }

    /*
   Parent Interface'deki default olarak tanimlanan method'u

   istersek override ederiz istersek etmeyiz

   override etmezsek, method cagrildiginda Parent Interface'deki calisir

   override edersek, child class'daki overriding method calisir

   @Override
   public void method2() {
       System.out.println("child class method2");
   }
    */

    public static void main(String[] args) {

        // Interface de static olarak tanımlanan method lara
        // static yöntemlerle ulasılabilir. InterfaceIsmi.methodIsmi

        I01_Default_Static.method3();

        C02_Default_Static_Method obj = new C02_Default_Static_Method();

        obj.method1(); // child class dan calısır
        obj.method2(); // Parent Interface den calısır
        //obj.method3(); eski class larda static bir üyeye
        // static olmayan yollarla da ulasabilirdik
        // ancak interface icerisinde static olarak tanımlanan method a
        // static olmayan yöntemlerle ulasılamaz


    }
}
