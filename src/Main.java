public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course edeby = new Course("Edebiyat", "EDB101", "EDB");
        Course biyo = new Course("Biyoloji", "BIO101", "BIO");


        Teacher t1 = new Teacher("M", "1", "MAT");
        Teacher t2 = new Teacher("F", "2", "FZK");
        Teacher t3 = new Teacher("O", "3", "KMY");
        Teacher t4 = new Teacher("L", "5", "EDB");
        Teacher t5 = new Teacher("H", "5", "BIO");


        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);
        edeby.addTeacher(t4);
        biyo.addTeacher(t5);


        Student s1 = new Student("x", 4, "140144015", mat, fizik, kimya,biyo,edeby);
        s1.addBulkExamNote(50,20,40,50,100);
        s1.isPass();

        Student s2 = new Student("y", 4, "2211133", mat, fizik, kimya,biyo,edeby);
        s2.addBulkExamNote(100,50,40,59,85);
        s2.isPass();

        Student s3 = new Student("z", 4, "221121312", mat, fizik, kimya,biyo,edeby);
        s3.addBulkExamNote(50,20,40,85,98);
        s3.isPass();

    }
}