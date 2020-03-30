import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sun.jvm.hotspot.utilities.Assert;

public class ExampleExceptionTest {

    /**
     * Test data for positive test.
     *
     * @return test data array
     */
    @DataProvider(name = "data")
    public static Object[][] data() {
        return new Object[][]{
                {2, 2, 4},
                {2, 3, 6},
                {4, 3, 12},
                {5, 3, 15}

        };
    }

    /**
     * Test data for exception test.
     *
     * @return test data array
     */
    @DataProvider(name = "negativeData")
    public static Object[][] negativeData() {
        return new Object[][]{
                {-2, 2},
                {2, -2},
                {-3, 3},
                {3, -3},

        };
    }

    @Test(dataProvider = "data")
    public void testRectangleArea(int a, int b, int c) {

        assertEquals(ExampleException.rectangleArea(a, b), c);

    }


    @Test(dataProvider = "negativeData")
    public void testRectangleAreaNegative(int a, int b) {

        try {
            ExampleException.rectangleArea(a, b);
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "input value is below zero!");
        }


    }
}