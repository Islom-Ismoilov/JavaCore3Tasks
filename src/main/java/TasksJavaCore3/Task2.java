package TasksJavaCore3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    //Task 2.4
    public static Integer[] getEvenNumbersArray() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        return list.stream()
                .filter(number -> number % 2 == 0)
                .toArray(Integer[]::new);
    }

    //Task 2.5
    public static List<String> filterAndSortStrings(List<String> inputList){
        return inputList.stream()
                .filter(filteredValues -> filteredValues.startsWith("c"))
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {


        Integer[] evenNumbersArray = getEvenNumbersArray();
        System.out.println(Arrays.toString(evenNumbersArray));


        List<String> list = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        List<String> values = filterAndSortStrings(list);
        values.forEach(System.out::println);
    }
}
