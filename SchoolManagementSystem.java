import java.time.LocalDate;
import java.util.Scanner;

import subjectSchoolInfo.*;

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        //obtain school information   
        //prompt to enter name of school, address, email, telephone number, location, year established and other details 
        System.out.print("Enter name of school: ");
        String nameOfSchool = scanner.nextLine();  
       
        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.print("Enter phone number of school: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter email address: ");
        String emailAddress = scanner.nextLine();

        System.out.print("Enter name of teacher: ");
        String teacher = scanner.nextLine();

        System.out.print("Enter type of school: ");
        String schoolType = scanner.nextLine();

        System.out.print("Enter where school is located: ");
        String location = scanner.nextLine();

        School schoolInfo = new School(nameOfSchool, address, phoneNumber, emailAddress, teacher,  schoolType, location);
        System.out.print(schoolInfo);

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
