package practise_b59;

public class Q07_Arrays {
    public static void main(String[] args) {

        /* TASK :
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,-3},{41,55},{-61,-17,80}}
         * Output : 80
         */

        int arr[][]={{1,2,-3},{41,55},{-61,-17,80}};
        System.out.println("girdiğiniz array'in max elemanı : "+ maxDegerBul(arr));    // 80


    }
    public static int maxDegerBul(int arr[][]) {

        int max=arr[0][0];   // method dan return edilecek max elemanın atanacağı container create edildi


        for (int kat = 0; kat < arr.length; kat++) {   // kat kontrolü yapıldı
            for (int daire = 0; daire <arr[kat].length ; daire++) {  // daire kontrolü yapıldı
                if (arr[kat][daire]>max){
                    max=arr[kat][daire];
                }

            }


        }
        return max;

    }
}
