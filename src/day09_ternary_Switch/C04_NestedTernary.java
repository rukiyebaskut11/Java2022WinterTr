package day09_ternary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {

        // verilen sayinin poztif mi negatif mi oldugunu kontrol edip
        // 0 veya pozitif sayi ise tek veya cift
        // negatif sayi ise -100'den buyuk veya kucuk
        // oldugunu belirleyen bir ternary yaziniz

        int sayı=121;

        if (sayı>=0){
            if (sayı%2==0){
                System.out.println("sayı pozitif cift sayı");
            }else {
                System.out.println("sayı pozitif tek sayı");
            }
        }else {
            if(sayı<= -100){
                System.out.println(" sayı -100 den kücük negatif sayı");
            }else {
                System.out.println("sayı -100 den büyük negatif sayı");
            }
        }

        String sonuc=sayı>=0 ?
                (sayı%2==0 ? "pozitif cift sayı" : "pozitif tek sayı") :
                (sayı<-100 ? "-100 den kücük negatif sayı" : "-100 den büyük negatif sayı");

        System.out.println(sonuc);
    }
}
