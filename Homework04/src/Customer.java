import java.util.ArrayList;
import java.util.List;

import Data.BankAccount;
import Data.Ticket;
import Data.User;

public class Customer extends User {
    private List<Ticket> tickets;

    public Customer(int id, String userName, int hashPassword, BankAccount account) {
        super(id, userName, hashPassword, account);
        this.tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    public Ticket refundTicket(int index) {
        Ticket ticket = this.tickets.get(index);
        this.tickets.remove(index);
        return ticket;
    }

}
