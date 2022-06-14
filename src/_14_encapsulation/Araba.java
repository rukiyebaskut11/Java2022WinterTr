package _14_encapsulation;

public class Araba {  // POJO : planning old java object--->modal class

    private String model;
    private String renk;
    private int motor;
    private  int yil;


    public Araba() {  // parametresiz constructor

    }

    public Araba(String model, String renk, int motor, int yil) {  // parametreli constructor

        this.model = model;
        this.renk = renk;
        this.motor = motor;
        this.yil = yil;




    }

    public Araba(int motor, int yil) {  // parametreli cons
        this.motor = motor;
        this.yil = yil;



    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor<1000){
            System.out.println("agam bizimle egleir bu cc de motor mu olur");
            this.motor = motor+500;
        }else
        this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (yil<0){
            this.yil = (-1)*yil;
            System.out.println("agam nişledingg..");
        }else
        this.yil = yil;


    }

    @Override
    public String toString() {
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';


    }
}
