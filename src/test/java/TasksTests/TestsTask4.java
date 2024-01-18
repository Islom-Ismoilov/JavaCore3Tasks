package TasksTests;

import TasksJavaCore3.Task4;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsTask4 {

    @Test
    void testConcatenatedLists(){
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list3 = Arrays.asList(7, 8, 9);

        List<Integer> result = Task4.concatenateLists(list1, list2, list3);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(expected, result);
    }

    @Test
    void testConcatenatedArray(){
        String[][] dataArray = {{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};

        String[] result = Task4.concatenateArrays(dataArray);
        String[] expected = {"a", "b", "c", "d", "e", "f", "g", "h"};
        assertEquals(Arrays.toString(expected),Arrays.toString(result));
    }

    @Test
    void testRemovedDuplicatesList(){
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7));

        List<Integer> result = Task4.removeDuplicates(numberList);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        assertEquals(expected, result);
    }
}
