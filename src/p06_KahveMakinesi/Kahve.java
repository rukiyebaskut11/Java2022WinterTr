package p06_KahveMakinesi;

public class Kahve {


    private String kahveNo;
    private String kahveAdi;
    private String kahveBoy;
    private String sut;
    private String seker;

    public Kahve() {
    }

    public Kahve(String kahveNo, String kahveAdi) {
        this.kahveNo = kahveNo;
        this.kahveAdi = kahveAdi;
    }

    public Kahve(String kahveNo, String kahveAdi, String kahveBoy, String sut, String seker) {
        this.kahveNo = kahveNo;
        this.kahveAdi = kahveAdi;
        this.kahveBoy = kahveBoy;
        this.sut = sut;
        this.seker = seker;
    }

    @Override
    public String toString() {
        return "Kahve{" +
                "kahveNo='" + kahveNo + '\'' +
                ", kahveAdi='" + kahveAdi + '\'' +
                ", kahveBoy='" + kahveBoy + '\'' +
                ", sut='" + sut + '\'' +
                ", seker='" + seker + '\'' +
                '}';
    }

    public String getKahveNo() {
        return kahveNo;
    }

    public String getKahveAdi() {
        return kahveAdi;
    }

    public String getKahveBoy() {
        return kahveBoy;
    }

    public String getSut() {
        return sut;
    }

    public String getSeker() {
        return seker;
    }

    public void setKahveNo(String kahveNo) {
        this.kahveNo = kahveNo;
    }

    public void setKahveAdi(String kahveAdi) {
        this.kahveAdi = kahveAdi;
    }

    public void setKahveBoy(String kahveBoy) {
        this.kahveBoy = kahveBoy;
    }

    public void setSut(String sut) {
        this.sut = sut;
    }

    public void setSeker(String seker) {
        this.seker = seker;
    }
}
