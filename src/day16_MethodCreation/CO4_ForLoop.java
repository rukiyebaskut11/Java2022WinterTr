package day16_MethodCreation;

public class CO4_ForLoop {
    public static void main(String[] args) {

        // verilen string i tersten yazdıran bir kod yazınız

        String str = "Java cok zevkli";

        for (int i = str.length()-1 ; i >=0 ; i--) {

            System.out.print(str.substring(i,i+1));
        }

        }
    }
