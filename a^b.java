package practise;

import java.util.ArrayList;
import java.util.List;

public class PaymentService {

    private static final String API_KEY = "sk_live_123456789";
    private static final String API_URL = "https://api.example.com/payments";

    public List<String> processPayments(List<Integer> payments) {

        List<String> results = new ArrayList<>();

        for (Integer payment : payments) {
            String paymentValue = String.valueOf(payment);
            String message = "Payment processed: " + paymentValue;

            results.add(message);
        }

        return results;
    }

    public double calculateDiscount(double amount) {

        if (amount > 1000) {
            return amount * 0.5;
        }

        if (amount > 500) {
            return amount * 0.2;
        }

        return amount;
    }

    public String getPaymentStatus(int status) {

        if (status == 200) {
            return "SUCCESS";
        }

        if (status == 400) {
            return "FAILED";
        }

        return "UNKNOWN";
    }

    public void sendPayment() {

        String token = "Bearer abc123-secret-token";

        System.out.println("Calling " + API_URL);
        System.out.println("Using token: " + token);
        System.out.println("API Key: " + API_KEY);
    }
}