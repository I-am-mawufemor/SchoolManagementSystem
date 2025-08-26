import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

import assementAndGrading.Assessment;
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

      

        // Display all students
        System.out.println("\n--- Student List ---");
        for (Student s : students) {
            System.out.println(s);  // calls toString() in Student class
        }

        // instantiate class assement and grading
        Assessment assessment = new Assessment();

        
        System .out.println("\n--- Enter Assessment Scores ---");
        int choice = -1;
        while (choice != 0) {
            System.out.println("\nChoose an action:\n1. Enter score for student \n2. Update Score \n3. Delete Score \n4. Generate student Assement  \n5. Display Continue Assessment\n0. Exit ");
            
            try{
                choice = scanner.nextInt();
                scanner.nextLine();  // consume newline
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // clear the invalid input
                continue;
            }

            switch (choice) {
                case 1:
                boolean validInput = false;
                double projectScore = 0;

                while (!validInput) {
                    System.out.print("Enter project score (0-20): ");
                    try {
                        projectScore = scanner.nextDouble();
                        if (projectScore >= 0 && projectScore <= 20) {
                                assessment.setProject(projectScore); 
                        validInput = true;
                        } else {
                                System.out.println("Invalid input. Your score must be between 0 and 20.");
                                }
                  } 
                  catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scanner.nextLine(); // clear invalid input
                        }
                }

                // Test 1 score input validation
                double testOne = 0;
                validInput = false;
                while (!validInput) {
                    System.out.print("Enter test 1 score (0-30): ");
                    try {
                        testOne = scanner.nextDouble();
                        if (testOne >= 0 && testOne <= 30) {
                                assessment.setTestOne(testOne); 
                        validInput = true;
                        } else {
                                System.out.println("Invalid input. Your score must be between 0 and 30.");
                                }
                  } 
                  catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid test score.");
                        scanner.nextLine(); // clear invalid input
                        }
                }

                // validate 

                    // / Test 2 score input validation
                double testTwo = 0;
                validInput = false;
                while (!validInput) {
                    System.out.print("Enter test 1 score (0-30): ");
                    try {
                        testTwo = scanner.nextDouble();
                        if (testTwo >= 0 && testTwo <= 30) {
                                assessment.setTestTwo(testTwo); 
                        validInput = true;
                        } else {
                                System.out.println("Invalid input. Your score must be between 0 and 30.");
                                }
                  } 
                  catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid test score.");
                        scanner.nextLine(); // clear invalid input
                        }
                }

                // Groupwork score input validation
                double groupWork = 0;
                validInput = false;
                while (!validInput) {
                    System.out.print("Enter group work score (0-20): ");
                    try {
                        groupWork = scanner.nextDouble();
                        if ( groupWork>= 0 && groupWork <= 20) {
                                assessment.setGroupWork(groupWork);
                        validInput = true;
                        } else {
                                System.out.println("Invalid input. Your score must be between 0 and 20.");
                                }
                  } 
                  catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid test score.");
                        scanner.nextLine(); // clear invalid input
                        }
                }

                  
                    // Exam score input validation
                  
                double examScore = 0;
                validInput = false;
                while (!validInput) {
                    System.out.print("Enter group work score (0-20): ");
                    try {
                        examScore = scanner.nextDouble();
                        if ( examScore>= 0 && examScore <= 20) {
                                assessment.setExamsScore(examScore);
                        validInput = true;
                        } else {
                                System.out.println("Invalid input. Your score must be between 0 and 20.");
                                }
                  } 
                  catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a valid test score.");
                        scanner.nextLine(); // clear invalid input
                        }
                }
                    System.out.println("Scores entered successfully.");
                    break;

            }
       
        }
          scanner.close();
    }
}
