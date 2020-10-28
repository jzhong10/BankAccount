public class BankTester {
    public static void main(String[] args) {
      BankAccount a1 = new BankAccount(1234, "easy");
      int x = 0;
      int y = 0;
      if (args.length == 1) {
        x = Integer.parseInt(args[0]);
      } else if (args.length == 2) {
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
      }

    //  System.out.println(a1.getPassword());
      a1.setPassword("strong");

    //  System.out.println(a1.getPassword());
      System.out.println(a1.getBalance());
      System.out.println(a1.getAccountID());

      System.out.println();

      a1.deposit(100);
      System.out.println(a1.getBalance());
      a1.withdraw(50);
      System.out.println(a1.getBalance());
      a1.withdraw(x);
      System.out.println(a1.getBalance());
      System.out.println(x);
    }
}
