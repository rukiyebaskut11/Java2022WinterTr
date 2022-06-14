package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {

        //kullanıcıdan iki tam sayı alıp
        //bu sayıları ve aralarındaki tüm tam sayıları yazdıran bir kod oluşturun

        int baslangıc=40;
        int bitis=60;

        for (int i = baslangıc; i <=bitis ; i++) {
            System.out.print(i+ " ");

        }
        System.out.println("");


        //aynı soruyu while loop la yapalım

        int i=baslangıc;
        while (i<=bitis){

            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        System.out.println(baslangıc); //61 yazar
    }
}
