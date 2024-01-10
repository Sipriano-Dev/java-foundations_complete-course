import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CompoundInterestCalc {

    private static final NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(Locale.US);
    private static final NumberFormat percentageFormat = NumberFormat.getPercentInstance();


    public BigDecimal calculate(String principal, String rate, int years, String contribution) throws ParseException {
        //Balance (y) = p(1 + r)^y + c[((1 + r)^y - 1) / r]
        String rateAsPercent = percentageFormat.parse(rate).toString();

        BigDecimal a = BigDecimal.ONE.add(new BigDecimal(rateAsPercent)).pow(years); //(1 + r)^y
        BigDecimal b = new BigDecimal(moneyFormat.parse(principal).toString()).multiply(a); //p(1 + r)^y

        BigDecimal c = a.subtract(BigDecimal.ONE); //((1 + r)^y - 1)
        BigDecimal d = c.divide(new BigDecimal(rateAsPercent)); //((1 + r)^y - 1) / r
        BigDecimal e = new BigDecimal(moneyFormat.parse(contribution).toString()).multiply(d); //c[((1 + r)^y - 1) / r]
        return b.add(e);
    }

    public static void main(String[] args) throws ParseException {
        DecimalFormat df = new DecimalFormat("R$#,###.00");
        DecimalFormat pf = new DecimalFormat("#%");
        CompoundInterestCalc cic = new CompoundInterestCalc();

        BigDecimal result = cic.calculate("$10,000.00", "8%", 10, "$1,000.00");
//        System.out.println(df.format(result));
//        System.out.println(pf.format(.08));
//        System.out.printf("R$%,.2f%n", result);
        String myFormattedMoney = String.format("R$%,.2f%n", result);
        System.out.println(myFormattedMoney);
    }
}
