package ru.porodkin.operations.test_long;

import org.junit.Before;
import org.junit.Test;
import ru.porodkin.operations.Operation;
import ru.porodkin.operations.primitive.lg.DivideLong;
import ru.porodkin.operations.primitive.lg.MinusLong;
import ru.porodkin.operations.primitive.lg.MultiplyLong;
import ru.porodkin.operations.primitive.lg.PlusLong;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestLong {
    Operation<Long> plus;
    Operation<Long> minus;
    Operation<Long> divide;
    Operation<Long> multiple;

    @Before
    public void init() {
        plus = new PlusLong(Arrays.asList(2L, 2L));
        minus = new MinusLong(Arrays.asList(3L, 2L));
        divide = new DivideLong(Arrays.asList(10L, 2L));
        multiple = new MultiplyLong(Arrays.asList(3L, 2L));
    }

    @Test
    public void testPlusShort() {
        assertEquals((Long)4L, plus.invoke());
    }

    @Test
    public void testMinusShort() {
        assertEquals((Long)1L, minus.invoke());
    }

    @Test
    public void testDivideShort() {
        assertEquals((Long) 5L, divide.invoke());
    }

    @Test
    public void testMultipleShort() {
        assertEquals((Long) 6L, multiple.invoke());
    }
}
