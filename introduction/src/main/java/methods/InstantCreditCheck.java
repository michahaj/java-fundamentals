package methods;

import java.util.Scanner;

public class InstantCreditCheck {

    static double requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        boolean qualified = isUserQualified(salary, creditScore);
        notifyUser(qualified);
    }

    private static void notifyUser(boolean qualified) {
        if (qualified) {
            System.out.println("Congrats! You've been approved.");
        }
        else System.out.println("Sorry, you've been declined");
    }

    private static boolean isUserQualified(double salary, int creditScore) {
        return salary >= requiredSalary && creditScore >= requiredCreditScore;
    }

    public static int getCreditScore() {
        System.out.println("Please enter your credit score:");
        return scanner.nextInt();
    }

    public static double getSalary() {
        System.out.println("Please enter the salary:");
        return scanner.nextDouble();
    }

}
