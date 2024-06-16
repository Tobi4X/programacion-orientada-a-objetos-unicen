package Logic;

public class User {
    private String name, lastName, username, pass, email, phoneNumber, bankAccount;
    private double balance, balanceToWithdraw;
    private boolean isAdmin;
    private Direccion direcccion;

    public User(String name, String lastName, String username, String pass, String email, String phoneNumber, String bankAccount, double balance, double balanceToWithdraw, boolean isAdmin, Direccion direcccion) {
        this.name = name;
        this.lastName = lastName;
        this.username = username;
        this.pass = pass;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.bankAccount = bankAccount;
        this.balance = balance;
        this.balanceToWithdraw = balance;
        this.isAdmin = isAdmin;
        this.direcccion = direcccion;
    }
    
    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public Direccion getDirecccion() {
        return direcccion;
    }

    public void setDirecccion(Direccion direcccion) {
        this.direcccion = direcccion;
    }

    @Override
    public String toString() {
        return "User{" +
                "name=" + name +
                ", lastName=" + lastName +
                ", username=" + username +
                ", pass=" + pass +
                ", email=" + email +
                ", phoneNumber=" + phoneNumber +
                ", bankAccount=" + bankAccount +
                ", balance=" + balance +
                ", isAdmin=" + isAdmin +
                ", direcccion=" + direcccion +
                '}';
    }
}
