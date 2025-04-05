
public class Student extends Person{
    protected String studentID;
    private double theory;
    private double practice;

    public Student(String fullName, String gender, String phone, String birthDate,
    String email, String studentID, double theory, double practice){
        super(fullName,gender,phone,birthDate,email);
        this.studentID = studentID;
        this.theory = theory;
        this.practice = practice;
    }

    public double calculateFinalMark(){
        return (theory + practice) / 2 ;
    }

    public static void setTheory(double theory) {
        Validator.isValidTheory(theory);
    }

    public static void setPractice(double practice) {
        Validator.isValidPractice(practice);
    }

    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentID + ", Final Mark: " + calculateFinalMark();
    }
}
