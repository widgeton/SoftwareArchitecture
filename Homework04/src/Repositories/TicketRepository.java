package Repositories;
import java.util.ArrayList;
import java.util.List;

import Data.Ticket;

public class TicketRepository {
    private List<Ticket> tickets;

    public TicketRepository() {
        this.tickets = new ArrayList<>();
    }

    public Ticket getTicket(int index) {
        return this.tickets.get(index);
    }

    public void setTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    public void deleteTicket(int index){
        this.tickets.remove(index);
    }

    public List<Ticket> getTickets() {
        return this.tickets;
    }
}
