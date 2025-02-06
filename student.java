import java.util.Scanner;

// Student class
class Student {
    private String name;
    private double marks;

    // Constructor to initialize attributes
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public double getMarks() {
        return marks;
    }
}

// GradeCalculator class
class GradeCalculator {
    // Method to calculate grade based on marks
    public String calculateGrade(double marks) {
        if (marks > 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "D";
        }
    }
}

// MainApp class
public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept user input to create a student object
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student marks: ");
        double marks = scanner.nextDouble();

        // Create Student object
        Student student = new Student(name, marks);

        // Use GradeCalculator class to compute the grade based on the student marks
        GradeCalculator gradeCalculator = new GradeCalculator();
        String grade = gradeCalculator.calculateGrade(student.getMarks());

        // Display the student details along with calculated grade
        student.displayDetails();
        System.out.println("Grade: " + grade);
    }
}
