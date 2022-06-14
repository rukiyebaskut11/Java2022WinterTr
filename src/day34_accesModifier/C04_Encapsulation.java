package day34_accesModifier;

public class C04_Encapsulation {

    public static void main(String[] args) {

        /* bir variable i encapsule etmek için
         1- Acces modifier i private yaparız
         2- okuma ve özelliklerini kullanılmasını istediğimiz gb sınırlayabiliriz
               - eger sadece okunmasını istiyorsanız getter
               - sadece değer girilebilsin isterseniz setter
               methodlarını oluştururuz

          Bir variable için hem getter hem setter oluşturursanız
          o variable public olmuş gb hem okuyup hem de yazılmasını sağlayavbilirsiniz


         */

        C03 obj = new C03();

        System.out.println(obj.getSayi());  // 0

        obj.setStr("Java Java Java");

        System.out.println(obj.getStr()); //Java Java Java

        System.out.println(obj); // sayi=0, str=Java Java Java


    }
}
