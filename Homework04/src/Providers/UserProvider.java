package Providers;
import Data.BankAccount;
import Data.User;
import Repositories.UserRepository;

public class UserProvider {
    UserRepository userRepository;

    public UserProvider() {
        this.userRepository = new UserRepository();
    }

    public void createUser(String userName, int hashPassword, BankAccount account) {
        User user = new User(this.userRepository.getUsers().size() + 1, userName, hashPassword, account);
        this.userRepository.setUser(user);
    }

    public void updateUser(int index, String userName) {
        this.userRepository.getUser(index).setUserName(userName);
    }

    public void deleteUser(int index) {
        this.userRepository.deleteUser(index);
    }

    public User readUser(int index) {
        return this.userRepository.getUser(index);
    }
}
