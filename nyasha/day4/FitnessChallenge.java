import java.util.Scanner;

public class FitnessChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSteps = 0;

        // Input steps for 7 days
        for (int i = 1; i <= 7; i++) {
            System.out.print("Enter steps for Day " + i + ": ");
            int steps = sc.nextInt();
            totalSteps += steps;
        }

        // total steps in week
        System.out.println("\nTotal Steps Walked: " + totalSteps);

        // Check challenge completion
        if (totalSteps >= 50000) {
            System.out.println("Congratulations! Challenge Completed.");
        } else {
            System.out.println("Keep Going! Challenge Not Completed.");
        }

        sc.close();
    }
}