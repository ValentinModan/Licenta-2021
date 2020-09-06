package practice.com

class ExtendedBigDecimalTest extends GroovyTestCase {
    void testPlus() {
        BigDecimal firstParameter = new BigDecimal(123);
        BigDecimal secondParameter = new BigDecimal(543);

        assert firstParameter + secondParameter == new BigDecimal(666)
    }
}
