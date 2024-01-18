package TasksTests;

import TasksJavaCore3.Task2;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsTask2 {
    @Test
    void testGetEvenNumbersArray(){
        Integer[] evenNumbersArray = Task2.getEvenNumbersArray();
        assertEquals(Arrays.asList(2, 4, 6, 8), Arrays.asList(evenNumbersArray));
    }

    @Test
    void testFilteredAndSortedStrings(){
        List<String> inputList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        List<String> result = Task2.filterAndSortStrings(inputList);
        assertEquals(Arrays.asList("C2", "C1"), result);
    }
}
