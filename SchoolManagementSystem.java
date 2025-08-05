import subjectInformation.*;
import java.time.LocalDate;
import java.util.Scanner;

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();  // consume the newline character after nextInt()
        
        // create object student 
        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter your name: ");
            String nameInput = scanner.nextLine();

            System.out.print("Enter date of birth (YYYY-MM-DD): ");
            String dateOfBirth = scanner.nextLine();
            LocalDate dob = LocalDate.parse(dateOfBirth);

            System.out.print("Enter parent's name: ");
            String parentsInput = scanner.nextLine();

            System.out.print("Enter your telephone number: ");
            String telephone = scanner.nextLine();

            System.out.print("Enter your email: ");
            String emailInput = scanner.nextLine();


            students[i] = new Student(nameInput, dob, parentsInput, telephone, emailInput);

            // show immediate confirmation
            System.out.println("Saved: " + students[i]);
        }

        scanner.close();

        // Display all students
        System.out.println("\n--- Student List ---");
        for (Student s : students) {
            System.out.println(s);  // calls toString() in Student class
        }
    }
}
