package day25_lists;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOlusturma {

    public static void main(String[] args) {

        // verilen bir array i listeye çevirin

        String arr[]={"A" , "B" , "C"};
        List<String> arraydenList=Arrays.asList(arr);

        // arrayden liste çevirdiğimiz zaman yeni list in uzunluğunu değiştiremeyiz
        // dolayısıyla yeni list ile add() , remove() , clear() gb methodlar çalıştırmak
        // istediğimizde Exception oluşur

        //arraydenList.add("J"); // UnsupportedOperationException

        System.out.println("21.satırda list :" + arraydenList); //21.satırda list :[A, B, C]

        arr[1]="F";

        System.out.println("25.satırda Array : " + Arrays.toString(arr)); //25.satırda Array : [A, F, C]
        System.out.println("26.satırda list :" + arraydenList); //26.satırda list :[A, F, C]

        arraydenList.set(0,"Y");

        System.out.println("30.satırda Array : " + Arrays.toString(arr)); //30.satırda Array : [Y, F, C]
        System.out.println("31.satırda list : " + arraydenList);  //31.satırda list : [Y, F, C]

    }
}
