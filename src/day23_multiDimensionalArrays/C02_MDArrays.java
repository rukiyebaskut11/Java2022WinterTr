package day23_multiDimensionalArrays;

public class C02_MDArrays {
    public static void main(String[] args) {

        //verilen multi dimensional array'in tüm elementlerinin toplamını bulunuz

        int arr[][]={{3,1,7},{6,10,2}};  // outer array 2 elemente sahiptir
                                         // 1.inner in 4 elementi 2.inner in 2 elementi vardır

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                toplam += arr[i][j];
            }

        }
        System.out.println("arraydeki elementlerin toplami : " + toplam);


    }
}
