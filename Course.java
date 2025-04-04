import java.util.Scanner;

public class Course {
    private String courseCode;
    private String courseName;
    private double duration;
    private String status;
    private String flag;


    public Course(){
        this.courseCode = null;
        this.courseName = null;
        this.duration = 0.0;
        this.status = null;
        this.flag = null;
    }


    public Course(String courseCode, String courseName, double duration, String status, String flag){
        setCourseCode(courseCode);
        this.courseName = courseName;
        this.duration = duration;
        setStatus(status);
        setFlag(flag);
    }


    public void setCourseCode(String courseCode) {
        Validator.validateCourseCode(courseCode);
        this.courseCode = courseCode;
    }


    public String getCourseCode() {
        return courseCode;
    }


    public String getCourseName() {
        return courseName;
    }


    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public double getDuration() {
        return duration;
    }


    public void setDuration(double duration) {
        this.duration = duration;
    }


    public String getFlag() {
        return flag;
    }


    public void setFlag(String flag) {
        Validator.validateFlag(flag);
        this.flag = flag;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        Validator.validateStatus(status);
        this.status = status;
    }


    @Override
    public String toString() {
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", courseName='" + courseName + '\'' +
                ", duration=" + duration +
                ", status='" + status + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }


    public void input(){
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        while(!valid){
            try  {
                System.out.print("Enter Course Code: ");
                String code = scanner.nextLine();
                setCourseCode(code);

                System.out.print("Enter Course Name: ");
                String name = scanner.nextLine();
                setCourseName(name);

                System.out.print("Enter Duration (in hours): ");
                double duration = scanner.nextDouble();
                setDuration(duration);
                scanner.nextLine(); // Consume newline

                System.out.print("Enter Status (active/in-active): ");
                String status = scanner.nextLine();
                setStatus(status);

                System.out.print("Enter Flag (optional/mandatory/N/A): ");
                String flag = scanner.nextLine();
                setFlag(flag);
                valid = true;


            } catch (IllegalArgumentException e) {
                System.out.println("Input is not valid" + e.getMessage());
            }
        }
    }
}


