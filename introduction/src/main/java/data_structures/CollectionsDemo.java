package data_structures;
import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        //setDemo();
        //listDemo();
        //queueDemo();
        mapDemo();
    }

    public static void setDemo() {
        Set<String> fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("banana");

        System.out.println(fruits);

        Set<String> moreFruits = Set.of("pear", "raisin", "cherry");
//        moreFruits.add("cranberry"); // <- runtime error
    }

    public static void listDemo() {
        List<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("orange");
        fruits.add("apple");

        fruits.forEach(f -> System.out.println(f));

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.set(2, "grape");
        fruits.remove("apple"); // remove first found
        String fruit = fruits.remove(fruits.size() - 1);
        System.out.println(fruit);

        System.out.println(fruits.indexOf("banana"));

        System.out.println(fruits);
    }

    public static void queueDemo() {
        Queue<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("orange");

        fruits.forEach(System.out::println);

        var removed =  fruits.remove();
        System.out.println(removed);
        System.out.println("Head of queue: " + fruits.peek());

        System.out.println(fruits);
    }

    public static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap<String, Integer>();
        fruitCalories.put("apple", 10);
        fruitCalories.put("banana", 105);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("orange", 45);
        //fruitCalories.put("apple", 30);
        fruitCalories.putIfAbsent("apple", 30);
        fruitCalories.remove("lemon");

        System.out.println(fruitCalories);
        System.out.println("banana calories: " + fruitCalories.get("banana"));
        System.out.println(fruitCalories.containsKey("orange"));
    }
}
