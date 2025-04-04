public class Validator {
    public static void validateCourseCode(String courseCode){
        if (courseCode.matches("FW\\d{3}") == false) {
            throw new IllegalArgumentException("Course code must be 5 characters, starting with 'FW' followed by 3 digits.");
        }
    }  
   
    public static void validateStatus(String status){
        if(!(status.equals("active") || status.equals("in-active")))
            throw new IllegalArgumentException("Status only acept active or in-active");
    }  


    public static void validateFlag(String flag){
        if(!(flag.equals("optional") || flag.equals("mandatory") || flag.equals("N/A")))
            throw new IllegalArgumentException("Flag only acept optional, mandatory or N/A");
    }  
}
