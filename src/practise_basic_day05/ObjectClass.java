package practise_basic_day05;

public class ObjectClass {

    /*
     * Object Class’i olusturun burada OgretmenBilgileri Class indan
     * object ureterek yeni
     * ogretmenler olusturun ve bilgilerini yazdirin
     */

    public static void main(String[] args) {

        OgretmenBilgileri obj1 = new OgretmenBilgileri();
        obj1.isim = "Ahmet";
        obj1.soyisim = "Kaya";
        obj1.yas = 32;
        obj1.brans = "Fizik";
        obj1.tel = "123456789";


        OgretmenBilgileri obj2 = new OgretmenBilgileri();
        obj2.isim = "Gülsen";
        obj2.soyisim = "Genc";
        obj2.yas = 35;
        obj2.brans = "Bilgisayar Ogretmenligi";
        obj2.tel = "987654321";


        System.out.println(obj1.isim +" "+obj1.soyisim+", "+obj1.yas +", "+obj1.brans+", "+obj1.tel);
        System.out.println(obj2.isim +" "+obj2.soyisim+", "+obj2.yas +", "+obj2.brans+", "+obj2.tel);




    }
}