import java.util.Scanner;

public class StudentID {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Roll Number: ");
        String rollNumber = sc.nextLine();

        System.out.print("Branch: ");
        String branch = sc.nextLine();

        System.out.print("Year: ");
        int year = sc.nextInt();

        System.out.println("====================");
        System.out.println("      STUDENT ID");
        System.out.println("====================");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Branch: " + branch);
        System.out.println("Year: " + year);
        System.out.println("====================");

        sc.close();
    }
}