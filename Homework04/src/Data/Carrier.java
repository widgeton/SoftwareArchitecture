package Data;

import java.util.List;

public class Carrier {
    private int id;
    private List<String> routes;
    private BankAccount account;

    public Carrier(int id, List<String> routes, BankAccount account) {
        this.id = id;
        this.routes = routes;
        this.account = account;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public BankAccount geAccount(){
        return this.account;
    }

    public void setAccount(BankAccount account){
        this.account = account;
    }

    public void addRoute(String route){
        this.routes.add(route);
    }

    public void deleteRoute(int index){
        this.routes.remove(index);
    }
}
