package day26_forEachLoop_constructor;

public class Araba {
    /* Java da her class oluşturduğumuzda
        Java o class dan ileride objeler üretmek gerekeceğini bilir
        ve biz özellikle belirtmesek de Java
        her oluşturduğu class a bir constructor koyar

        Java nın class oluştururken class a koyduğu constructor a
        DEFAULT CONSTRUCTOR denir ve bu constructor görünmez

        eğer biz görünür bir constructor 'imiz olsun istersek
        default constructor ile aynı görevi yapan bir constructor oluşturabiliriz
        veya istersek aynı kalıptan farklı desenlerde objeler oluşturmak için
        farklı özelliklerde constructorlar da oluşturabiliriz

        constructor'ları birbirinden farklılaştıran tek ayrıcalık
        kullanılan parametre sayısı ve parametre data türüdür

     */

    public Araba(){

        System.out.println("parametresiz constructor calıstı");

    }
    /* bir kod bloğunun method veya constructor olmasından emin olmak istiyorsanız
       iki şeye dikkat etmelisiniz
       1- constructor'in ismi class ismi ile aynı olmak zorundadır yani büyük harfle başlar
       2- constructor'ların return type'i olmaz


       özetle  : constructor'ın adı class adı ile aynı olmalı ve
                 return type'i olmamalı
     */

    public Araba(String renk){
        System.out.println(renk + " renkli bir araba uretildi");
    }
    public Araba(int yil){
        System.out.println( yil + " model bir araba üretildi");
    }
    public Araba(int yil,String renk){
        System.out.println(yil + " model" + renk + " renginde bir araba üretildi");
    }




}
