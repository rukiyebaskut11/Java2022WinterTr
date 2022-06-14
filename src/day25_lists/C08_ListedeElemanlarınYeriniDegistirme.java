package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemanlarınYeriniDegistirme {
    public static void main(String[] args) {

        // verilen bir listede , istenen iki index deki elementlerin yerini
        // kalıcı olarak değiştiren bir method oluşturun

        List<Integer> sayilar= new ArrayList<>();

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        int ilkIndex=2;
        int ikinciIndex=5;

        System.out.println("swap'dan önce list : " + sayilar);  // bu satır gereksiz , görmeniz için yazdım

        sayilar= swapElements(sayilar,ilkIndex,ikinciIndex);


        System.out.println("swap'dan önce list : " + sayilar); // bu satır gereksiz , görmeniz için yazdım


    }

    public static List<Integer> swapElements(List<Integer> sayilar, int ilkIndex, int ikinciIndex) {
        // bir tam sayı oluşturup
        // verilen index lerdeki sayıları yer değiştirin
        // indexleri kontrol edip sınırın ötesinde index verildiyse uyarı mesajı yazdırın

        int temp =0;
        if ((ilkIndex > sayilar.size()-1) || (ikinciIndex > sayilar.size()-1) || ilkIndex < 0 || ikinciIndex < 0) {
            System.out.println("Lütfen geçerli bir index giriniz");
        }else {
            temp=sayilar.get(ilkIndex);

            sayilar.set(ilkIndex,sayilar.get(ikinciIndex));

            sayilar.set(ikinciIndex,temp);

        }
           return sayilar;
    }


}
