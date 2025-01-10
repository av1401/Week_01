import java.util.*;

class GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Create arrays to store marks, percentages, and grades
        double[] physicsMarks = new double[numStudents];
        double[] chemistryMarks = new double[numStudents];
        double[] mathsMarks = new double[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            // Input Physics marks
            System.out.print("Physics marks: ");
            physicsMarks[i] = input.nextDouble();
            while (physicsMarks[i] < 0) {
                System.out.println("Invalid input. Marks cannot be negative.");
                System.out.print("Physics marks: ");
                physicsMarks[i] = input.nextDouble();
            }

            // Input Chemistry marks
            System.out.print("Chemistry marks: ");
            chemistryMarks[i] = input.nextDouble();
            while (chemistryMarks[i] < 0) {
                System.out.println("Invalid input. Marks cannot be negative.");
                System.out.print("Chemistry marks: ");
                chemistryMarks[i] = input.nextDouble();
            }

            // Input Maths marks
            System.out.print("Maths marks: ");
            mathsMarks[i] = input.nextDouble();
            while (mathsMarks[i] < 0) {
                System.out.println("Invalid input. Marks cannot be negative.");
                System.out.print("Maths marks: ");
                mathsMarks[i] = input.nextDouble();
            }

            // Calculate percentage
            double totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (totalMarks / 300) * 100;

            // Determine grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "A - Remark Level 4, above agency-normalized standard";
            } else if (percentages[i] >= 70) {
                grades[i] = "B - Remark Level 3, at-normalized standard";
            } else if (percentages[i] >= 60) {
                grades[i] = "C - Remark Level 2, below, but approaching agency-normalized standard";
            } else if (percentages[i] >= 50) {
                grades[i] = "D - Remark Level 1, well below agency-normalized standard";
            } else if (percentages[i] >= 40) {
                grades[i] = "E - Remark Level 1, too below agency-normalized standard";
            } else {
                grades[i] = "R - Remark Remedial standards";
            }
        }

        // Display the results
        System.out.println("\nMarks, Percentage, and Grades of Students:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + "\t" +
                    physicsMarks[i] + "\t\t" +
                    chemistryMarks[i] + "\t\t" +
                    mathsMarks[i] + "\t\t" +
                    percentages[i] + "%\t\t" +
                    grades[i]);
        }
    }
}
