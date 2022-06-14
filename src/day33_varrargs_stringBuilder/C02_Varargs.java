package day33_varrargs_stringBuilder;

public class C02_Varargs {

    public static void main(String[] args) {

        // parametre olarak bir int
        // ve istediğimiz kadar String alan
        // en uzun kelimenin harf sayısı ile int parametre değerini
        // çarpıp sonucu yazdıran bir method oluşturun

        int sayi = 5;

        String str1 = "Zulal";
        String str2 = "Zeynep";
        String str3="Ali";


        carpım(sayi,str1,str2);   // str lar artabilir

        // bir method da varargs dısında parametre kullanacaksak
        // önce diğer parametreleri yazıp , varargs ı en sona yazmalıyız
        // bu sebeple bir method da birden fazla varargs olamaz

    }

    private static void carpım(int sayi, String...str) {

        String enUzunStr="";

        for (String each: str
        ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;

            }
        }
        System.out.println("Istenen deger : " + sayi * enUzunStr.length());

    }
}
