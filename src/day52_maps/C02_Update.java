package day52_maps;

import day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C02_Update {

    // verilen map deki tüm branslari Java yapalim

    public static void main(String[] args) {

        Map<Integer,String> sinifListMap = MapOlustur.myMap();

        System.out.println(sinifListMap);

        Set<Map.Entry<Integer,String>> sinifEntrySet = sinifListMap.entrySet();

        for (Map.Entry<Integer,String> each:sinifEntrySet) {

            Integer keyEntry = each.getKey();
            String valueEntry = each.getValue();
            String valueArr [] = valueEntry.split(", ");
            valueArr[2]="Java";

            

        }
    }
}
