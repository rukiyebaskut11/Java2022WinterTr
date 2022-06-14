package day47_linkedList;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {

        // List den gelen özellikleri biliyoruz
        // onun icin Deque den gelen özelliklere bakalım

        Deque<Integer> ll1 = new LinkedList<>();
        ll1.addFirst(10);  // basa element ekler
        ll1.addLast(20);   // sona element ekler, add() göre daha hızlıdır

        System.out.println(ll1);  // [10, 20]
        System.out.println(ll1.element());     // 10 --> ilk elementi silmeden bize döndürür
                                               // ilk elementi yoksa Exception fırlatır
        System.out.println(ll1);  // [10, 20]


        System.out.println(ll1.getLast()); // 20
        System.out.println(ll1.getFirst()); //  10
        ll1.offer(30);  //  sona ekler ama bize birsey döndürmez
        System.out.println(ll1);  // [10, 20, 30]
        ll1.offerLast(40); // sona ekler ve bize true döndurur
        System.out.println(ll1);  // [10, 20, 30, 40]
        ll1.addFirst(50);
        System.out.println(ll1);  // [50, 10, 20, 30, 40]

        System.out.println(ll1.peek());  // ilk elementi silmeden bize döndurur
                                         // bulamazsa null döndurur

        ll1.poll();
    }
}
