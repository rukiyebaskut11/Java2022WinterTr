package day26_forEachLoop_constructor;

public class C01_ForEachLoop {
    public static void main(String[] args) {

        int arr[]={2,4,6,8,11};

        // elementleri for loop ile yazdıralım

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("");

        // bunu for-each loop ile yapıcak olursak
        // for-each loop u çalıştırmak iin heef bir coolection vermeliyiz

        for (int each : arr      // arr deki her bir elementi getir...each= elementlere verdiğimiz isim
             ) {
            System.out.print(each + " ");   //2 4 6 8 11
        }

        // avantajı : index , başlangıç değeri , bitiş değeri gb detaylarla
        // uğraşmamıza gerek kalmadan collections daki tüm elementleri bize getirir

        // dezavantajı : index e bağlı bir işlem yapamayız
    }
}
