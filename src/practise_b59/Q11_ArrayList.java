package practise_b59;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q11_ArrayList {
    public static void main(String[] args) {

        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */


        List<String>veriTabanındakiKullanıcılar = new ArrayList<>();
        veriTabanındakiKullanıcılar.add("Ayse");
        veriTabanındakiKullanıcılar.add("Ahmet");
        veriTabanındakiKullanıcılar.add("Hasan");
        veriTabanındakiKullanıcılar.add("Ali");
        veriTabanındakiKullanıcılar.add("Mehmet");
        veriTabanındakiKullanıcılar.add("Derya");


        System.out.println("veriTabanindakiKullanicilar = " + veriTabanındakiKullanıcılar);


        // 1. adim
        Scanner scan = new Scanner(System.in);
        System.out.print("Kullanmak istediginiz username giriniz :");


        // 2. adim
        String username = scan.nextLine().trim();

        // 3. adim
        boolean kullaniciIsmiVarMI =veriTabanındakiKullanıcılar.contains(username);


        // 4. adim
        if(kullaniciIsmiVarMI) {// kontrol mekanizmasi duplicationi onler
            System.out.println("Bu kullanici adi zaten alinmis.");
        }else {
            System.out.println("Bu kullanici adini kullanabilirsiniz");
        }


        //5.adim
        if(kullaniciIsmiVarMI) {
            //Random random =new Random();
            int rastgeleSayi = new Random().nextInt(100); //1 ile girilen sayi arasinda uniqe(essiz) sayi uretir
            username = username + ""+rastgeleSayi;
            System.out.println("Yeni kullanici adi olarak bunu kullanabilirsiniz : " + username);
        }else {
            System.out.println("Yeni kullanici adi : " + username);
        }

    }
}
