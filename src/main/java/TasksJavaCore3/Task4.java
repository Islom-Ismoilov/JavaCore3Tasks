package TasksJavaCore3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {


    //Task 4.11
    public static List<Integer> concatenateLists(List<Integer> list1, List<Integer> list2, List<Integer> list3) {
        return Arrays.asList(list1, list2, list3)
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    //Task 4.11
    public static String[] concatenateArrays(String[][] dataArray) {
        return Arrays.stream(dataArray)
                .flatMap(Arrays::stream)
                .toArray(String[]::new);
    }

    //Task 4.12
    public static List<Integer> removeDuplicates(List<Integer> numbersList) {
        return numbersList.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    // I've skipped Task 4.13 because it WASN'T mandatory

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list3 = Arrays.asList(7, 8, 9);

        List<Integer> concatenatedList = concatenateLists(list1, list2, list3);
        System.out.println("Concatenated List: " + concatenatedList);

        String[][] dataArray = {{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};
        String[] concatenatedArray = concatenateArrays(dataArray);
        System.out.println("Concatenated Array: " + Arrays.toString(concatenatedArray));

        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7));
        List<Integer> distinctNumbersList = removeDuplicates(numberList);
        System.out.println("Duplicates removed list: " + distinctNumbersList);

    }
}