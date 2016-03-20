package com.itrex.utils;

import java.text.DateFormatSymbols;

/**
 * Author: nikolai.pashkevich.
 */
public class DateFormatHelper {

    private static final String[] shortMonths = { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" };

    public static DateFormatSymbols getDateFormatSymbols() {
        DateFormatSymbols symbols = new DateFormatSymbols();
        symbols.setShortMonths(shortMonths);
        return symbols;
    }
}
