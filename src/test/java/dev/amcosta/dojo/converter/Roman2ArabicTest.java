package dev.amcosta.dojo.converter;

import org.junit.Assert;
import org.junit.Test;

public class Roman2ArabicTest {

    @Test
    public void testIEquals1() {
        String numbers = "I";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(1, converter.convert());
    }

    @Test
    public void testVEquals5() {
        String numbers = "V";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(5, converter.convert());
    }

    @Test
    public void testXEquals10() {
        String numbers = "X";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(10, converter.convert());
    }

    @Test
    public void testLEquals50() {
        String numbers = "L";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(50, converter.convert());
    }

    @Test
    public void testCEquals100() {
        String numbers = "C";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(100, converter.convert());
    }

    @Test
    public void testDEquals500() {
        String numbers = "D";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(500, converter.convert());
    }

    @Test
    public void testMEquals1000() {
        String numbers = "M";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(1000, converter.convert());
    }

    @Test
    public void testIIEquals2() {
        String numbers = "II";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(2, converter.convert());
    }
}
