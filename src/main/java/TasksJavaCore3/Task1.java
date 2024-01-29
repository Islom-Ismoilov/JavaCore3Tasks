package TasksJavaCore3;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

    private static final Random random = new Random();

    //Task 1.1
    public static void printStreamNumbers(){
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(System.out::println);
    }

    //Task 1.2
    public static List<Integer> generateRandomNumbers(){
        Stream<Integer> randomNumbers = Stream.generate(() -> random.nextInt(100))
                .limit(20);
        return randomNumbers.collect(Collectors.toList());
    }

    //Task 1.3
    public static List<Integer> filterEvenNumbers(List<Integer> numberList){
        return numberList.stream()
                .filter(number -> number %2 == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        //Task 1.1
        printStreamNumbers();

        //Task 1.2
        List<Integer> randomNumbers = generateRandomNumbers();
        randomNumbers.forEach(System.out::println);

        //Task 1.3
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> evenNumbersList = filterEvenNumbers(numberList);
        evenNumbersList.forEach(System.out::println);
    }
}
