package interviewQuestions1;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        /*
  Kullanicidan bir String aliniz.
  String'de var olan her character'in sayisini ekrana yazdiriniz.
  Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
         abaa   ==> a=3  b=1
       */

        Scanner scan =new Scanner(System.in);
        System.out.print("Bir string giriniz :");
        String str = scan.nextLine();

        //split
        String arr[]= str.split("");  // her bir karakteri ayırır

        System.out.println(Arrays.toString(arr));

        // sort
        Arrays.sort(arr);    // sıralar
        System.out.println(Arrays.toString(arr));

        // sayaç oluştur
        int counter=0;

        for (int i =1; i <arr.length ; i++) {
            if(arr[i-1].equals(arr[i])){
                counter++;

            }else {
                System.out.println(arr[i-1] + " sayısı " +(counter+1));
                counter=0;
            }
            if (i==arr.length-1){    //en sona geldiğinde
                System.out.println(arr[i] + " sayısı " + (counter+1));
            }

        }


    }
}
