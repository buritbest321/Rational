import org.junit.Assert;
import org.junit.Test;

public class RationalTest {

    // Test for illegal constructor when denominator is zero
    @Test
    public void zeroDenomConstructor() {
        Assert.assertThrows(Rational.Illegal.class, () -> new Rational(1, 0));
        Assert.assertThrows(Rational.Illegal.class, () -> new Rational(2, 0));
    }

    /// Add Method
    // Test for adding positive rational numbers
    @Test
    public void addPositive() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(1, 4);
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    // Test for adding negative rational numbers
    @Test
    public void addNegative() throws Rational.Illegal {
        Rational x = new Rational(-3, 4);
        Rational y = new Rational(1, 4);
        x.add(y);
        Assert.assertEquals(-1, x.numerator);
        Assert.assertEquals(2, x.denominator);
    }

    // Test for adding with zero numerator
    @Test
    public void addZeroNumerator() throws Rational.Illegal {
        Rational x = new Rational(0, 4);
        Rational y = new Rational(1, 4);
        x.add(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    // Test for throwing error on zero denominator during addition
    @Test
    public void addZeroDenominator() {
        Assert.assertThrows(Rational.Illegal.class, () -> {
            Rational x = new Rational(-3, 0);  // Throws Rational.Illegal
            Rational y = new Rational(1, 4);
            x.add(y);

            Rational a = new Rational(-3, 1);
            Rational b = new Rational(1, 0);  // Throws Rational.Illegal
            a.add(b);
        });
    }

    // Test for adding whole number
    @Test
    public void addWholeNumber() throws Rational.Illegal {
        Rational x = new Rational(4, 4);
        Rational y = new Rational(6, 3);
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    /// Subtract Method
    // Test for subtracting positive numbers
    @Test
    public void subtractPositive() throws Rational.Illegal {
        Rational x = new Rational(3, 4);
        Rational y = new Rational(1, 4);
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(2, x.denominator);
    }

    // Test for subtracting negative numbers
    @Test
    public void subtractNegative() throws Rational.Illegal {
        Rational x = new Rational(-3, 4);
        Rational y = new Rational(1, 4);
        x.subtract(y);
        Assert.assertEquals(-1, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    // Test for subtracting when numerator is zero
    @Test
    public void subtractZeroNumerator() throws Rational.Illegal {
        Rational x = new Rational(0, 1);
        Rational y = new Rational(1, 4);
        x.subtract(y);
        Assert.assertEquals(-1, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    // Test for handling zero denominator during subtraction
    @Test
    public void subtractZeroDenominator()  {
        Assert.assertThrows(Rational.Illegal.class, () -> {
            Rational x = new Rational(4, 0);
            Rational y = new Rational(6, 1);
            x.subtract(y);
        });
    }

    // Test for subtracting whole number
    @Test
    public void subtractWholeNumber() throws Rational.Illegal {
        Rational x = new Rational(6, 1);
        Rational y = new Rational(3, 1);
        x.subtract(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    /// Multiply Method
    // Test for multiplying positive numbers
    @Test
    public void multiplyPositive() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(2, 3);
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(3, x.denominator);
    }

    // Test for multiplying negative numbers
    @Test
    public void multiplyNegative() throws Rational.Illegal {
        Rational x = new Rational(-1, 2);
        Rational y = new Rational(2, 3);
        x.multiply(y);
        Assert.assertEquals(-1, x.numerator);
        Assert.assertEquals(3, x.denominator);
    }

    // Test for multiplying with zero numerator
    @Test
    public void multiplyZeroNumerator() throws Rational.Illegal {
        Rational x = new Rational(0, 1);
        Rational y = new Rational(2, 3);
        x.multiply(y);
        Assert.assertEquals(0, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    // Test for zero denominator during multiplication
    @Test
    public void multiplyZeroDenominator() throws Rational.Illegal  {
        Assert.assertThrows(Rational.Illegal.class, () -> {
            Rational x = new Rational(1, 0);
            Rational y = new Rational(2, 1);
            x.multiply(y);
        });
    }

    // Test for multiplying whole number
    @Test
    public void multiplyWholeNumber() throws Rational.Illegal {
        Rational x = new Rational(2, 1);
        Rational y = new Rational(3, 1);
        x.multiply(y);
        Assert.assertEquals(6, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    /// Divide Method
    // Test for dividing positive numbers
    @Test
    public void dividePositive() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(2, 3);
        x.divide(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    // Test for dividing negative numbers
    @Test
    public void divideNegative() throws Rational.Illegal {
        Rational x = new Rational(-1, 2);
        Rational y = new Rational(2, 3);
        x.divide(y);
        Assert.assertEquals(-3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    // Test for dividing with zero numerator
    @Test
    public void divideZeroNumerator() throws Rational.Illegal {
        Rational x = new Rational(0, 1);
        Rational y = new Rational(2, 3);
        x.divide(y);
        Assert.assertEquals(0, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    // Test for zero denominator during division
    @Test
    public void divideZeroDenominator()  {
        Assert.assertThrows(Rational.Illegal.class, () -> {
            Rational x = new Rational(1, 0);
            Rational y = new Rational(2, 1);
            x.divide(y);
        });
    }

    // Test for dividing whole number
    @Test
    public void divideWholeNumber() throws Rational.Illegal {
        Rational x = new Rational(4, 1);
        Rational y = new Rational(2, 1);
        x.divide(y);
        Assert.assertEquals(2, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    /// Equals Method
    // Test for equality of rational numbers
    @Test
    public void equalsRationals() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(2, 4);
        Assert.assertEquals(x, y);
    }

    // Test for inequality between different objects
    @Test
    public void notEqualsDifferentObject() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Assert.assertNotEquals("1/2", x);
    }

    // Test for inequality when numerators differ
    @Test
    public void notEqualsNumerators() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(1, 3);
        Assert.assertNotEquals(x, y);
    }

    // Test for inequality when denominators differ
    @Test
    public void notEqualsDenominators() throws Rational.Illegal {
        Rational x = new Rational(2, 3);
        Rational y = new Rational(3, 3);
        Assert.assertNotEquals(x, y);
    }

    // Test for equality of zero denominator
    @Test
    public void EqualsZeroDenominators()  {
        Assert.assertThrows(Rational.Illegal.class, () -> {
            Rational x = new Rational(1, 0);
            Rational y = new Rational(2, 1);
            x.equals(y);
        });
    }

    // Test for inequality
    @Test
    public void notEquals() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(3, 4);
        Assert.assertNotEquals(x, y);
    }

    /// CompareTo Method
    // Test for comparing two equal rational numbers
    @Test
    public void compareEquals() throws Rational.Illegal {
        Rational x = new Rational(1, 2);
        Rational y = new Rational(2, 4);
        Assert.assertEquals(0, x.compareTo(y));
    }

    // Test for comparing when greater
    @Test
    public void compareGreater() throws Rational.Illegal {
        Rational x = new Rational(3, 4);
        Rational y = new Rational(1, 2);
        Assert.assertEquals(1, x.compareTo(y));
    }

    // Test for comparing when lesser
    @Test
    public void compareLess() throws Rational.Illegal {
        Rational x = new Rational(1, 4);
        Rational y = new Rational(1, 2);
        Assert.assertEquals(-1, x.compareTo(y));
    }

    // Test for zero denominator in comparison
    @Test
    public void compareZeroDenominator() {
        Assert.assertThrows(Rational.Illegal.class, () -> {
            Rational x = new Rational(1, 0);
            Rational y = new Rational(2, 1);
            x.compareTo(y);
        });
    }

    // Test for throwing error on comparing different objects
    @Test
    public void compareToOtherObject() {
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            Rational x = new Rational(1, 2);
            String y = "1/2";
            x.compareTo(y);
        });
    }

    /// toString Method
    // Test for string representation of a rational number
    @Test
    public void toStringTest() throws Rational.Illegal {
        Rational x = new Rational(3, 4);
        Assert.assertEquals("3/4", x.toString());
    }
}
