package labwork.block2.theme18.lw02;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        BigDecimal sumOfMoney = BigDecimal.ONE;
        BigDecimal divisor = new BigDecimal("0.1");
        BigDecimal[] pricesOfNails = new BigDecimal[sumOfMoney.divide(divisor).intValue()];
        for (BigDecimal iBD = new BigDecimal("0.1"); iBD.compareTo(sumOfMoney) <= 0; iBD = iBD.add(divisor)) {
            System.out.println("There are some nails with the price " +
                    numberFormat.format(pricesOfNails[iBD.divide(divisor).intValue() - 1] = iBD));
        }
        for (BigDecimal priceOfNail : pricesOfNails) {
            System.out.println("The nail " + numberFormat.format(priceOfNail) + " per 1: \n" +
                    sumOfMoney.divideAndRemainder(priceOfNail)[0] + " items bought. \nMoney left over: " +
                    numberFormat.format(sumOfMoney.divideAndRemainder(priceOfNail)[1]) + "\n");
        }
    }
}
