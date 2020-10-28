public class BankTester {
    public static void main(String[] args) {
      BankAccount a1 = new BankAccount(1234, "easy");
      System.out.println(a1.getPassword());
      a1.setPassword("strong");
      System.out.println(a1.getPassword());
      System.out.println(a1.getBalance());
      System.out.println(a1.getAccountID());
    }
}
