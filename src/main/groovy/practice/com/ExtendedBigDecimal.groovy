package practice.com

import java.math.MathContext

class ExtendedBigDecimal extends BigDecimal{

    def plus(BigDecimal bigDecimal)
    {
        return this.add(bigDecimal)
    }
    ExtendedBigDecimal(char[] chars, int offset, int len) {
        super(chars, offset, len)
    }

    ExtendedBigDecimal(char[] chars, int offset, int len, MathContext mc) {
        super(chars, offset, len, mc)
    }

    ExtendedBigDecimal(char[] chars) {
        super(chars)
    }

    ExtendedBigDecimal(char[] chars, MathContext mc) {
        super(chars, mc)
    }

    ExtendedBigDecimal(String val) {
        super(val)
    }

    ExtendedBigDecimal(String val, MathContext mc) {
        super(val, mc)
    }

    ExtendedBigDecimal(double val) {
        super(val)
    }

    ExtendedBigDecimal(double val, MathContext mc) {
        super(val, mc)
    }

    ExtendedBigDecimal(BigInteger val) {
        super(val)
    }

    ExtendedBigDecimal(BigInteger val, MathContext mc) {
        super(val, mc)
    }

    ExtendedBigDecimal(BigInteger unscaledVal, int scale) {
        super(unscaledVal, scale)
    }

    ExtendedBigDecimal(BigInteger unscaledVal, int scale, MathContext mc) {
        super(unscaledVal, scale, mc)
    }

    ExtendedBigDecimal(int val) {
        super(val)
    }

    ExtendedBigDecimal(int val, MathContext mc) {
        super(val, mc)
    }

    ExtendedBigDecimal(long val) {
        super(val)
    }

    ExtendedBigDecimal(long val, MathContext mc) {
        super(val, mc)
    }
}
