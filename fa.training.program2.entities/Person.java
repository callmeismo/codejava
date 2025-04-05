public abstract class Person {
    protected String fullName;
    protected String gender;
    protected String phone;
    protected String birthDate;
    protected String email;

    public Person(String fullName, String gender, String phone, String birthDate, String email) {
        this.fullName = fullName;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.birthDate = birthDate;
    }

    public void setEmail(String email) {
        Validator.isValidEmail(email);
        this.email = email;
    }

    public void setBirthDate(String birthDate) {
        Validator.isValidBirthDate(birthDate);
        this.birthDate = birthDate;
    }

    public String toString() {
        return "Full Name: " + fullName + ", Gender: " + gender + ", Birth Date: " + birthDate +
                ", Phone: " + phone + ", Email: " + email;
    }
}
