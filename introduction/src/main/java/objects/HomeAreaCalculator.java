package objects;

public class HomeAreaCalculator {
    public static void main(String[] args) {
        Rectangle room1 = new Rectangle();
        room1.setHeight(50);
        room1.setWidth(25);
        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(20, 10);
        double areaOfRoom2 = room2.calculateArea();

        double areaOfHome = areaOfRoom1 + areaOfRoom2;
        System.out.println("Home area: " + areaOfHome);
    }
}
