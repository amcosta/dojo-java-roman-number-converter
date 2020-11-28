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

    @Test
    public void testIIIEquals3() {
        String numbers = "III";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(3, converter.convert());
    }

    @Test
    public void testXXEquals20() {
        String numbers = "XX";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(20, converter.convert());
    }

    @Test
    public void testXXXEquals30() {
        String numbers = "XXX";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(30, converter.convert());
    }

    @Test
    public void testCCEquals200() {
        String numbers = "CC";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(200, converter.convert());
    }

    @Test
    public void testCCCEquals300() {
        String numbers = "CCC";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(300, converter.convert());
    }

    @Test
    public void testMMEquals2000() {
        String numbers = "MM";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(2000, converter.convert());
    }

    @Test
    public void testMMMEquals3000() {
        String numbers = "MMM";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(3000, converter.convert());
    }

    @Test
    public void testIVEquals4() {
        String numbers = "IV";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(4, converter.convert());
    }

    @Test
    public void testIXEquals10() {
        String numbers = "IX";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(9, converter.convert());
    }

    @Test
    public void testXLEquals40() {
        String numbers = "XL";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(40, converter.convert());
    }

    @Test
    public void testXCEquals90() {
        String numbers = "XC";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(90, converter.convert());
    }

    @Test
    public void testVIIIEquals8() {
        String numbers = "VIII";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(8, converter.convert());
    }

    @Test
    public void testLXIIEquals62() {
        String numbers = "LXII";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(62, converter.convert());
    }

    @Test
    public void testCLVIIIEquals158() {
        String numbers = "CLVIII";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(158, converter.convert());
    }

    @Test
    public void testMCXXEquals1120() {
        String numbers = "MCXX";
        Roman2Arabic converter = new Roman2Arabic(numbers);
        Assert.assertEquals(1120, converter.convert());
    }
}
