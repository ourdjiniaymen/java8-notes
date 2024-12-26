package utils;

import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private double amount;
    private boolean success;
    private TransactionType type;
    private LocalDateTime timestamp;

    public Transaction(String id, double amount, boolean success) {
        this.id = id;
        this.amount = amount;
        this.success = success;
    }

    public Transaction(double amount, boolean success, TransactionType type, LocalDateTime timestamp) {
        this.amount = amount;
        this.success = success;
        this.type = type;
        this.timestamp = timestamp;
    }

    public double getAmount() {
        return amount;
    }


    public boolean isSuccess() {
        return success;
    }


    public TransactionType getType() {
        return type;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", success=" + success +
                '}';
    }
}
