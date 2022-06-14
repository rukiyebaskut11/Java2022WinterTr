package day17_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {

        // verilen iki harf ve aralarındaki harfleri yazdıran
        //bir kod yazınız

        char ilkHarf='a';
        char sonHarf='b';

        for (char i = ilkHarf; i <=sonHarf ; i++) {
            System.out.print(i+" ");

        }

        double baslangıc=10;
        double bitis=20;
        double artıs=0.2;

        //baslangıc ve bitis sayıları arasında artıs miktarı ile olusacak
        //tüm sayıları yazdırın

        for (double i = baslangıc; i <=bitis ; i+=artıs) {
            System.out.print(i+ " ");

        }
    }
}
