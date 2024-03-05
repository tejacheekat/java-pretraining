\*7. The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'.*/


public class GradeCalculator {
    public static void main(String[] args) {
        // Given data
        int totalStudents = 90;
        int boys = 45;
        double gradeAPercentage = 50.0; // 50%
        int boysGradeA = 20;

        // Calculate total students getting grade 'A'
        double totalGradeA = (gradeAPercentage / 100) * totalStudents;

        // Calculate total girls getting grade 'A'
        double girlsGradeA = totalGradeA - boysGradeA;

        // Display the result
        System.out.println("Total girls getting grade 'A': " + (int)girlsGradeA);
    }
}