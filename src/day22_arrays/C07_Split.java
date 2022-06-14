package day22_arrays;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {

        String str="Java gün gectikce güzellesiyor";

        String kelimeler[]=str.split(" ");  // boşluklardan bölerek 4 elementli array e döndürür

        System.out.println(Arrays.toString(kelimeler)); //[Java, gün, gectikce, güzellesiyor]
        System.out.println(kelimeler[1]); // gün


        String gectikce[]=str.split("gectikce");
        System.out.println(Arrays.toString(gectikce)); //[Java gün ,  güzellesiyor]


        String harfler[]=str.split("");
        System.out.println(Arrays.toString(harfler));
        //[J, a, v, a,  , g, ü, n,  , g, e, c, t, i, k, c, e,  , g, ü, z, e, l, l, e, s, i, y, o, r]


    }
}
