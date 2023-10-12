package Repositories;

import java.util.ArrayList;
import java.util.List;

import Data.Carrier;

public class CarrierRepository {
    private List<Carrier> carriers;

    public CarrierRepository() {
        this.carriers = new ArrayList<>();
    }

    public Carrier getCarrier(int index) {
        return this.carriers.get(index);
    }

    public void setCarrier(Carrier carrier) {
        this.carriers.add(carrier);
    }

    public void deleteCarrier(int index) {
        this.carriers.remove(index);
    }

    public List<Carrier> getCarriers() {
        return this.carriers;
    }
}
