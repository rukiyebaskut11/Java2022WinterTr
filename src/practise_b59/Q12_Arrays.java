package practise_b59;

import java.util.Scanner;

public class Q12_Arrays {
    public static void main(String[] args) {

        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
          3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)

         */
        int arr[] = new int[8];    // 8 elemanlı bas int type array create edildi
        Scanner scan=new Scanner(System.in);

        int sayac =0;

        for (int i = 0; i <arr.length ; i++) {

            System.out.print(i+ ". index elemanı giriniz : ");

            arr[i] = scan.nextInt();

            if (arr[i]%3==0){       // array ın her bir elemanının 3 e tam bölünme kontrolü yapıldı
                sayac++;

            }

        }
        System.out.println("3 e tam bölünebilen eleman sayısı : " + sayac);
    }
}
