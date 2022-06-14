package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C03_LinkedList {

    public static void main(String[] args) {

        Deque<Integer>ll1= new LinkedList<>();

        System.out.println(ll1.peek()); // boşken kulanırsak null dondurur
       // System.out.println(ll1.element()); bosken kullanırsak excption fırlatır

        System.out.println(ll1.poll());  // boşken kullanırsak null dondurur
        System.out.println(ll1.pollFirst());
        System.out.println(ll1.pollLast());

        // ll1.pop();   // ilk elementi silip, bize donurur
                     // ilk lementi bulamazsa exception fırlatır

        ll1.push(30); //listenin basına element ekler
        ll1.push(20);
        System.out.println(ll1);

        System.out.println(ll1.remove());  // ilk elementi siler ve bize dondurur
        ll1.push(40);
        ll1.push(50);
        ll1.remove(50);  // object oarak 50 yi siler
        ll1.push(30);
        System.out.println(ll1);
        ll1.removeFirstOccurrence(30);
        System.out.println(ll1);


    }
}
