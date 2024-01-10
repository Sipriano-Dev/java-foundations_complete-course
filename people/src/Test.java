import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        CompoundInterestCalc cic = new CompoundInterestCalc();

        BigDecimal result = cic.calculate("10000", ".08", 10, "1000");
        System.out.println(result);
    }
}
