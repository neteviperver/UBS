public class Teacher {
    String name;
    String email;
    String branch;

    public Teacher(String name, String email, String branch) {
        this.name = name;
        this.email = email;
        this.branch = branch;
}
public void printInfo(){
    System.out.println("=============================================");
    System.out.println("Akademisyenin adi:"+this.name);
    System.out.println("Akademisyenin e-maili::"+this.email);
    System.out.println("Akademisyenin bransi:"+this.branch);


}
}

