package P04_okulYönetimi;

public class Course {


    Teacher teacher;
    String name;
    String prefix;
    int noteYazili;
    int noteSozlu;

    public Course(int noteYazili, int noteSozlu) {
        this.noteYazili = noteYazili;
        this.noteSozlu = noteSozlu;
    }

    public Course(String name, String prefix) {
        this.name = name;
        this.prefix = prefix;

    }

    public void addTeacher(Teacher t){
         this.teacher = t;


    }
        public void printTeacher(){

            System.out.println("Ders adi : " + this.name + " ögretmenin ismi : "+ teacher.name +
                                 "  ögretmenin bransi : " + teacher.branch );


        }

    }

