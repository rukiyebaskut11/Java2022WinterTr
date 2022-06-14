package day33_varrargs_stringBuilder;

public class C01_Varargs {

    public static void main(String[] args) {

       // kaç tane string verilirse verilsin
       // içlerinden en uzun olani yazdıran bir method oluşturun

        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Oguzhan";
        String str4 = "Samet";



        // yazilan argüment sayisi sabitse herzamanki gibi bir method oluşturabiliriz
        // ancak argument sayısının degişme ihtimali varsa
        // o zaman varargs tercih edilir

        enUzunKelime(str1,str2,str3,str4);

    }

    private static void enUzunKelime(String...str) {

        String enUzunStr="";

        for (String each: str
             ) {
            if (each.length()>enUzunStr.length()){
                enUzunStr=each;

            }
        }

        System.out.println("En uzun kelime : "+ enUzunStr); // En uzun kelime : Oguzhan

    }
}
