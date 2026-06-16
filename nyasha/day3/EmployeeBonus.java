import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Years of Service: ");
        int years = sc.nextInt();

        // Calculate bonus
        double bonus = 0;

        if (years >= 5) {
            bonus = salary * 0.10;
        }

        double totalSalary = salary + bonus;

        // Output
        System.out.println("\nSalary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);

        sc.close();
    }
}
    

