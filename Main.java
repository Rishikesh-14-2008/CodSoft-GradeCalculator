import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many classes did you take? ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            System.out.printf("\nEnter the grade for class %d (percentage): ", i);
            int grade = sc.nextInt();
            sum += grade;
        }

        int avgPercentage = sum / num;
        char letterGrade;

        if (avgPercentage >= 90) {
            letterGrade = 'A';
        } else if (avgPercentage >= 80) {
            letterGrade = 'B';
        } else if (avgPercentage >= 70) {
            letterGrade = 'C';
        } else if (avgPercentage >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        System.out.println("\n-----------------------------");
        System.out.println("Total Marks\tAvg Percentage\tFinal Grade");
        System.out.println("-----------------------------");
        System.out.printf("%d\t\t%d\t\t%c%n", sum, avgPercentage, letterGrade);
        System.out.println("-----------------------------");

        sc.close();
    }
}
