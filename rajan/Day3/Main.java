import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Percentage: ");
        float percentage = sc.nextFloat();

        System.out.println("\nStudent: " + studentName);
        System.out.println("Percentage: " + percentage);

       
        if (percentage >= 80) {
            System.out.println("\nCongratulations! You are eligible for the scholarship.");
        } else {
            System.out.println("\nSorry! You are not eligible for the scholarship.");
        }

        sc.close();
    }
}