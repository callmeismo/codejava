import java.util.*;
public class PersonManage { 
    private static Person[] persons = new Person[3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 3) {
            System.out.println("Enter 1 to add Student or 2 to add Teacher:");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            
                if (choice == 1) {
                    try {
                    // Add Student
                    System.out.print("Enter full name: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Enter gender: ");
                    String gender = scanner.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter birth date (dd/MM/yyyy): ");
                    String birthDate = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    String studentId = scanner.nextLine();
                    System.out.print("Enter theory mark: ");
                    double theory = scanner.nextDouble();
                    System.out.print("Enter practice mark: ");
                    double practice = scanner.nextDouble();
    
                    persons[count++] = new Student(fullName, gender, phone, birthDate, email, studentId, theory, practice);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Input is not valid" + e.getMessage());
                    }
                } else if (choice == 2) {
                    // Add Teacher
                    try {
                    System.out.print("Enter full name: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Enter gender: ");
                    String gender = scanner.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter birth date (dd/MM/yyyy): ");
                    String birthDate = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter basic salary: ");
                    double basicSalary = scanner.nextDouble();
                    System.out.print("Enter subsidy: ");
                    double subsidy = scanner.nextDouble();
    
                    persons[count++] = new Teacher(fullName, gender, phone, birthDate, email, basicSalary, subsidy);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Input is not valid" + e.getMessage());
                    }
        }

    }
}
}
