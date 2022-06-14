package day27_constructor;

public class Cons02 {
    public static void main(String[] args) {

        //Cons01 obj1 =new Cons01();  // default constructor devrede
        /* Cons01 class ında hiç constructor oluşturmazsak ,Java default constructor ı kullandıgından
            obj1 i üretebiliriz

           ancak biz parametreli veya parametresiz bir constructor yazdıgımızda
            java default constructor ı siler.

            dolayısıyla biz herhangi bir constructor oluşturduğumuzda
            daha önce başka classlar veya kullanıcıların
            oluşturmuş olabileceği objeleri kullanabilmeleri için
            default constructor in işlevini gerçekleştirecek
            parametresiz bir constructor oluşturmakta fayda var


         */

        Cons01 obj2 = new Cons01("Java");
    }
}
