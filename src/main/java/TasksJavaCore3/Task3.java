package TasksJavaCore3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task3 {

    //Task 3.6 a)
    public static List<String> filterNamesWithA(List<String> memberNames) {
        return memberNames.stream()
                .filter(name -> name.startsWith("A") && name.length() > 5)
                .collect(Collectors.toList());
    }

    //Task 3.6 b)
    public static List<String> sortNamesInLowerCase(List<String> memberNames) {
        return memberNames.stream()
                .sorted()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    //Task 3.7
    public static boolean checkAllMatchS(List<String> memberNames) {
        return memberNames.stream().allMatch(name -> name.contains("S"));
    }

    public static boolean checkAnyMatchS(List<String> memberNames) {
        return memberNames.stream().anyMatch(name -> name.contains("S"));
    }

    public static boolean checkNoneMatchH(List<String> memberNames) {
        return memberNames.stream().noneMatch(name -> name.contains("H"));
    }

    //Task 3.8
    public static long countElements(List<String> memberNames) {
        return memberNames.stream().count();
    }
    //Task 3.9
    public static long countNamesStartingWithA(List<String> memberNames) {
        return memberNames.stream()
                .filter(name -> name.startsWith("A"))
                .count();
    }
    //Task 3.10
    public static Optional<String> findFirstNameStartingWithL(List<String> memberNames) {
        return memberNames.stream()
                .filter(name -> name.startsWith("L"))
                .findFirst();
    }



    public static void main(String[] args) {

        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Abibaba");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        List<String> namesWithA = filterNamesWithA(memberNames);
        System.out.println("Names that start with 'A' and have length > 5: ");
        namesWithA.forEach(System.out::println);


        List<String> sortedNames = sortNamesInLowerCase(memberNames);
        System.out.println("Sorted names in Lower case: ");
        sortedNames.forEach(System.out::println);

        boolean checkAllMatch = checkAllMatchS(memberNames);
        System.out.println("allMatch's result: " + checkAllMatch);
        boolean checkAnyMatch = checkAnyMatchS(memberNames);
        System.out.println("anyMatch's result: " + checkAnyMatch);
        boolean checkNoneMatch = checkNoneMatchH(memberNames);
        System.out.println("noneMatch's result: " + checkNoneMatch);


        long countStream = countElements(memberNames);
        System.out.println("Number of elements in the stream: " + countStream);

        long countNamesStartingWithA = countNamesStartingWithA(memberNames);
        System.out.println("Number of names starting with 'A': " + countNamesStartingWithA);

        Optional<String> firstNameStartingWithL = findFirstNameStartingWithL(memberNames);
        System.out.println("First name which starts with L: " + firstNameStartingWithL.orElse("Not found!"));
    }
}
