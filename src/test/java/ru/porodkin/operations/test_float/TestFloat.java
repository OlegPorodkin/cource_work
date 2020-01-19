package ru.porodkin.operations.test_float;

import org.junit.Before;
import org.junit.Test;
import ru.porodkin.operations.Operation;
import ru.porodkin.operations.primitive.ft.DivideFloat;
import ru.porodkin.operations.primitive.ft.MinusFloat;
import ru.porodkin.operations.primitive.ft.MultiplyFloat;
import ru.porodkin.operations.primitive.ft.PlusFloat;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestFloat {
    Operation<Float> plus;
    Operation<Float> minus;
    Operation<Float> divide;
    Operation<Float> multiple;

    @Before
    public void init() {
        plus = new PlusFloat(Arrays.asList((float) 2.0, (float) 2.0));
        minus = new MinusFloat(Arrays.asList((float) 3.0, (float) 2.0));
        divide = new DivideFloat(Arrays.asList((float) 10.0, (float) 2.0));
        multiple = new MultiplyFloat(Arrays.asList((float) 3.0, (float) 2.0));
    }

    @Test
    public void testPlusShort() {
        assertEquals((Float) 4.0f, plus.invoke());
    }

    @Test
    public void testMinusShort() {
        assertEquals((Float) 1.0f, minus.invoke());
    }

    @Test
    public void testDivideShort() {
        assertEquals((Float) 5.0f, divide.invoke());
    }

    @Test
    public void testMultipleShort() {
        assertEquals((Float) 6.0f, multiple.invoke());
    }
}
