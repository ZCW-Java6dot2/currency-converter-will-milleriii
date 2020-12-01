package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {

        //need (currency / universal) = val 1
        // (currency2 / universal) = val 2
        // return val 1 / val 2
        Double val1 = currencyType.getRate();
        Double val2 = this.getCurrencyType().getRate();
        return val1 / val2;
    }

    CurrencyType getCurrencyType();


}
