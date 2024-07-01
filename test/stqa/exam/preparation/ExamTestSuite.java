package stqa.exam.preparation;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        MathUtilsTest.class,
        AircraftTest.class,
//        BusPlusTest.class,
})
public class ExamTestSuite {
}
