package TasksTests;

import TasksJavaCore3.Task5;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsTask5 {

    @Test
    void testOnlyLettersValues(){
        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123","s", "555-3389", "a"));
        people.put("Mary", Arrays.asList("555-2243","z", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242", "d"));

        List<String> result = Task5.onlyLetterValues(people);
        List<String> expected = Arrays.asList("d", "s", "a", "z");
        assertEquals(expected, result);
    }
}
