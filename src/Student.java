public class Student {
    String name, stuNo;
    int classes;
    Course matmatic;
    Course physic;
    Course chemical;
    Course biyology;
    Course literature;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course matmatic, Course physic, Course chemical, Course biyology, Course literature) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.matmatic =matmatic;
        this.physic = physic;
        this.chemical = chemical;
        this.biyology = biyology;
        this.literature = literature;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya, int biyo, int edby) {

        if (mat >= 0 && mat <= 100) {
            this.matmatic.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.physic.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.chemical.note = kimya;
        }
        if (biyo >= 0 && biyo <= 100) {
            this.biyology.note = biyo;
        }
        if (edby >= 0 && edby <= 100) {
            this.literature.note = edby;
        }
        else{}

    }

    public void isPass() {
        if (this.matmatic.note == 0 || this.biyology.note == 0 || this.chemical.note == 0 || this.physic.note == 0 || this.literature.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sinifi Geçti. ");
            } else {
                System.out.println("Sinifta Kaldi.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.physic.note + this.chemical.note + this.matmatic.note + this.literature.note + this.biyology.note) / 5;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.matmatic.note);
        System.out.println("Fizik Notu : " + this.physic.note);
        System.out.println("Kimya Notu : " + this.chemical.note);
        System.out.println("Biyoloji Notu:" + this.biyology.note);
        System.out.println("Edebiyat Notu:" + this.literature.note);
    }

}