public class BankAccount {

    private double balance;
    private int accountID;
    private String password;

    //Constructor
    public BankAccount(int id, String p) {
      balance = 0;
      accountID = id;
      password = p;
    }

    //get methods()
    public double getBalance() {
      return balance;
    }

    public int getAccountID() {
      return accountID;
    }

    /* testing method for setPassword
    public String getPassword() {
      return password;
    }
    */

    public void setPassword(String newPass) {
      password = newPass;
    }

    public boolean deposit(double amount) {
      if (amount >= 0) {
        balance += amount;
        return true;
      }
      return false;
    }

    public boolean withdraw(double amount) {
      if (amount < 0 || amount > balance) {
        return false;
      }
      balance-=amount;
      return true;
    }
    
}
