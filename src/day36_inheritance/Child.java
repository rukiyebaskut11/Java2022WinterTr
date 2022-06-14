package day36_inheritance;

public class Child extends Parent{

    Child(){
        super();
        System.out.println("Child cons. calisti");

    }

    // tüm class larda biz görmesek bile
    // java nın oluşturduğu default constructor vardır

    // extends keyword kullana class lardaki
    // tüm CONSTRUCTOR ların ilk satırında
    // biz görmesek bile super()
    // constructor call vardır
    // yani parent class ın parametresiz constructor call

    public static void main(String[] args) {

        Child child= new Child();

    }


}
