import java.util.*;
import java.util.stream.Collectors;

public class TransactionApp {

    // Transaction class
    static class Transaction {
        String customerId;
        String productId;
        double amount;

        public Transaction(String customerId, String productId, double amount) {
            this.customerId = customerId;
            this.productId = productId;
            this.amount = amount;
        }

        public String getCustomerId() {
            return customerId;
        }

        public double getAmount() {
            return amount;
        }
    }

    // Method to aggregate total purchase amount per customer
    public static Map<String, Double> getTotalAmountPerCustomer(List<Transaction> transactions) {
        return transactions.stream()
                .collect(Collectors.groupingBy(
                        Transaction::getCustomerId,
                        Collectors.summingDouble(Transaction::getAmount)));
    }

    // Example usage in main
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("C001", "P100", 50.0),
                new Transaction("C002", "P101", 30.0),
                new Transaction("C001", "P102", 20.0));
        Map<String, Double> totals = getTotalAmountPerCustomer(transactions);
        System.out.println(totals); // Output: {C001=70.0, C002=30.0}
    }
}