package juint;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static com.jayway.jsonpath.internal.path.PathCompiler.fail;
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


}
