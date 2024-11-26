package juint;

import org.junit.jupiter.api.Test;

import static com.jayway.jsonpath.internal.path.PathCompiler.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathTest {

    @Test
    void test(){
        //Absence of failure is success
        int [] num = {1,2,3};
        MyMath mymath = new MyMath();
        int result = mymath.calculateSum(num);
        int expectedResult = 5;
        assertEquals(expectedResult,result);
    }
}
