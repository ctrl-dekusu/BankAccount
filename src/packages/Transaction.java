package packages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    public String type;
    public double amount;
    public LocalDateTime time_stamp;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.time_stamp = LocalDateTime.now();
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getTimeStamp() {
        return time_stamp;
    }

    public String toString() {
        DateTimeFormatter timeFormatter = DateTimeFormatter
                                        .ofPattern("dd-MM-yyyy HH:mm");
        return String
            .format("[Transaction [Type = %s, Amount = %.2f, Time_stamp = %s]]",
            type, amount, time_stamp.format(timeFormatter));
    }
}
