package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {

    public static void main(String[] args) {

        // LinkedList in 2 tane parent Interface i vardir
        // LinkedList olustururken data turu olarak ;
        // LinkedList secersek : iki parent daki tum methodlar
        // List secersek : sadece List Interface indeki methodlar
        //

        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(10);   // LinkedList class ından calıstırır



        // sadece List interface inden özellikler kullanmak istersek

        List<Integer> ll2 = new LinkedList<>();
        ll2.remove(0);



        // sadece Deque den gelen özellikleri kullanalım
        Deque<Integer>ll3=new LinkedList<>();

       ll3.addLast(20);
       ll3.addFirst(15);

        System.out.println(ll3); // [15, 20]
    }
}
