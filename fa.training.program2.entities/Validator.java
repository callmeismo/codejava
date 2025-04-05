public class Validator {
    public static void isValidEmail(String email){
        if(email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$") == false)
            throw new IllegalArgumentException("Email is not correct");
    }

    public static void isValidBirthDate(String dateString){
        if(dateString.matches("\\d{2}/\\d{2}/\\d{4}") == false)
            throw new IllegalArgumentException("Date is not correct");
    }
    public static void isValidTheory(double theory){
        if(theory < 0 || theory > 10)
            throw new IllegalArgumentException("Theory must be between 0 and 10");
    }

    public static void isValidPractice(double practice){
        if(practice < 0 || practice > 10)
            throw new IllegalArgumentException("Theory must be between 0 and 10");
    }
}
