import java.util.Scanner;

public class palin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many palindrome numbers to print: ");
        int n = sc.nextInt();

        int count = 0;
        int number = 1;

        while (count < n) {

            int originalNumber = number;
            int temp = number;
            int reverse = 0;

            while (temp != 0) {

                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp = temp / 10;
            }

            if (originalNumber == reverse) {
                System.out.print(originalNumber + " ");
                count++;
            }

            number++;
        }

        sc.close();
    }
}