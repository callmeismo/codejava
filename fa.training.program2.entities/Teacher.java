
public class Teacher extends Person{
    private double basicSalary;
    private double subsidy;

    public Teacher(String fullName, String gender, String phone, String birthDate,
    String email, double basicSalary, double subsidy){
        super(fullName,gender,phone,birthDate,email);
        this.basicSalary = basicSalary;
        this.subsidy = subsidy;
    }

    public double calculateSalary(){
        return basicSalary + subsidy;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + calculateSalary();
    }
}
