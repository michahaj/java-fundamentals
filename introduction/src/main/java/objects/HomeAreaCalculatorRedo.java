package objects;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        var HomeAreaCalculatorRedo = new HomeAreaCalculatorRedo();
        Rectangle room1 = HomeAreaCalculatorRedo.getRoom();
        Rectangle room2 = HomeAreaCalculatorRedo.getRoom();
        double areaOfHome = HomeAreaCalculatorRedo.calculateArea(room1, room2);
        System.out.println("Home area: " + areaOfHome);
    }

    public Rectangle getRoom() {
        System.out.println("Please enter the width of the room: ");
        double width = scanner.nextDouble();
        System.out.println("Please enter the height of the room: ");
        double height = scanner.nextDouble();
        return new Rectangle(width, height);
    }

    public double calculateArea(Rectangle room1, Rectangle room2) {
        double areaOfRoom1 = room1.calculateArea();
        double areaOfRoom2 = room2.calculateArea();
        return areaOfRoom1 + areaOfRoom2;
    }
}
