package student_practise;

import java.util.Scanner;

public class Q02_MethodCreate_ForLoop {

    /* Interview Question
Write a Java program to reverse a string. // String'i ters çeviren bir Java programı yazın
Use for loop and create a method called // For loop ve method çağır'ı kullanın
reverseString = (method adı) */


    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.println("Bir String metin giriniz.");
        String str = scan.nextLine();


        tersCevir(str);



    }

    public static void tersCevir(String str) {
        String reverseStr = "";

        for (int i = str.length()-1; i>=0 ; i--) {

            reverseStr += str.charAt(i);


        }

        System.out.println(reverseStr);

    }
}
