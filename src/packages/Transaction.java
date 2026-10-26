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

    public String toString() {
        DateTimeFormatter time = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String formattedTime = this.time_stamp.format(time);
        String transactionType = "Type = " + this.type;
        String transactionAmount = "Amount = " + this.amount;
        String transactionTime = "Time_stamp = " + formattedTime; 
        return "[Transaction [" + transactionType + ", " + transactionAmount + ", " + transactionTime + "]...]";
        //[Transaction [type=Deposit, amount=1000.125, time_stamp=2026-06-10 09:41]...]
    }
}
