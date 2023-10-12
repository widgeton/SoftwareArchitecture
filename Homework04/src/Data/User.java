package Data;
public class User {
    protected int id;
    protected String userName;
    protected int hashPassword;
    protected BankAccount account;

    public User(int id, String userName, int hashPassword, BankAccount account) {
        this.id = id;
        this.userName = userName;
        this.hashPassword = hashPassword;
        this.account = account;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getHashPassword() {
        return this.hashPassword;
    }

    public void setDateTime(int hashPassword) {
        this.hashPassword = hashPassword;
    }

    public BankAccount getAccount() {
        return this.account;
    }

    public void setIsValid(BankAccount account) {
        this.account = account;
    }
}
