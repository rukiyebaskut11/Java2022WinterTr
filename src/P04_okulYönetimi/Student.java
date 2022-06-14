package P04_okulYönetimi;

public class Student {

    Course mat;
    Course tur;
    Course bio;
    double Avarage;
    String name;
    String stuNo;
    String classes;


    public Student(Course mat, Course tur, Course bio, String name, String stuNo, String classes) {
        this.mat = mat;
        this.tur = tur;
        this.bio = bio;
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
    }

    public void addBulkExamNote(Course c ,int noteYazili,int noteSozlu){

        c.noteYazili = noteYazili;
        c.noteSozlu = noteSozlu;
        printNote(c.noteYazili,c.noteSozlu);
        calcAvarage(c,c.noteYazili,c.noteSozlu);





    }

    private void printNote(int noteYazili, int noteSozlu) {
        System.out.println("Yazili notunuz : " + noteYazili +"\nSozlu notunuz : "+noteSozlu);
    }


    public void calcAvarage(Course c,int noteYazili, int noteSozlu) {

        this.Avarage=(noteYazili*0.75)+(noteSozlu*0.25);
        isPass(c,Avarage);

    }

    public void isPass(Course c,double avarage) {
        if(avarage>=50){
            System.out.println(c.name + "  dersini gectiniz...");

        }else System.out.println(c.name + "  dersini gecemediniz...");
    }

}

