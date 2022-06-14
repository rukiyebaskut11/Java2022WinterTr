package day43_garbage_abstractClass;

public abstract class C04 {

    /*
    bir abstact class da abstract veya concrete method lar bulunabilir
    child class larin abstract method lari override etmesi MECBURİ iken
                      concrete method ların override edilmesi OBSİYONEL dir

     */

    public abstract void absMethod();

    public void concreteMethod() {
        System.out.println("C04 concrete method");
    }

    public static void concreteStaticMethod() {
        System.out.println("C04 concrete static method");
    }

    public static void main(String[] args) {
        /*
        Abstract class'lar constructor'a sahiptir
        ancak Abstract class'lardan OBJE OLUSTURULAMAZ
       Abstract class'lar OBJE BARINDIRMAYAN,
       sadece child class'lar icin
       UYULMASI SART OLAN veya OPSIYONEL birakilan
       ozellikleri tanimladigimiz bir depo class gibidir
         */
        // C04 obj=new C04();
        System.out.println("Bu class abstract");
        concreteStaticMethod();
    }
}