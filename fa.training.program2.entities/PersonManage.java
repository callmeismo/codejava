import java.util.*;
public class PersonManage {
    static Person[] persons = new Person[2];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count < 2) {
            System.out.println("Enter 1 to add Student or 2 to add Teacher:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            try{
            if (choice == 1) {
                // Add Student
                System.out.print("Enter full name: ");
                String fullName = scanner.nextLine();

                System.out.print("Enter gender: ");
                String gender = scanner.nextLine();

                System.out.print("Enter phone: ");
                String phone = scanner.nextLine();

                System.out.print("Enter birth date (dd/MM/yyyy): ");
                String birthDate = scanner.nextLine();
                Person.setBirthDate(birthDate);

                System.out.print("Enter email: ");
                String email = scanner.nextLine();
                Person.setEmail(email);

                System.out.print("Enter student ID: ");
                String studentId = scanner.nextLine();

                System.out.print("Enter theory mark: ");
                double theory = scanner.nextDouble();
                Student.setTheory(theory);

                System.out.print("Enter practice mark: ");
                double practice = scanner.nextDouble();
                Student.setPractice(practice);

                persons[count++] = new Student(fullName, gender, phone, birthDate, email, studentId, theory, practice);
            } else if (choice == 2) {
                // Add Teacher
                System.out.print("Enter full name: ");
                String fullName = scanner.nextLine();

                System.out.print("Enter gender: ");
                String gender = scanner.nextLine();

                System.out.print("Enter phone: ");
                String phone = scanner.nextLine();

                System.out.print("Enter birth date (dd/MM/yyyy): ");
                String birthDate = scanner.nextLine();
                Person.setBirthDate(birthDate);

                System.out.print("Enter email: ");
                String email = scanner.nextLine();
                Person.setEmail(email);    

                System.out.print("Enter basic salary: ");
                double basicSalary = scanner.nextDouble();

                System.out.print("Enter subsidy: ");
                double subsidy = scanner.nextDouble();

                persons[count++] = new Teacher(fullName, gender, phone, birthDate, email, basicSalary, subsidy);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Input is not valid: " + e.getMessage());

            }
        }

        // Displaying teachers with salary more than 1000
        System.out.println("\nTeachers with salary greater than $1000:");
        for (Person person : persons) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.calculateSalary() > 1000) {
                    System.out.println(teacher);
                }
            }
        }

        // Updating a student
        System.out.print("\nEnter student ID to update: ");
        String studentIdToUpdate = scanner.nextLine();
        for (Person person : persons) {
            if (person instanceof Student && ((Student) person).studentID.equals(studentIdToUpdate)) {
                System.out.print("Enter new full name: ");
                person.fullName = scanner.nextLine();
                break;
            }
        }

        // Reporting students who qualify to pass the course
        System.out.println("\nStudents who qualify to pass:");
        for (Person person : persons) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (student.calculateFinalMark() >= 6) {
                    System.out.println(student);
                }
            }
        }

        scanner.close();
        
    }
}