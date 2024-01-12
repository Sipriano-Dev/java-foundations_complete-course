import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println(divideMoney("$12,345.83"));
    }

    private static String divideMoney(String s) throws ParseException {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        String sParsed = nf.parse(s).toString();
        BigDecimal sResult = new BigDecimal(sParsed).divide(new BigDecimal("32.19"), 2, RoundingMode.HALF_DOWN);
        return nf.format(sResult);
    }
}