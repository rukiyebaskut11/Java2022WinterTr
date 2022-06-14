package day29_staticKeyword;

public class C01_Static {

    String okulIsmi = "Yıldız koleji";
    static String okulTelefonu = "3122563635";

    public  static  void staticMethod(){
        System.out.println("Static method calisti");

    }
    public  static  void staticOlmayanMethod(){
            System.out.println("Static olmayan method calisti");
    }
}
