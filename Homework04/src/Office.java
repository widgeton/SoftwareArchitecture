import Data.Ticket;
import Providers.CarrierProvider;
import Providers.CashProvider;
import Providers.TicketProvider;
import Providers.UserProvider;

public class Office {
    TicketProvider ticketProvider;
    UserProvider userProvider;
    CarrierProvider carrierProvider;
    CashProvider cashProvider;

    public Office(){
        this.ticketProvider = new TicketProvider();
        this.userProvider = new UserProvider();
        this.carrierProvider = new CarrierProvider();
        this.cashProvider = new CashProvider();
    }

    public void saleTicket(Customer customer, int index) {
        Ticket ticket = this.ticketProvider.readTicket(index);
        double restBalance = this.cashProvider.readAccount(customer.getAccount().getCardNumber()).getBalance() - ticket.getPrice();
        if (restBalance >= 0) {
            customer.getAccount().setBalance(restBalance);
            customer.addTicket(ticket);
        } else {
            throw new RuntimeException("Imposible to buy the ticket");
        }
    }

    public void refundTicket(Customer customer, int index) {
        Ticket ticket = customer.refundTicket(index);
        customer.getAccount().setBalance(customer.getAccount().getBalance() + ticket.getPrice());
        this.ticketProvider.createTicket(ticket.getPrice(), ticket.getDateTime());
    }
}
