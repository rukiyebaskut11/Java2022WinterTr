package day50_Maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps {

    public static void main(String[] args) {

        // siniftaki ögrenci listesini duzenli olarak yzdiralim

        Map<Integer,String> sinifListMap = MapOlustur.myMap();
        System.out.println(sinifListMap);

        /*

        eger key lere tek tek ulasmak istersek
        index yapisina ihtiyacimiz var
        ancak map index yapisini desteklemez
        bunun için key leri önce bir set e
        sonra da set in tum elementlerini bir list e ekledik

         */

        Set<Integer> sinifKeySeti = sinifListMap.keySet();
        List<Integer> keyList = new ArrayList<>();

        keyList.addAll(sinifKeySeti);

        System.out.println(keyList.get(2)); // 103


        // simdi de value leri index ile ulasabileceğimiz bir sekle sokalım

        Collection<String> sinifValueColl =sinifListMap.values();

        System.out.println(sinifValueColl);  // [Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, C#]
        System.out.println(sinifValueColl.size()); // 3

        List<String> sinifValueList = new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);

        System.out.println(sinifValueList);

        /*

         her bir value birden fazla bilgiyi içeriyor
         onun icin valule leri multidimensional bir array e atmak mantıklı duruyor
         ancak MDA olusturmak icin boyutları bilmeye ihtiyacımız var

         */

        int outerArrayBoyut = sinifValueList.size();
        System.out.println(outerArrayBoyut);  // 3



        // inner array lerin boyutunu bulmak biraz daha komplex olucak

       String ilkValue = sinifValueList.get(0);
        System.out.println(ilkValue);

        String ilkValueArray[]= ilkValue.split(", ");
        int innerArrayBoyut = ilkValueArray.length;

        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i < outerArrayBoyut; i++) {

            String temp[]=sinifValueList.get(i).split(", ");

            for (int j = 0; j < innerArrayBoyut; j++) {

                valueMDArr[i][j] = temp [j];
            }
            
        }

        //System.out.println(Arrays.deepToString(valueMDArr));  // [[Ali, Can, Dev], [Veli, Yan, QA], [Ali, Yan, C#]]
        /*

        bu satira kadar key leri index ile ulasabildiğim keyList e atadım
        value leri valueMDArr e atadım
        simdi bu key ve value leri istediğim gibi manuple edebilirm

         */

        System.out.println("Numara   Isim   Soyisim   Brans");
        System.out.println("===============================");

        for (int i = 0; i < keyList.size(); i++) {
            System.out.print(keyList.get(i)+ "       ");

            for (int j = 0; j <innerArrayBoyut ; j++) {
                System.out.print(valueMDArr[i][j] + "      ");

            }
            System.out.println("");
        }

    }
}
