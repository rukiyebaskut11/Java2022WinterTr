package day27_constructor;

public class Volvo {

    String marka="Volvo";
    String mensei="Isvec";
    String model;

    boolean elektrikliMi;
    int yil;
    String yakit;

    boolean otomatikPilot=otomatikPilotSorgusu();   //elektrikli ise otomatik pilot var kabul ediyoruz

    int maxHiz=maxHizAta();

    public Volvo(String mdl, boolean elk, int yl, String ykt) {

        model=mdl;
        elektrikliMi=elk;
        yil=yl;
        yakit=ykt;
        maxHiz=maxHizAta();
        otomatikPilot=otomatikPilotSorgusu();
    }


    public Volvo(){


    }


    public int maxHizAta() {

        int maxHız=0;
        if (elektrikliMi){
            maxHiz=160;
        }else {
            maxHiz=240;
        }
        return maxHiz;
    }



    public boolean otomatikPilotSorgusu() {

        boolean sonuc=false;

         if(elektrikliMi) {
             sonuc = true;

         }
         return sonuc;
    }


    public String toString(){
        String arabaOzellikleri="Model : "+ model+
                                 " Yakit : "+ yakit+
                                " Max Hiz : "+ maxHiz;


        return arabaOzellikleri;
    }
}
