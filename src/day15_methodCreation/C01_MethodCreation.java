package day15_methodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

        String str="Java öğrenmek çok zevkli";

        //str'in ilk 4 harfini almak istesek
        str.substring(0,4);

        //Bir program yaparken kodlarımızın daha kısa ve anlaşılabilir olması için
        //sürekli kullanabileceğimiz kod blokları hazır olarak bir yere koyar
        //ihtiyacımız oldukça oradan alıp kullanırız

        //method'lar robotlara benzer
        //method oluşturmak bazen o method'un yapacağı işi yapmaktan zor olabilir
        //bir işlemi sadece 2 kere yapacaksak method kullanmamıza gerek olmayabilir
        //ancak özellikle çok kullanacağımız işlemler için
        //her seferinde yeniden aynı kodları yazmak yerine
        //bu işlemi yapan hazır bir method oluşturmak çok daha pratiktir

        //bazen bir class ın içerisinde çok uzun kodlar yazarsak
        //tüm class ın anlaşılması zorlaşabilir
        //bunun yerine kod'un belli kısımlarını ayrı method'lar olarak oluşturup
        //main method içerisinden istediğimiz şekilde bu methodları yönetebiliriz

    }
}
