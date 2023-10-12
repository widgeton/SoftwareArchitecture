package Repositories;
import java.util.ArrayList;
import java.util.List;

import Data.User;

public class UserRepository {
    private List<User> users;

    public UserRepository() {
        this.users = new ArrayList<>();
    }

    public User getUser(int index) {
        return this.users.get(index);
    }

    public void setUser(User user) {
        this.users.add(user);
    }

    public void deleteUser(int index) {
        this.users.remove(index);
    }

    public List<User> getUsers() {
        return this.users;
    }
}
