import java.util.Scanner;

public class CourseManagement {
    private Course[] courses = new Course[10];
    private Scanner scanner = new Scanner(System.in);

    public void inputCourses() {
        for (int i = 0; i < courses.length; i++) {
            courses[i] = new Course();
            courses[i].input(); 
        }
    }

    public void find(String type, Object data) {
        for (Course course : courses) {
            if (course != null) {
                switch (type.toLowerCase()) {
                    case "coursecode":
                        if (course.getCourseCode().equals(data)) {
                            System.out.println(course);
                        }
                        break;
                    case "coursename":
                        if (course.getCourseName().equals(data)) {
                            System.out.println(course);
                        }
                        break;
                    case "status":
                        if (course.getStatus().equals(data)) {
                            System.out.println(course);
                        }
                        break;
                    case "flag":
                        if (course.getFlag().equals(data)) {
                            System.out.println(course);
                        }
                        break;
                }
            }
        }
    }

    public void displayMandatoryCourses() {
        System.out.println("Mandatory Courses:");
        for (Course course : courses) {
            if (course != null && course.getFlag().equalsIgnoreCase("Mandantory")) {
                System.out.println(course);
            }
        }
    }

    public static void main(String[] args) {
        CourseManagement management = new CourseManagement();
        management.inputCourses(); 
        management.displayMandatoryCourses(); 

        System.out.print("Enter attribute to search (courseCode, courseName, status, flag): ");
        Scanner searchScanner = new Scanner(System.in);
        String attribute = searchScanner.nextLine();
        System.out.print("Enter value to search: ");
        String value = searchScanner.nextLine();
        management.find(attribute, value); 
        searchScanner.close();
    }
}