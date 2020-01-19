package ru.porodkin.operations.test_double;

import org.junit.Before;
import org.junit.Test;
import ru.porodkin.operations.Operation;
import ru.porodkin.operations.primitive.dl.DivideDouble;
import ru.porodkin.operations.primitive.dl.MinusDouble;
import ru.porodkin.operations.primitive.dl.MultiplyDouble;
import ru.porodkin.operations.primitive.dl.PlusDouble;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestDouble {
    Operation<Double> plus;
    Operation<Double> minus;
    Operation<Double> divide;
    Operation<Double> multiple;

    @Before
    public void init() {
        plus = new PlusDouble(Arrays.asList(2.0, 2.0));
        minus = new MinusDouble(Arrays.asList(3.0, 2.0));
        divide = new DivideDouble(Arrays.asList(10.0, 2.0));
        multiple = new MultiplyDouble(Arrays.asList(3.0, 2.0));
    }

    @Test
    public void testPlusShort() {
        assertEquals((Double) 4.0, plus.invoke());
    }

    @Test
    public void testMinusShort() {
        assertEquals((Double) 1.0, minus.invoke());
    }

    @Test
    public void testDivideShort() {
        assertEquals((Double) 5.0, divide.invoke());
    }

    @Test
    public void testMultipleShort() {
        assertEquals((Double) 6.0, multiple.invoke());
    }
}
