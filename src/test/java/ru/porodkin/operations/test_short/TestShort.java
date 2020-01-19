package ru.porodkin.operations.test_short;

import org.junit.Before;
import org.junit.Test;
import ru.porodkin.operations.Operation;
import ru.porodkin.operations.primitive.sh.DivideShort;
import ru.porodkin.operations.primitive.sh.MinusShort;
import ru.porodkin.operations.primitive.sh.MultipleShort;
import ru.porodkin.operations.primitive.sh.PlusShort;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class TestShort {
    Operation<Short> plus;
    Operation<Short> minus;
    Operation<Short> divide;
    Operation<Short> multiple;

    @Before
    public void init() {
        plus = new PlusShort(Arrays.asList((short) 2, (short) 2));
        minus = new MinusShort(Arrays.asList((short) 3, (short) 2));
        divide = new DivideShort(Arrays.asList((short) 10.0, (short) 2.0));
        multiple = new MultipleShort(Arrays.asList((short) 3, (short) 2));
    }

    @Test
    public void testPlusShort() {
        assertEquals((short) 4, (short) plus.invoke());
    }

    @Test
    public void testMinusShort() {
        assertEquals((short) 1, (short) minus.invoke());
    }

    @Test
    public void testDivideShort() {
        assertEquals((short) 5, (short) divide.invoke());
    }

    @Test
    public void testMultipleShort() {
        assertEquals((short) 6, (short) multiple.invoke());
    }

}
