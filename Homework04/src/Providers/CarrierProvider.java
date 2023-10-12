package Providers;

import java.util.List;

import Data.BankAccount;
import Data.Carrier;
import Repositories.CarrierRepository;

public class CarrierProvider {
    CarrierRepository carrierRepository;

    public CarrierProvider(){
        this.carrierRepository = new CarrierRepository();
    }

    public void createCarrier(List<String> routes, BankAccount account){
        Carrier carrier = new Carrier(this.carrierRepository.getCarriers().size() + 1, routes, account);
        this.carrierRepository.setCarrier(carrier);
    }

    public void updateCarrier(int index, String route){
        this.carrierRepository.getCarrier(index).addRoute(route);
    }

    public void deleteCarrier(int index){
        this.carrierRepository.deleteCarrier(index);
    }

    public Carrier readCarrier(int index){
        return this.carrierRepository.getCarrier(index);
    }

}
