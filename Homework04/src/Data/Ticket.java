package Data;
import java.time.LocalDateTime;

public class Ticket {
    private int id;
    private double price;
    private LocalDateTime dateTime;
    private boolean isValid;

    public Ticket(int id, double price, LocalDateTime dateTime, boolean isValid) {
        this.id = id;
        this.price = price;
        this.dateTime = dateTime;
        this.isValid = isValid;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public boolean getIsValid() {
        return this.isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }
}
