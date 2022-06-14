package day27_constructor;

public class VolvoRunner2 {

    public static void main(String[] args) {

        // her obje oluşturduğumuzda model ,yakıt gb değerleri tek tek atama
        // yapmak istemiyorsanız

        Volvo arb1 = new Volvo("XC60",false,2023,"Benzin");

        System.out.println( arb1);  //Model : XC60 Yakit : Benzin Max Hız : 240


        Volvo arb2=new Volvo("XC90",true,2021,"Elektrikli");
        System.out.println(arb2); // Model : XC90 Yakit : Elektrikli Max Hiz : 160

    }
}
