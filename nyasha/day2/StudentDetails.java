import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        System.out.print("College: ");
        String college = sc.nextLine();

        System.out.print("Branch: ");
        String branch = sc.nextLine();

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
        System.out.println("Branch: " + branch);

        sc.close();
    }
}