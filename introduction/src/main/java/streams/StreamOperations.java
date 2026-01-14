package streams;

import java.lang.reflect.Array;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
    static List<String> veggies = List.of(
            "spinach",
            "cabbage",
            "peas",
            "green beans"
    );

    public static void main(String[] args) {
        matchDemo();
        filterDemo();
        mapDemo();
        reduceDemo();
        collectDemo();
    }

    public static void matchDemo() {
        boolean any = veggies.stream().anyMatch(f -> f.length() > 5);
        boolean all =  veggies.stream().allMatch(f -> f.length() > 5);
        System.out.println(any);
        System.out.println(all);
    }

    public static void filterDemo() {
        Stream<String> oneWordVeggies = veggies.stream().filter(f -> !f.contains(" "));
        oneWordVeggies.forEach(System.out::println);
    }

    public static void mapDemo() {
        veggies.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    public static void reduceDemo() {
        var concatenatedVeggies = veggies.stream()
                .sorted()
                .reduce("", (k,v) -> k.concat(v).concat(";"));
        System.out.println(concatenatedVeggies);
    }

    public static void collectDemo() {
        var veggiesSet = veggies.stream()
                .filter(v -> v.endsWith("s"))
                .collect(Collectors.toSet());
        System.out.println(veggiesSet);
    }
}
