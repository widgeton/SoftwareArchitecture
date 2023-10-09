package DIP;

import ISP.Gadget;

public class Store {
    private Repository repository;
    public Store(Repository repository){
        this.repository = repository;
    }

    public Gadget sell(int index){
        return repository.takeGadget(index);
    }

    public void refund(Gadget gadget){
        this.repository.putGadget(gadget);
    }
}
