package day21_arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        // array'ı nasıl declare ederiz
        //data türü array2ın ismi ve köşeli parantez yaparak declare ederiz

        int arr1[] = {1,3,5};
        int[] arr2 = {2,3,5};
        int [] arr3 = {1,4,5};

        double arr4[]={10.2,20.1,5};

        String arr5[]={"Ali","Veli","Ayse"};

        // assign mecburi midir?

        int sayı;
        int arr6[];
        // kullanmadan önce mutlaka deger ataması yapmanız gerekir

        // hem declare edip hem de atama yapacaksam nasıl yapabilirim?
        String arr7[]={"Ali","Veli","Ayse"};

        // 1- declare edip esitliğin sağına süslü parantez içerisinde değerleri yazabilirim
        // 2- içine değer atamadan oluşturmak isterseniz , boyutunu belirlememiz gerekir

        int arr8[]= new int[5]; // java içinde 5 tane default değer olan bir array oluşturur
                                // [0,0,0,0,0]


    }
}
