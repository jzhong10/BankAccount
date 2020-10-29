public class BankTester {
    public static void main(String[] args) {
      BankAccount a1 = new BankAccount(1234, "easy");
      BankAccount b1 = new BankAccount(1234, "a2");

    //  System.out.println(a1.getPassword());
      a1.setPassword("strong");

    //  System.out.println(a1.getPassword());

      System.out.println(a1.getBalance());
      System.out.println(a1.getAccountID());

      System.out.println();

      System.out.println(a1.deposit(100.28));
      System.out.println(a1.getBalance());
      System.out.println(a1.withdraw(100.01));
      System.out.println(a1.getBalance());
      System.out.println(a1.withdraw(100000));
      System.out.println(a1.deposit(-101.2));

      System.out.println(a1.toString());
      System.out.println(a1.authenticate("strong"));
      System.out.println(a1.authenticate("weak"));

      a1.deposit(1000);
      System.out.println(a1.getBalance());
      System.out.println(a1.transferTo(b1, 100, "strong"));
      System.out.println(a1.getBalance());
      System.out.println(b1.getBalance());
      System.out.println();
      System.out.println(a1.transferTo(b1, -200, "strong"));
      System.out.println(a1.getBalance());
      System.out.println(b1.getBalance());

      System.out.println(a1.transferTo(b1, 200, "weak"));
      System.out.println(a1.getBalance());
      System.out.println(b1.getBalance());
    }
}
