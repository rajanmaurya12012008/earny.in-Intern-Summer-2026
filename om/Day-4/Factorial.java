import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long factorial = 1;

        for(int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial = " + factorial);

        sc.close();
    }
}