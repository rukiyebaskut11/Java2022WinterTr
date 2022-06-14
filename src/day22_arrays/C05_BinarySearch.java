package day22_arrays;

import java.util.Arrays;

public class C05_BinarySearch {

    public static void main(String[] args) {

        //verilen array de istenen bir elementin var olup olmadığını true/false yazdıraral
        //gösteren bir method oluşturun

        int arr[]={3,5,6,1,9,45,25,4,9,0};
        int istenenSayı=1;

        istenenElemanVarMı(arr, istenenSayı);



    }

    private static void istenenElemanVarMı(int[] arr, int istenenSayı) {

        boolean sonuc=false;
        for (int i = 0; i < arr.length ; i++) {

            if(arr[i]==istenenSayı){
                sonuc=true;
                break;
            }

        }

        System.out.println(sonuc);
    }
}
