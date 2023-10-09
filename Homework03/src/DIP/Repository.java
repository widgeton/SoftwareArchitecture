package DIP;

import java.util.ArrayList;
import java.util.List;

import ISP.Gadget;

public class Repository {
    private List<Gadget> gadgets;

    public Repository() {
        this.gadgets = new ArrayList<>();
    }

    public void putGadget(Gadget gadget) {
        this.gadgets.add(gadget);
    }

    public Gadget takeGadget(int index) {
        return this.gadgets.get(index);
    }

    public void checkCharge(int index){
        this.gadgets.get(index).charge();
    }
}
