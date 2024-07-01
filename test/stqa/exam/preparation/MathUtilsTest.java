package stqa.exam.preparation;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MathUtilsTest {
    private int inputNumberA;
    private int inputNumberB;
    private int expectedResult;

    public MathUtilsTest(int inputNumberA, int inputNumberB, int expectedResult) {
        this.inputNumberA = inputNumberA;
        this.inputNumberB = inputNumberB;
        this.expectedResult = expectedResult;
    }


    @Parameterized.Parameters
    public static Collection addFunctionData() {
        return Arrays.asList(new Object[][] {
            {1, 1, 2},
            {2, 2, 4},
            {8, 2, 10},
            {4, 5, 9},
            {3, 3, 6}
        });
    }

    @Test
    public void testAdd() {
        int actual = MathUtils.add(inputNumberA, inputNumberB);
        System.out.println(inputNumberA + " + " + inputNumberB + " = " + actual);
        Assert.assertEquals(expectedResult, actual);
    }
}
