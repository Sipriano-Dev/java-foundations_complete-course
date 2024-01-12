import java.math.BigDecimal;
import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        System.out.println(currencyMoney("5670"));
    }

    public static String currencyMoney(String string) {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        BigDecimal myMoney = new BigDecimal(string);
        return nf.format(myMoney);
    }

}