package day18_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        // Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin
        // ve girilen sayinin faktoryel'ini bulun. (5!=5*4*3*2*1)

        int input=9;
        int faktöriyel=1;

        String faktöriyelAcıkYazım="";

        for (int i = input; i >=1 ; i--) {

            faktöriyel *=i;
            if(i==input){
                faktöriyelAcıkYazım=faktöriyelAcıkYazım + i;
            }else
            faktöriyelAcıkYazım=faktöriyelAcıkYazım+"*" + i ;

        }

        System.out.println(input+"! = "+faktöriyelAcıkYazım + " =" + faktöriyel);
    }
}
