import java.util.*;

public class GradeCalculator2 {
    public static void main(String[] args) {
        // Creating a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        int numSubjects = 3;  // Fixed number of subjects (Physics, Chemistry, Maths)
        
        // Creating a 2D array to store marks of students in 3 subjects
        int[][] marks = new int[numStudents][numSubjects];
        
        // Creating an array to store grades for each student
        char[] grades = new char[numStudents];
        
        // Input marks for each student and each subject
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + " in Physics, Chemistry, and Maths:");
            for (int j = 0; j < numSubjects; j++) {
                marks[i][j] = input.nextInt();
            }
        }
        
        // Calculate percentage and grade for each student
        for (int i = 0; i < numStudents; i++) {
            int totalMarks = 0;
            for (int j = 0; j < numSubjects; j++) {
                totalMarks += marks[i][j];
            }
            
            // Calculate percentage
            double percentage = (totalMarks / (double)(numSubjects * 100)) * 100;
            
            // Determine grade based on percentage
            if (percentage >= 90) {
                grades[i] = 'A';
            } else if (percentage >= 75) {
                grades[i] = 'B';
            } else if (percentage >= 50) {
                grades[i] = 'C';
            } else {
                grades[i] = 'D';
            }
            
            // Output the result
            System.out.println("Student " + (i + 1) + " - Total Marks: " + totalMarks + "/300");
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade: " + grades[i]);
            System.out.println();
        }
    }
}
