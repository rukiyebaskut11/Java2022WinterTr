package day22_arrays;

public class C02_Sort {
    public static void main(String[] args) {

        //verilen bir array de en küçük ve en büyük değerleri yazdırın

        int arr[]={3,5,6,1,9,45,25,4,9,0};

        //sort method u olmadan yapalım

        int enKucukSayı=Integer.MAX_VALUE;  //arr[0];
        int enBüyükSayı=Integer.MIN_VALUE;  //arr[0];

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]<enKucukSayı){
                enKucukSayı=arr[i];

            }
            if (arr[i]>enBüyükSayı){
                enBüyükSayı=arr[i];
            }
        }

        System.out.println("Array'daki en küçük sayı : "+enKucukSayı);
        System.out.println("Array'daki en büyük sayı : "+enBüyükSayı);
    }
}
