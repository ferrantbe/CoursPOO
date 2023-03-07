package be.ephec.java.cours06.compteBelge;

import java.math.BigInteger;
import java.util.Locale;

public class TestModuloIban {
    private static final BigInteger V_97 = new BigInteger("97");

    public static void main(String[] args) {
        System.out.println(new TestModuloIban().isValidIban("ch10 0023 00101 0235 0260 1"));
        System.out.println(new TestModuloIban().isValidIban("be87 1776 0244 7224"));
    }
    public static boolean isValidIban(String iban) {

        String transformedIban = transformIban(iban);

        BigInteger bi = new BigInteger(transformedIban);
        // System.out.println(bi.mod(V_97));

        return bi.mod(V_97).intValue() == 1;
    }

    private static String transformIban(String iban) {
        // System.out.println(iban);
        // iban = "ch10 0023 00101 0235 0260 1"
        iban = removeNonAlphaNumericChars(iban);

        // System.out.println(iban);
        // iban = "ch10002300101023502601"
        iban = convertToCapitals(iban);

        // System.out.println(iban);
        // iban = "CH10002300101023502601"
        iban = transformAlphaCharsToNumbers(iban);

        //System.out.println(iban);
        // iban = "121710002300101023502601"
        iban = move6FirstCharsToEnd(iban);

        // System.out.println(iban);
        return iban;
    }

    private static String move6FirstCharsToEnd(String iban) {
        return iban.substring(6) + iban.substring(0, 6);
    }

    private static String transformAlphaCharsToNumbers(String iban) {
        StringBuffer sb = new StringBuffer();
        for (char c : iban.toCharArray())
            if (c >= 'A' && c <= 'Z')
                sb.append((int) c - 55);
            else
                sb.append(c);
        return sb.toString();
    }

    private static String convertToCapitals(String iban) {
        return iban.toUpperCase(Locale.ROOT);
    }

    private static String removeNonAlphaNumericChars(String iban) {
        iban = iban.replaceAll("[^a-zA-Z0-9]", "");
        return iban;
    }

}
