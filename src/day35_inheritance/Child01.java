package day35_inheritance;

public class Child01 extends Parent{

    public static void main(String[] args) {

        /*
        Child class hiç bir objeye ihtiyac duymadan

        parent class daki variable ve method lara ulaşabilir

         */

        System.out.println(isim); // Neval

        System.out.println(fabrika); // Yildiz tekstil

        method1();
        method2();




    }


}
