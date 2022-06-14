package _14_encapsulation;

public class ArabaMain {

    public static void main(String[] args) {


        Araba honda = new Araba();   // parametresiz obje create edildi
        honda.setModel("accord");
        honda.setYil(2018);
        honda.setMotor(1600);
        honda.setRenk("kırmızı");


        Araba toyota = new Araba("avensis  ","beyaz  ",2000  , 2020 ); // p'li obje create edildi
        Araba volvo = new Araba("s80  ","füme ",2400 ,2010 );      // p'li obje create edildi
        Araba haciMurat= new Araba(400 , 1974);


        System.out.println("honda hayat onda "+honda);
        System.out.println(" volvo araci "+ volvo);
        System.out.println("sectiginiz arac toyota ---> "+ "modeli :"+ toyota.getModel()+ "renk :"+toyota.getRenk()+
                                                   "motor gucu :"+ toyota.getMotor()+ "yili :"+toyota.getYil());
        System.out.println("haciii "+ haciMurat);

    }
}
