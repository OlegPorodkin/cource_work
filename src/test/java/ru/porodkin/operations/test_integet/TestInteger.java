package ru.porodkin.operations.test_integet;

import org.junit.Before;
import org.junit.Test;
import ru.porodkin.operations.Operation;
import ru.porodkin.operations.primitive.ir.DivideInteger;
import ru.porodkin.operations.primitive.ir.MinusInteger;
import ru.porodkin.operations.primitive.ir.MultiplyInteger;
import ru.porodkin.operations.primitive.ir.PlusInteger;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestInteger {
    Operation<Integer> plus;
    Operation<Integer> minus;
    Operation<Integer> divide;
    Operation<Integer> multiple;

    @Before
    public void init() {
        plus = new PlusInteger(Arrays.asList(2, 2));
        minus = new MinusInteger(Arrays.asList(3, 2));
        divide = new DivideInteger(Arrays.asList(10, 2));
        multiple = new MultiplyInteger(Arrays.asList(3, 2));
    }

    @Test
    public void testPlusShort() {
        assertEquals((Integer)4, plus.invoke());
    }

    @Test
    public void testMinusShort() {
        assertEquals((Integer)1, minus.invoke());
    }

    @Test
    public void testDivideShort() {
        assertEquals((Integer) 5, divide.invoke());
    }

    @Test
    public void testMultipleShort() {
        assertEquals((Integer) 6, multiple.invoke());
    }
}
