package day37_inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {

    // bir class ı child class yaptıgımızda
    // parent class daki constructor a ulaşması gerekir
    // bu durumda parent class daki constructor ın
    // acces modifier i uygun  bir modifier yapılmalıdır


    // Child class da tüm constructor ların ilk satırına
    // Java nın yerleştirdiği constructor PARAMETRESİZ dir yani super()

    Child(){
        super();
        System.out.println("child class parametresiz cons");
    }

    Child(int s){

        System.out.println("Child class parametreli cons.");
    }

    Child(int sayi1,int sayi2){

        // eger parent class dan parametresiz constructor ı degil de
        // baska bir construvtor ı calıstırmak isterseniz
        // bunu Child class daki constructor ın İLK SATIRINA yazmalıyız

        super(sayi1,sayi2);
        System.out.println("iki parametreli cons.");
    }



    public static void main(String[] args) {

        Child child = new Child(5,8);


    }
}
