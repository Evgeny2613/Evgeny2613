package lessons.lesson23;

import java.util.Map;

// {"amount":10.0,"base":"EUR","date":"2022-11-18","rates":{"USD":10.366}}
public class Rate {
    public double amount;
    public String base;
    public String date;
    public Map<String, Double> rates;


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
