package practise_b59;

public class Q08_Arrays {
    public static void main(String[] args) {

        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */

        String arr [][] =  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        double toplam =0;

        for (int i = 0; i < 3 ; i++) { // outer array için

            for (int j = 0; j < 3 ; j++) { // inner array için
                if (arr[i][j].contains("$")){
                    toplam +=Double.parseDouble(arr[i][j].replace("$","")) * 3.2;
                }else if (arr[i][j].contains("€")) {
                    toplam +=Double.parseDouble(arr[i][j].replace("€","")) * 4.2;
                }


            }

            System.out.println("toplam = " + toplam); //toplam = 374.6

        }


    }
}
