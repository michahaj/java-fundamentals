package decision_structures;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;
        System.out.println("How many sales did you make?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        int salesDiff = quota - sales;
        scanner.close();
        if (salesDiff <= 0) {
            System.out.println("Congrats! You've met your quota.");
        } else {
            System.out.println("Unfortunately. You were " + salesDiff + " short");
        }
    }
}
