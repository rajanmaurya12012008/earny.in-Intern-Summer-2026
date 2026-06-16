import java.util.Scanner;

public class Salary {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSalary = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Employee " + i + " Salary: ");
            int salary = sc.nextInt();

            totalSalary = totalSalary + salary;
        }

        System.out.println("Total Salary Expenditure: " + totalSalary);

        sc.close();
    }
}
