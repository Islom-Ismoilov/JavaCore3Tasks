package TasksJavaCore3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task5 {

    //Task 5.14
    public static List<String> onlyLetterValues(Map<String, List<String>> people) {
        return people.values().stream()
                .flatMap(List::stream)
                .filter(value -> value.matches("[a-zA-Z]"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123","s", "555-3389", "a"));
        people.put("Mary", Arrays.asList("555-2243","z", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242", "d"));

        List<String> onlyLetterValues = onlyLetterValues(people);
        System.out.println("Letter values: " + onlyLetterValues);
    }
}
