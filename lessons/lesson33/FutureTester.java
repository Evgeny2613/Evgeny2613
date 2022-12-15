package lessons.lesson33;

import lessons.lesson23.Rate;
import lessons.lesson23.RateTester;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class FutureTester {
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        Rate usd2Eur = RateTester.getRate(100, "USD", "EUR");

        Rate eur2Gbp = RateTester.getRate(usd2Eur.rates.get("EUR").intValue(), "EUR", "GBP");
        System.out.println(eur2Gbp);

//        new Thread() {
//            @Override
//            public void run() {
//                try {
//                    Rate usd2Eur = RateTester.getRate(100, "USD", "EUR");
//                    new Thread() {
//                        @Override
//                        public void run() {
//                            try {
//                                Rate eur2Gbp = RateTester.getRate(usd2Eur.rates.get("EUR").intValue(), "EUR", "GBP");
//                            } catch (Exception e){}
//                        }
//                        }.start();
//                    } catch(IOException e){}
//                }
//            }.start();

        CompletableFuture<Rate> usdToEur = CompletableFuture.supplyAsync(
                () -> {
                    try {
                        return RateTester.getRate(100, "USD", "EUR");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
        ).thenApplyAsync(
                rate -> {
                    try {
                        return RateTester.getRate(rate.rates.get("EUR").intValue(), "EUR", "GBP");
                    } catch (IOException e) {
                        throw new RuntimeException();
                    }

                }
        );

        System.out.println(usdToEur.get());
    }
}
