public class BankTester {
    public static void main(String[] args) {
      BankAccount a1 = new BankAccount(1234, "easy");

    //  System.out.println(a1.getPassword());
      a1.setPassword("strong");

    //  System.out.println(a1.getPassword());

      System.out.println(a1.getBalance());
      System.out.println(a1.getAccountID());

      System.out.println();

      a1.deposit(100.28);
      System.out.println(a1.getBalance());
      a1.withdraw(100.01);
      System.out.println(a1.getBalance());


      System.out.println(a1.toString());
    }
}
