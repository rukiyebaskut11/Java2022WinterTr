package day43_garbage_abstractClass;

public class C01_Final {

    final static double piSayisi=3.14;
    final static String okulIsmi="Yıldiz koleji";

    public static void main(String[] args) {

        final int sayi=10;

        // okulIsmi="Java koleji";  final olarak işaretlendiği için değiştirilemez
    }

    public final static void method1(){

        System.out.println("Parent class final method1");
    }
}
