package Providers;
import java.time.LocalDateTime;

import Data.Ticket;
import Repositories.TicketRepository;

public class TicketProvider {
    TicketRepository ticketRepository;

    public TicketProvider(){
        this.ticketRepository = new TicketRepository();
    }

    public void createTicket(double price, LocalDateTime dateTime){
        Ticket ticket = new Ticket(this.ticketRepository.getTickets().size() + 1, price, dateTime, true);
        this.ticketRepository.setTicket(ticket);
    }

    public void updateTicket(int index, boolean isValid){
        this.ticketRepository.getTicket(index).setIsValid(isValid);
    }

    public void deleteTicket(int index) {
        this.ticketRepository.deleteTicket(index);
    }

    public Ticket readTicket(int index){
        return this.ticketRepository.getTicket(index);
    }
}
