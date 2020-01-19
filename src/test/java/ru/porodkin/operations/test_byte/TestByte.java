package ru.porodkin.operations.test_byte;

import org.junit.Before;
import org.junit.Test;
import ru.porodkin.operations.AbstractOperation;
import ru.porodkin.operations.primitive.bt.DivideByte;
import ru.porodkin.operations.primitive.bt.MinusByte;
import ru.porodkin.operations.primitive.bt.MultiplyByte;
import ru.porodkin.operations.primitive.bt.PlusByte;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestByte {
    AbstractOperation<Byte> plus;
    AbstractOperation<Byte> minus;
    AbstractOperation<Byte> divide;
    AbstractOperation<Byte> multiple;

    @Before
    public void init() {
        plus = new PlusByte(Arrays.asList((byte) 2, (byte) 2));
        minus = new MinusByte(Arrays.asList((byte) 3, (byte) 2));
        divide = new DivideByte(Arrays.asList((byte) 10, (byte) 2));
        multiple = new MultiplyByte(Arrays.asList((byte) 3, (byte) 2));
    }

    @Test
    public void testPlusShort() {
        assertEquals((byte) 4, (byte) plus.invoke());
    }

    @Test
    public void testMinusShort() {
        assertEquals((byte) 1, (byte) minus.invoke());
    }

    @Test
    public void testDivideShort() {
        assertEquals((byte) 5, (byte) divide.invoke());
    }

    @Test
    public void testMultipleShort() {
        assertEquals((byte) 6, (byte) multiple.invoke());
    }

}
