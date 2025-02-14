CT101/G/21120/23
Shadrack Omondi

import java.util.Scanner;

// Class StudentRecord with three fields: studentID, name, and course.
class StudentRecord {
    private String studentID;
    private String name;
    private String course;

    // Constructor to initialize the fields when an object is created.
    public StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to display the student details.
    public void displayInfo() {
        System.out.println("\nStudent Details:");
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

// Class Student to prompt user input and display student details.
public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to input student details.
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        // Instantiate a StudentRecord object using the user-provided data.
        StudentRecord record = new StudentRecord(studentID, name, course);

        // Call the displayInfo method to display the student's details.
        record.displayInfo();

        scanner.close();
    }
}