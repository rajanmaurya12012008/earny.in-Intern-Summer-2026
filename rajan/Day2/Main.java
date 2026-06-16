import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Age = ");
        int a = s.nextInt();

        System.out.println("Your age in months is " + (a * 12) + " months old.");

        s.close();
    }
}