package juint;

import org.junit.jupiter.api.Test;

import static com.jayway.jsonpath.internal.path.PathCompiler.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTest {

    MyMath mymath = new MyMath();

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
}
