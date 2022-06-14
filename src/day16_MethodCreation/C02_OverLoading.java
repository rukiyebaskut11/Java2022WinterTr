package day16_MethodCreation;

public class C02_OverLoading {

    public static void main(String[] args) {


        String str="Bu da gecer ya Huu";

        System.out.println(str.indexOf("d")); // 3
        System.out.println(str.indexOf("a",5)); // 13
        System.out.println(str.indexOf('a',5));


        //bir class da birden fazla method olmasına overloading denilir
        //ya parametre sayısı farklı olmalı
        //veya parametre sayısı aynı ise argumentlerin data türleri farklı olmalı


    }
}
