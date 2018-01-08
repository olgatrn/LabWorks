package labwork.block2.theme18.lw03;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        BigInteger bI = new BigInteger("2430000000000");
        double d = 0.002;
        Locale[] locales = {new Locale("ru", "RU"),
                new Locale("chi", "CHI"),
                new Locale("it", "IT")};

        for (Locale locale : locales) {
            NumberFormat numberFormat = NumberFormat.getInstance(locale);
            NumberFormat numberFormatCurrency = NumberFormat.getCurrencyInstance(locale);
            DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
            System.out.println("Current Locale: " + locale.getDisplayLanguage() + " (" + locale.getDisplayCountry() + ")\n" +
                    "Integer: " + numberFormat.format(bI) +
                    "\nDouble: " + numberFormat.format(d) +
                    "\nCurrency: " + numberFormatCurrency.getCurrency() + ": " + numberFormatCurrency.format(bI) +
                    "\nDate: " + dateFormat.format(new Date()) + "\n");
        }
    }
}
