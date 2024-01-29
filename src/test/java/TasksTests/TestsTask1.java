package TasksTests;

import TasksJavaCore3.Task1;
import org.junit.jupiter.api.Test;
import utils.TestUtils;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestsTask1 {

    @Test
    void testPrintStreamNumbers(){
        String printedOutput = TestUtils.captureSystemOut(() -> Task1.printStreamNumbers());
        assertEquals("1\n2\n3\n4\n5\n6\n7\n8\n9\n", printedOutput);
    }

    @Test
    void testGenerateRandomNumbers(){
        List<Integer> randomNumbers = Task1.generateRandomNumbers();
        assertEquals(20, randomNumbers.size());
        assertTrue(randomNumbers.stream().allMatch(number -> number >= 0 && number < 100));
    }

    @Test
    void testFilterEvenNumbers(){
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> evenNumbersList = Task1.filterEvenNumbers(numberList);
        assertEquals(Arrays.asList(2,4,6,8), evenNumbersList);
    }
}
