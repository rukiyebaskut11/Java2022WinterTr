package day33_varrargs_stringBuilder;

public class C06_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Prize dikkat");

        System.out.println(sb1.insert(12," edin."));

        String str = "Hayatta cok guzel seyler var";

        System.out.println(sb1.insert(0,str,0,8)); // hayatta prize dikkat edin

        System.out.println(sb1.reverse()); // .nide takkid ezirP attayaH

        System.out.println(sb1.reverse()); // hayatta prize dikkat edin

        System.out.println(sb1.substring(3,5)); // at

        System.out.println(sb1); // hayatta prize dikkat edin

        System.out.println(sb1.subSequence(3,5));  // at

        System.out.println(sb1); // hayatta prize dikkat edin
    }
}
