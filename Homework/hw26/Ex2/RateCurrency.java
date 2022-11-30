package Homework.hw26.Ex2;

// {"amount":10.0,"base":"EUR","date":"2022-11-18","rates":{"USD":10.366}}

import java.util.Map;

public class RateCurrency {
    private double amount;
    private String base;
    private String date;
    private Map<String, Double> rates;

    public RateCurrency(double amount, String base, String date, Map<String, Double> rates) {
        this.amount = amount;
        this.base = base;
        this.date = date;
        this.rates = rates;
    }


    public double getAmount() {
        return amount;
    }

    public String getBase() {
        return base;
    }

    public String getDate() {
        return date;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "amount=" + amount +
                ", base='" + base + '\'' +
                ", date='" + date + '\'' +
                ", rates=" + rates +
                '}';
    }

}
