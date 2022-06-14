package day14_stringManipulation;

public class C04_İsimGizleme {
    public static void main(String[] args) {
        // Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //      isim-soyisim : M***** B*******
        //      kart no : **** **** **** 1234

        String isim="yasemin yalcın";
        String soyİsim= "sarı";
        String kKNo="1234567890128795";

        String yeniİsim= isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");

        String yeniSoyİsim=soyİsim.substring(0,1).toUpperCase()+
                soyİsim.substring(1).replaceAll("\\S","*");

        String yeniKKNo= "**** **** **** " + kKNo.substring(12);
        System.out.println("isim-soyİsim : "+yeniİsim+" "+yeniSoyİsim+
                              "\nkart no : " + yeniKKNo);



    }
}
