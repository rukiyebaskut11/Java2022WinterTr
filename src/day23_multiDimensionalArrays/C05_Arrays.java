package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {

        // verilen bir array'e yeni bir element ekleyen bir method oluşturun

        int arr[]= {3,5,7};

        //arr[3]=8; array'de olmayan bir index e atama yapamayız

        //arr={1,3,5};  var olan bir array'e aynı boyutta bile olsa direk yeni değerler içeren bir array atayamayız

        arr = new int[4];
        System.out.println(Arrays.toString(arr));  //[0, 0, 0, 0]

        int arrYeni[] =new int[5];

        arr=arrYeni;
        System.out.println(Arrays.toString(arr));  //[0, 0, 0, 0, 0]

        arrYeni[0]=2;
        arrYeni[3]=5;

        arr=arrYeni;
        System.out.println(Arrays.toString(arr));  //[2, 0, 0, 5, 0]

        // bir array'e içinde hazır elementlerin olduğu yeni bir array atamak istersek
        // bunu {1,2,3} şeklinde yazarak değil
        // new int[3] diyerek oluşturup sonra değer atayarak tamamladığınız bir array'i
        // assign ederek yapabiliriz

        int arrEnYeni[]={1,2,3,4,5};
        arr=arrEnYeni;
        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, 5]

    }
}
