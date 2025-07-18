import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print(" Enter marks for Subject " + i + " (out of 100): ");
            double marks = scanner.nextDouble();

            // Optional validation
            if (marks < 0 || marks > 100) {
                System.out.println(" Invalid marks. Please enter a value between 0 and 100.");
                i--; // Ask again for this subject
                continue;
            }

            totalMarks += marks;
        }

        double averagePercentage = totalMarks / numSubjects;
        String grade;

        // Assign grade based on percentage
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println("\n Result Summary:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}