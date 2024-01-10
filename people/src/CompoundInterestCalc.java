import java.math.BigDecimal;

public class CompoundInterestCalc {

    public BigDecimal calculate(String principal, String rate, int years, String contribution) {
        //Balance (y) = p(1 + r)^y + c[((1 + r)^y - 1) / r]

        BigDecimal a = BigDecimal.ONE.add(new BigDecimal(rate)).pow(years); //(1 + r)^y
        BigDecimal b = new BigDecimal(principal).multiply(a); //p(1 + r)^y

        BigDecimal c = a.subtract(BigDecimal.ONE); //((1 + r)^y - 1)
        BigDecimal d = c.divide(new BigDecimal(rate)); //((1 + r)^y - 1) / r
        BigDecimal e = new BigDecimal(contribution).multiply(d); //c[((1 + r)^y - 1) / r]
        return b.add(e);
    }
}
