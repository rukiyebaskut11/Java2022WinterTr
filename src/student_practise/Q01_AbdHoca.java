package student_practise;

import java.util.Arrays;

public class Q01_AbdHoca {
    public static void main(String[] args) {

        //Print the words ending with "y" or "Y"
        // (Make code case-insensitive)

        String input = "Learn jAvA, hOneY caney and earn money.";


        System.out.println(input);

        input = input.toLowerCase();

        input=input.replaceAll("\\p{Punct}","");

        String arr[] = input.split(" ");

        System.out.println(Arrays.toString(arr));

        String x = "";

        x = "honey";
        x= "honey caney";
        x="honey caney money";


        System.out.print(" 'y' veya 'Y' ile biten kelimeler:  ");

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].endsWith("y") || arr[i].endsWith("Y")){
                x+=arr[i]+"";
            }

        }
        System.out.print(x);
    }
}
