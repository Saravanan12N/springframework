package juint;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyMathTest {

    MyMath mymath = new MyMath();
    List<String> asList  = Arrays.asList("AWS","AZURE","GCP");

    @Test
    void calculateThreeNumbers(){
        //Absence of failure is success
        assertEquals(6, mymath.calculateSum(new int[] {1,2,3}));
    }

    @Test
    void emptyArray(){
        //Absence of failure is success
        assertEquals(0, mymath.calculateSum(new int[]{}));
    }

    @Test
    void testList(){
        boolean test = asList.contains("AWS");
        assertEquals(true,test);
        assertEquals(3,asList.size());
        assertTrue(test);
    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("before Alll");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Before Each");
    }

    @AfterEach
    void afterEach(){
        System.out.println("Before Each");
    }

    @Test
    void test1(){
        System.out.println("Test 1");
    }

    @Test
    void test2(){
        System.out.println("Test 2");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After All");
    }
}
