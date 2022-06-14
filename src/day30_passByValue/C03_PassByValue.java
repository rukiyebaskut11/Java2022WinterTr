package day30_passByValue;

public class C03_PassByValue {

    public static void main(String[] args) {

        /*
        java Pass By Value bir programlama dilidir
        yani ; bir primitive variable'i argument olarak bir method a yollarsanız
        java o variable'i değil ,değerini (value) method a aktarır(pass)

         */
        double etiketFiyati = 100;
        yuzdeOnIndirimYap(etiketFiyati);
        yuzdeOnIndirimYap(etiketFiyati);

        System.out.println("iki indirimden sonra main method da etiket fiyatı : "+etiketFiyati);



    }

    public static void yuzdeOnIndirimYap(double etiketFiyati) {

        etiketFiyati=etiketFiyati*0.90;

        System.out.println("Sizin icin %10 indirimli fiyatımız : "+etiketFiyati);


    }
}
