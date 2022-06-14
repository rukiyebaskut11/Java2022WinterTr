package day20_scope_Arrays;

public class C01_InstanceVariables {

       int sayı;
       String bransIsmi="Java";
       boolean okuldaMı;

    public static void main(String[] args) {

        //sayı=10; sayı variable 'i static olmadığı için
        // main method'dan direk kullanılamaz
        //instance variable'lara static method'lardan ulaşabilmek için
        // obje oluşturmam gerekir

        C01_InstanceVariables obj1=new C01_InstanceVariables();
        System.out.println(obj1.sayı);  // bana 0 yazdırır..bir değer yazdırmadığım için .
        obj1.sayı=10;
        System.out.println(obj1.sayı);  // bana 10 verir
        obj1.bransIsmi="SQL";
        System.out.println(obj1.okuldaMı);// false


        C01_InstanceVariables obj2=new C01_InstanceVariables();
        System.out.println(obj2.sayı);  // bana 0 yazdırır..yani default değeri atar.
        System.out.println(obj2.bransIsmi); // bana Java yazdırır

        obj1.okuldaMı=true;
        System.out.println(obj2.okuldaMı); // false






    }
}
