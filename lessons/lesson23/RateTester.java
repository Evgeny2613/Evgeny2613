package lessons.lesson23;

import com.google.gson.Gson;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class RateTester {
    public static void main(String[] args) throws IOException {
        // https://api.frankfurter.app/latest?amount=10&from=EUR&to=USD
        //{"amount":10.0,"base":"EUR","date":"2022-11-18","rates":{"USD":10.366}}

        Rate rate = getRate(100, "EUR", "GBP");
        System.out.println(rate);

    }

    public static Rate getRate(int amount, String from, String to) throws IOException {
        String urlString = "https://api.frankfurter.app/latest?amount="+ amount + "&from=" + from + "&to=" + to;
        URL url = new URL(urlString);

        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
        InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        Gson gson = new Gson();
        Rate rate = gson.fromJson(bufferedReader, Rate.class);

        return rate;
    }
}
