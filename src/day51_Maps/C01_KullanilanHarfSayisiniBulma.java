package day51_Maps;

import java.util.HashMap;
import java.util.Map;

public class C01_KullanilanHarfSayisiniBulma {

    /*

    Soru 1 ) Verilen bir String’deki harfleri ve harflerin
    kacar kez kullanildigini return eden bir method yaziniz
    Ornek : Input : Hellooo   output : H=1, e=1, l=2, o=3

     */

    public static void main(String[] args) {

        String input = "Hellooo";
        String harfleArr []=input.split("");

        Map<String, Integer> kulanimSayilari = new HashMap<>();

        for (int i = 0; i < harfleArr.length; i++) {

            for (String each:harfleArr) {

                if (kulanimSayilari.containsKey(each)){

                    kulanimSayilari.put(each , kulanimSayilari.get(each)+1);

                }else {
                    kulanimSayilari.put(each,1);
                }
            }

        }

        System.out.println(kulanimSayilari);
    }
}
