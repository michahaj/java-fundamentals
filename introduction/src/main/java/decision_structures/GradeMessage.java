package decision_structures;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("what is your grade?");
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        String grade = scanner.next();

        String message = switch (grade) {
            case "A" -> "Excellent job!";
            case "B" -> "Great job!";
            case "C" -> "Good job!";
            case "D" -> "You can do better";
            case "F" -> "Oh no!";
            default -> "Error. Please provide one of the following: A, B, C, D, F.";
        };
        System.out.println(message);
    }
}
