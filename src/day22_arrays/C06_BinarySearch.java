package day22_arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {

        //eğer java da hazır BinarySearch ile yapmak isterseniz
        //önce sort methodunu kullanıp, sonra binarySearch yapmalıyız
        // binarySearch() bize istenen sayının olduğu index i verir

        int arr[]={3,5,6,1,9,45,25,4,9,0};
        int istenenSayı= 35;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));  //[0, 1, 3, 4, 5, 6, 9, 9, 25, 45]

        System.out.println(Arrays.binarySearch(arr,istenenSayı));  // -10


        // eğer olmayan bir elementi aratırsak
        //java bulamadığını göstermek için - işareti koyar
        //sonrada o sayı olsaydı sıralaması ne olacak ise o sırayı bize verir



    }
}
