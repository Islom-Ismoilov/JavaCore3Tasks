package TasksTests;

import TasksJavaCore3.Task3;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestsTask3 {

    @Test
    void testFilterNamesWithA(){
        List<String> memberNames = Arrays.asList("Amitabh", "Shekhar", "Aman", "Rahul", "Shahrukh", "Abibaba", "Salman", "Yana", "Lokesh");
        List<String> result = Task3.filterNamesWithA(memberNames);
        assertEquals(Arrays.asList("Amitabh", "Abibaba"), result);
    }

    @Test
    void testCheckAllMatchS(){
        List<String> memberNames = Arrays.asList("Amitabh", "Shekhar", "Aman", "Rahul", "Shahrukh", "Abibaba", "Salman", "Yana", "Lokesh");
        boolean result = Task3.checkAllMatchS(memberNames);
        assertFalse(result);
    }

    @Test
    void testCheckAnyMatchS(){
        List<String> memberNames = Arrays.asList("Amitabh", "Shekhar", "Aman", "Rahul", "Shahrukh", "Abibaba", "Salman", "Yana", "Lokesh");
        boolean result = Task3.checkAnyMatchS(memberNames);
        assertTrue(result);
    }

    @Test
    void testCheckNoneMatchH(){
        List<String> memberNames = Arrays.asList("Amitabh", "Shekhar", "Aman", "Rahul", "Shahrukh", "Abibaba", "Salman", "Yana", "Lokesh");
        boolean result = Task3.checkNoneMatchH(memberNames);
        assertTrue(result);
    }

    @Test
    void testCountElements(){
        List<String> memberNames = Arrays.asList("Amitabh", "Shekhar", "Aman", "Rahul", "Shahrukh", "Abibaba", "Salman", "Yana", "Lokesh");
        long result = Task3.countElements(memberNames);
        assertEquals(9,result);
    }

    @Test
    void testCountNamesStartingWithA(){
        List<String> memberNames = Arrays.asList("Amitabh", "Shekhar", "Aman", "Rahul", "Shahrukh", "Abibaba", "Salman", "Yana", "Lokesh");
        long result = Task3.countNamesStartingWithA(memberNames);
        assertEquals(3, result);
    }

    @Test
    void testFindFirstNameStartingWithL(){
        List<String> memberNames = Arrays.asList("Amitabh", "Shekhar", "Aman", "Rahul", "Shahrukh", "Abibaba", "Salman", "Yana", "Lokesh");
        Optional<String> result = Task3.findFirstNameStartingWithL(memberNames);
        assertEquals("Lokesh", result.orElse(null));
    }
}
