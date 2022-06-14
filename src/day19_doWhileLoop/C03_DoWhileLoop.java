package day19_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        //kullnıcıdan pozitif bir tamsayı alıp
        // while loop ile sayıdan küçük pozitif tam sayıları yazdıralım

        int input=3;

        int sayı=1;


        while (sayı<input){
            System.out.println(sayı);

            sayı++;
        }
        // aynı soruyu do while loop ile yapalım

        sayı=1;

        do {
            System.out.println(sayı);

            sayı++;

        }while (sayı<input);
    }
}
